package com.igeek.shop.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.igeek.common.StringUtils;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Product;
import com.igeek.shop.service.adminProduct.AdminProductService;
import com.igeek.shop.service.adminProduct.AdminProductServiceImpl;

public class AdminProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminProductService aps = new AdminProductServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String state = request.getParameter("state");
		if(state.equals("getProductList")){
			this.getProductList(request,response);
		}else if(state.equals("queryCategory")){
			this.queryCategory(request,response);
		}else if(state.equals("addProduct")){
			this.addProduct(request,response);
		}else if(state.equals("delete")){
			this.delete(request,response);
		}else if(state.equals("zapisa")){
			this.zapisa(request,response);
		}else if(state.equals("update")){
			this.update(request,response);
		}
		
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		String pimage = request.getParameter("pimage");
		
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if(!file.exists()){
				file.mkdirs();
			}
			factory.setSizeThreshold(1024*1024);
			factory.setRepository(file);
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("utf-8");
			Map<String,String> map = new HashMap<String,String>();
			List<FileItem> fileItemList = upload.parseRequest(request);
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					String fileName = fileItem.getName();
					if(fileName.equals("")){
						fileName = pimage;
						map.put(filedName, fileName);
					}else{
						InputStream input = fileItem.getInputStream();
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File("E:\\webworkspace\\Shop\\WebContent\\products\\1\\" + fileName));
						map.put(filedName, "products/" + fileName);
						input.close();
						fileItem.delete();
					}
				}
			}
			Product pro = new Product();
			BeanUtils.populate(pro, map);
			pro.setPid(pid);
			pro.setPflag(0);
			pro.setPdate(StringUtils.getDate());
			aps.updateProduct(pro);
			getProductList(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void zapisa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		Product product = aps.zapisa(pid);
		request.setAttribute("product", product);
		queryCategorys(request, response);
		request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
		
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		aps.delete(pid);
		getProductList(request,response);
		
	}

	private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if(!file.exists()){
				file.mkdirs();
			}
			factory.setSizeThreshold(1024*1024);
			factory.setRepository(file);
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("utf-8");
			Map<String,String> map = new HashMap<String,String>();
			List<FileItem> fileItemList = upload.parseRequest(request);
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					String fileName = fileItem.getName();
					if(!fileName.equals("")){
						InputStream input = fileItem.getInputStream();
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File("E:\\webworkspace\\Shop\\WebContent\\products\\1\\" + fileName));
						map.put(filedName, "products/" + fileName);
						input.close();
						fileItem.delete();
					}
				}
			}
			Product pro = new Product();
			BeanUtils.populate(pro, map);
			pro.setPid(StringUtils.getUUID());
			pro.setPflag(0);
			pro.setPdate(StringUtils.getDate());
			aps.addProduct(pro);
			getProductList(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void queryCategory(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		queryCategorys(request, response);
		request.getRequestDispatcher("/admin/product/add.jsp").forward(request, response);

	}

	private void queryCategorys(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Category> categoryList = aps.getCategoryList();
		request.setAttribute("categoryList", categoryList);

	}

	protected void getProductList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Product> productList = aps.getProductList();
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/admin/product/list.jsp").forward(request, response);

	}

}
