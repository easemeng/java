package com.igeek.shop.entity;

import java.util.List;

public class PageBean<T> {
	
	private int currentPageNumber;
	private int pageSize;
	private int totalPageDataNumber;
	
	private int totalPage;
	private int startIndex;
	private int start;
	private int end;
	
	private List<T> data;
	private String cid;
	
	
	public PageBean() {
		
	}


	public PageBean(int currentPageNumber, int pageSize, int totalPageDataNumber) {
		
		this.currentPageNumber = currentPageNumber;
		this.pageSize = pageSize;
		this.totalPageDataNumber = totalPageDataNumber;
		
		if (totalPageDataNumber % pageSize == 0) {
			totalPage = totalPageDataNumber / pageSize;
		} else {
			totalPage = totalPageDataNumber / pageSize + 1;
		}
		
		startIndex = (currentPageNumber - 1) * pageSize;
		
		start = 1;
		end = 5;
		
		if(totalPage < 5){
			
			end = totalPage;
		
		}else{
			
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


	public int getTotalPageDataNumber() {
		return totalPageDataNumber;
	}


	public void setTotalPageDataNumber(int totalPageDataNumber) {
		this.totalPageDataNumber = totalPageDataNumber;
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


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}
	
	

}
