package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.igeek.dao.BaseDao;
import com.igeek.domain.Area;

public class LinkageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String state = request.getParameter("state");
		if(state.equals("init")){
			this.initProvince(request, response);
		}else if(state.equals("city")){
			this.initCity(request, response);
		}else if(state.equals("area")){
			this.initArea(request, response);
		}
		
	}

	protected void initArea(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String cid = request.getParameter("cid");
		
		inits(cid,response);
		
/*		BaseDao<Area> dao = new BaseDao<Area>();
		// ��ѯ����ʡ��ֱϽ��
		String sql = "select * from area where area_parent_id = ?";
		Object[] params = {cid};
		Object list = dao.getList(sql, params, new Area());
		List<Area> areaList = (List<Area>) list;
		// areaList List Ƕ�� Area ��	ÿһ��Area ���� ������һ�����ݿ��е�����
		for (Area area : areaList) {
			System.out.println(area);
		}
		// json
		// ʹ�ù��� �Զ�����ѯ���ת����json��ʽ
		ObjectMapper mapper = new ObjectMapper();
		// ������ת����json��ʽ
		String json = mapper.writeValueAsString(areaList);
		// System.out.println(json);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json); //
*/
	}

	protected void initCity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pid = request.getParameter("pid");
		
		inits(pid,response);
		
/*		BaseDao<Area> dao = new BaseDao<Area>();
		// ��ѯ����ʡ��ֱϽ��
		String sql = "select * from area where area_parent_id = ?";
		Object[] params = {pid};
		Object list = dao.getList(sql, params, new Area());
		List<Area> areaList = (List<Area>) list;
		// areaList List Ƕ�� Area ��	ÿһ��Area ���� ������һ�����ݿ��е�����
		for (Area area : areaList) {
			System.out.println(area);
		}
		// json
		// ʹ�ù��� �Զ�����ѯ���ת����json��ʽ
		ObjectMapper mapper = new ObjectMapper();
		// ������ת����json��ʽ
		String json = mapper.writeValueAsString(areaList);
		// System.out.println(json);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
*/		
	}

	protected void initProvince(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		inits(0,response);
		
/*		BaseDao<Area> dao = new BaseDao<Area>();
		// ��ѯ����ʡ��ֱϽ��
		String sql = "select * from area where area_parent_id = ?";
		Object[] params = {0};
		Object list = dao.getList(sql, params, new Area());
		List<Area> areaList = (List<Area>) list;
		// areaList List Ƕ�� Area ��	ÿһ��Area ���� ������һ�����ݿ��е�����
		for (Area area : areaList) {
			System.out.println(area);
		}
		// json
		// ʹ�ù��� �Զ�����ѯ���ת����json��ʽ
		ObjectMapper mapper = new ObjectMapper();
		// ������ת����json��ʽ
		String json = mapper.writeValueAsString(areaList);
		// System.out.println(json);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
*/		
	}
	
	public void inits(Object n, HttpServletResponse response){
		
		BaseDao<Area> dao = new BaseDao<Area>();
		// ��ѯ����ʡ��ֱϽ��
		String sql = "select * from area where area_parent_id = ?";
		Object[] params = {n};
		Object list = dao.getList(sql, params, new Area());
		List<Area> areaList = (List<Area>) list;
		// areaList List Ƕ�� Area ��	ÿһ��Area ���� ������һ�����ݿ��е�����
		for (Area area : areaList) {
			System.out.println(area);
		}
		// json
		// ʹ�ù��� �Զ�����ѯ���ת����json��ʽ
		try {
			ObjectMapper mapper = new ObjectMapper();
			// ������ת����json��ʽ
			String json = mapper.writeValueAsString(areaList);
			// System.out.println(json);
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}