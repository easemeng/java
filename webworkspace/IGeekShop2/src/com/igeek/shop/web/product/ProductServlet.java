package com.igeek.shop.web.product;

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
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.igeek.shop.service.admin.AdminService;
import com.igeek.shop.service.product.ProductService;
import com.igeek.shop.service.product.ProductServiceImpl;
import com.igeek.common.utils.StringUtils;
import com.igeek.shop.entity.*;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductService pros = new ProductServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String state = request.getParameter("state");
		if(state.equals("getProductList")){
			this.getProductList(request,response);
		}else if(state.equals("delete")){
			this.delete(request,response);
		}else if(state.equals("addProduct")){
			this.addProduct(request,response);
		}else if(state.equals("queryCategory")){
			this.queryCategory(request,response);
		}else if(state.equals("updateOne")){
			this.updateOne(request,response);
		}else if(state.equals("updateProduct")){
			this.updateProduct(request,response);
		}
		
	}

	private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try {
			
			String pid = request.getParameter("pid");
			String pimage = request.getParameter("pimage");
			
			// 创建一个 磁盘文件项目工厂 对象
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 指定一个临时目录(缓冲区) this.getServletContext().getRealPath()
			// application对象中的方法
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if (!file.exists()) {
				file.mkdirs(); // 不存在就创建临时路径
			}
			// 设置缓冲区大小
			factory.setSizeThreshold(1024 * 1024);
			factory.setRepository(file); 
			// 指定缓冲区的位置
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 处理上传之后的文件乱码
			upload.setHeaderEncoding("utf-8");
			// isMultipartContent 判断 当前请求的类型 到底是一个文件上传 还是一个普通的表单提交 。

			// 创建一个Map集合 用来存储 循环遍历数据的名值对儿
			Map<String, String> map = new HashMap<String, String>();

			List<FileItem> fileItemList = upload.parseRequest(request);
			
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){	// 判断是否是一个普通的表单元素
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					// 拿到需要上传的文件名
					String fileName = fileItem.getName();
					if(fileName.equals("")){
						fileName=pimage;
						map.put(filedName, fileName);
					}else{
						// 通过输入流表示拿到的数据
						InputStream input = fileItem.getInputStream();
						// 拿到要上传的位置
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File(path + "/" + fileName));
						// 把输入的内容(其实就是你要上传的文件，写入到指定位置)
						fileItem.write(new File("E:\\webworkspace\\IGeekShop\\WebContent\\products\\1\\" + fileName));
						// 拼接上文件名还有后缀
						// 写完之后需要直到文件上传到什么位置了
						map.put(filedName, "products/" + fileName);
						input.close();	// 关闭流
						fileItem.delete();	// 清空缓冲区中的临时文件
					}
				}
			}
			Product pro = new Product();
			BeanUtils.populate(pro, map);
			pro.setPid(pid);
			pro.setPdate(StringUtils.getDate());
			pros.updateProduct(pro);
			getProductList(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		Product product = pros.updateOne(pid);
		request.setAttribute("product", product);
		queryCategorys(request,response);
		request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
		
	}

	private void queryCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		queryCategorys(request,response);
		request.getRequestDispatcher("/admin/product/add.jsp").forward(request, response);
		
	}

	private void addProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// 创建一个 磁盘文件项目工厂 对象
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 指定一个临时目录(缓冲区) this.getServletContext().getRealPath()
			// application对象中的方法
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if (!file.exists()) {
				file.mkdirs(); // 不存在就创建临时路径
			}
			// 设置缓冲区大小
			factory.setSizeThreshold(1024 * 1024);
			factory.setRepository(file); 
			// 指定缓冲区的位置
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 处理上传之后的文件乱码
			upload.setHeaderEncoding("utf-8");
			// isMultipartContent 判断 当前请求的类型 到底是一个文件上传 还是一个普通的表单提交 。

			// 创建一个Map集合 用来存储 循环遍历数据的名值对儿
			Map<String, String> map = new HashMap<String, String>();

			List<FileItem> fileItemList = upload.parseRequest(request);
			
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){	// 判断是否是一个普通的表单元素
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					// 拿到需要上传的文件名
					String fileName = fileItem.getName();
					if (!fileName.equals("")) {
						// 通过输入流表示拿到的数据
						InputStream input = fileItem.getInputStream();
						// 拿到要上传的位置
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File(path + "/" + fileName));
						// 把输入的内容(其实就是你要上传的文件，写入到指定位置)
						fileItem.write(new File("E:\\webworkspace\\IGeekShop\\WebContent\\products\\1\\" + fileName));
						// 拼接上文件名还有后缀
						// 写完之后需要直到文件上传到什么位置了
						map.put(filedName, "products/" + fileName);
						input.close(); // 关闭流
						fileItem.delete(); // 清空缓冲区中的临时文件
					}
				}
			}
			Product pro = new Product();
			BeanUtils.populate(pro, map);
			pro.setPid(StringUtils.getUUID());
			pro.setPflag(0);
			pro.setPdate(StringUtils.getDate());
			pros.addProduct(pro);
			getProductList(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		pros.delete(pid);
		getProductList(request,response);
		
	}

	protected void getProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Product> productList = pros.getProductList();
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/admin/product/list.jsp").forward(request, response);
		
	}
	
	private void queryCategorys(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AdminService service = new AdminService();
		List<Category> CategoryList = service.getCategorys();
		request.setAttribute("CategoryList", CategoryList);

	}

}
