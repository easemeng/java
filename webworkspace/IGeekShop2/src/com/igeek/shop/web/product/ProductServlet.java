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
			
			// ����һ�� �����ļ���Ŀ���� ����
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// ָ��һ����ʱĿ¼(������) this.getServletContext().getRealPath()
			// application�����еķ���
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if (!file.exists()) {
				file.mkdirs(); // �����ھʹ�����ʱ·��
			}
			// ���û�������С
			factory.setSizeThreshold(1024 * 1024);
			factory.setRepository(file); 
			// ָ����������λ��
			ServletFileUpload upload = new ServletFileUpload(factory);
			// �����ϴ�֮����ļ�����
			upload.setHeaderEncoding("utf-8");
			// isMultipartContent �ж� ��ǰ��������� ������һ���ļ��ϴ� ����һ����ͨ�ı��ύ ��

			// ����һ��Map���� �����洢 ѭ���������ݵ���ֵ�Զ�
			Map<String, String> map = new HashMap<String, String>();

			List<FileItem> fileItemList = upload.parseRequest(request);
			
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){	// �ж��Ƿ���һ����ͨ�ı�Ԫ��
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					// �õ���Ҫ�ϴ����ļ���
					String fileName = fileItem.getName();
					if(fileName.equals("")){
						fileName=pimage;
						map.put(filedName, fileName);
					}else{
						// ͨ����������ʾ�õ�������
						InputStream input = fileItem.getInputStream();
						// �õ�Ҫ�ϴ���λ��
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File(path + "/" + fileName));
						// �����������(��ʵ������Ҫ�ϴ����ļ���д�뵽ָ��λ��)
						fileItem.write(new File("E:\\webworkspace\\IGeekShop\\WebContent\\products\\1\\" + fileName));
						// ƴ�����ļ������к�׺
						// д��֮����Ҫֱ���ļ��ϴ���ʲôλ����
						map.put(filedName, "products/" + fileName);
						input.close();	// �ر���
						fileItem.delete();	// ��ջ������е���ʱ�ļ�
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
			// ����һ�� �����ļ���Ŀ���� ����
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// ָ��һ����ʱĿ¼(������) this.getServletContext().getRealPath()
			// application�����еķ���
			String temp_path = this.getServletContext().getRealPath("temp");
			File file = new File(temp_path);
			if (!file.exists()) {
				file.mkdirs(); // �����ھʹ�����ʱ·��
			}
			// ���û�������С
			factory.setSizeThreshold(1024 * 1024);
			factory.setRepository(file); 
			// ָ����������λ��
			ServletFileUpload upload = new ServletFileUpload(factory);
			// �����ϴ�֮����ļ�����
			upload.setHeaderEncoding("utf-8");
			// isMultipartContent �ж� ��ǰ��������� ������һ���ļ��ϴ� ����һ����ͨ�ı��ύ ��

			// ����һ��Map���� �����洢 ѭ���������ݵ���ֵ�Զ�
			Map<String, String> map = new HashMap<String, String>();

			List<FileItem> fileItemList = upload.parseRequest(request);
			
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){	// �ж��Ƿ���һ����ͨ�ı�Ԫ��
					String filedName = fileItem.getFieldName();
					String filedValue = fileItem.getString("utf-8");
					map.put(filedName, filedValue);
				}else{
					String filedName = fileItem.getFieldName();
					// �õ���Ҫ�ϴ����ļ���
					String fileName = fileItem.getName();
					if (!fileName.equals("")) {
						// ͨ����������ʾ�õ�������
						InputStream input = fileItem.getInputStream();
						// �õ�Ҫ�ϴ���λ��
						String path = this.getServletContext().getRealPath("products");
						fileItem.write(new File(path + "/" + fileName));
						// �����������(��ʵ������Ҫ�ϴ����ļ���д�뵽ָ��λ��)
						fileItem.write(new File("E:\\webworkspace\\IGeekShop\\WebContent\\products\\1\\" + fileName));
						// ƴ�����ļ������к�׺
						// д��֮����Ҫֱ���ļ��ϴ���ʲôλ����
						map.put(filedName, "products/" + fileName);
						input.close(); // �ر���
						fileItem.delete(); // ��ջ������е���ʱ�ļ�
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
