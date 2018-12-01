package com.igeek.filter3;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

// HttpServletRequestWrapper	װ��������	�㶨
public class MyRequest extends HttpServletRequestWrapper {

	private HttpServletRequest request;
	// ����һ����� ���Ʊ���Ĵ��� ִֻ��һ��
	private boolean flag = false;	// ת���ʱ��ֻ��Ҫת��һ�� false��ʾ��û��ת��
	
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		// ��ʹ���ǻ����getParameterMap ��������ת��
		String[] values = this.getParameterValues(name);
		if(values != null){
			// ����name�õ��Ķ��ǵ�����ֵ
			return values[0];
		}
		// ������ȥ���ø����еķ���
		return super.getParameter(name);
	}

	@Override
	public Map<String, String[]> getParameterMap() {
		
		// ��ȡ����ʽ�����ݲ�ͬ��ʽ��������
		String method = request.getMethod();	// �������ʽ	post get
		
		if(method.equalsIgnoreCase("post")){
			try {
				request.setCharacterEncoding("utf-8");
				// �������±���֮���map����	ok
				return request.getParameterMap();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return request.getParameterMap();
			}
		}else if(method.equalsIgnoreCase("get")){
			// get
			// �����е����������ȡ����	Ȼ��һ��һ���Ĵ�������
			Map<String, String[]> map = request.getParameterMap();
			// ��ο��Ʊ��� ����ִֻ��һ��
			// flag Ĭ����false ��������ִ��
			// flag �ڶ���ִ�� true ֱ�ӽ��� ����ִ��
			if(flag){
				return map;
			}
			// ����map���ϻ�ȡ����
			if(map != null){
				// keySet(); ��ǰ̨���ݹ���������name����	��ɵ�Set����
				for(String key : map.keySet()){
					// ����key �õ���Ӧ�� value name="mm,yy,zz" age="18"
					String[] values = map.get(key);
					if(values != null){
						// 
						for(int i = 0; i < values.length; i++ ){
							
							try {
								String string = new String(values[i].getBytes("iso-8859-1"),"utf-8");
								values[i] = string;
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
								// ������쳣��ϣ����ߣ���û��ѭ���������ݣ�������������
								// ������ǰѭ����������һ��ѭ��
								continue;
							}
						}
					}
				}
			}
			// true �Ѿ�ת�����
			flag = true;
			// ת����֮���map��������
			return map;
		}else{
			return super.getParameterMap();
		}
	}

	@Override
	public String[] getParameterValues(String name) {
		// �ȵ�����һ������ ����ת��
		Map<String,String[]> map = this.getParameterMap();
		if(map != null){
			// ���ݴ����name ��ת��֮��� map �е�value[] ȡ����
			String[] values = map.get(name);
			// ����ת��֮���ֵ
			return values;
		}
		// ���˵��������������	��ȥ���ø����еķ���
		return super.getParameterValues(name);
	}
	
	

}
