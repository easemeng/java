package com.igeek.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.impl.ITypeRequestor;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
    @Override
	public void destroy() {
		// super.destroy();
    	System.out.println("RegisterServlet�е�destroy����");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config);
		System.out.println("RegisterServlet�е�init����");
	}

	public RegisterServlet() {
        
    }

	/*
	 * ������ get ���� ����  post ���� �������service����
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		// ���ݱ���name����ֵ�����valueֵ 	.getParameter(String name)
		/*
		String loginName = request.getParameter("loginName");
		// getParameterValues(String name)	����Ҫ��ȡ��Ԫ���кܶ��ʱ��   ����һ���ַ�������
		String[] fruit = request.getParameterValues("fruit");
		String password = request.getParameter("password");
		
		String sex = request.getParameter("sex");
		
		String[] sel = request.getParameterValues("sel");
		
		String textArea = request.getParameter("textarea");
		
		// getParameter
		System.out.println(sex);
		
		System.out.println(loginName);
		// ע�⣺ ���鲻��ֱ�Ӳ��� ��Ҫ��ȥ����	���ߵ������鹤�����еķ���ȥ����
		System.out.println(Arrays.toString(sel));
		System.out.println(Arrays.toString(fruit));
		*/
		
		// �õ������㴫�ݱ����������ݵļ�ֵ�Զ��ļ���
		/*
		Map<String,String[]> parameterMap = request.getParameterMap();
		// ����Map
		Set<String> keyset = parameterMap.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			String[] values = parameterMap.get(key);
			System.out.println("key��ֵ��" + key + "\tvalue��ֵ��" + Arrays.toString(values));
		}
		*/
		
		// ͨ��ö�ٵķ�ʽ������е���������	��̫����
		// �˽�Ϳ���
		/*
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()){
			// �õ����е�ÿһ��name����ֵ
			String name = parameterNames.nextElement();
			String[] values = request.getParameterValues(name);
			System.out.println(name + "\t" +Arrays.toString(values));
		}
		*/
		
		Date date = new Date();
		date.toLocaleString();
		request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
	}

}
