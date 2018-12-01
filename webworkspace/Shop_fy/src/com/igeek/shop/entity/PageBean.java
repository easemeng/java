package com.igeek.shop.entity;

import java.util.List;

/**
 * 封装所有和分页有关的东西
 */

public class PageBean<T> {
	
	// 以下数据  需要直接传入
	/** 当前页 页数 */
	private int currentPageNumber;
	/** 每页显示的数据条数 */
	private int pageSize;
	/** 总记录数	(要查询的数据总条数) */
	private int totalDateNumber;
	
	
	// 以下数据需要通过计算得出
	/** 总页数 */
	private int totalPage;
	/** 每页查询的下标 */
	private int startIndex;
	/** 前台展示的数字板	start 从哪里开始 */
	private int start;
	/** end 从哪里结束 */
	private int end;

	
	// 需要手动传入的数据
	/** 前台需要展示的数据(直接就是带分页的数据展示) */
	private List<T> data;

	public PageBean(){
		
	}
	
	// 创建对象 初始化对象(给对象中的属性进行赋值)
	public PageBean(int currentPageNumber, int pageSize, int totalDateNumber) {
		this.currentPageNumber = currentPageNumber;
		this.pageSize = pageSize;
		this.totalDateNumber = totalDateNumber;
		
		// 如何计算总页数
		if(totalDateNumber % pageSize == 0){
			totalPage = totalDateNumber / pageSize;
		}else{
			totalPage = totalDateNumber / pageSize + 1;
		}
		
		// startIndex 计算跟当前页数的关系
		startIndex = (currentPageNumber - 1) * pageSize;
		
		start = 1;
		end = 5;
		
		if(totalPage <= 5){
			end = totalPage;
		}else {
			
			start = currentPageNumber - 2;
			end = currentPageNumber + 2;
			
			if(start <= 0){
				start = 1;
				end = 5;
			}
			
			if(end >= totalPage){
				start = totalPage - 4;
				end = totalPage;
			}
		}
		
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalDateNumber() {
		return totalDateNumber;
	}

	public void setTotalDateNumber(int totalDateNumber) {
		this.totalDateNumber = totalDateNumber;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
