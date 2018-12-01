package com.igeek.shop.entity;

import java.util.List;

/**
 * ��װ���кͷ�ҳ�йصĶ���
 */

public class PageBean<T> {
	
	// ��������  ��Ҫֱ�Ӵ���
	/** ��ǰҳ ҳ�� */
	private int currentPageNumber;
	/** ÿҳ��ʾ���������� */
	private int pageSize;
	/** �ܼ�¼��	(Ҫ��ѯ������������) */
	private int totalDateNumber;
	
	
	// ����������Ҫͨ������ó�
	/** ��ҳ�� */
	private int totalPage;
	/** ÿҳ��ѯ���±� */
	private int startIndex;
	/** ǰ̨չʾ�����ְ�	start �����￪ʼ */
	private int start;
	/** end ��������� */
	private int end;

	
	// ��Ҫ�ֶ����������
	/** ǰ̨��Ҫչʾ������(ֱ�Ӿ��Ǵ���ҳ������չʾ) */
	private List<T> data;

	public PageBean(){
		
	}
	
	// �������� ��ʼ������(�������е����Խ��и�ֵ)
	public PageBean(int currentPageNumber, int pageSize, int totalDateNumber) {
		this.currentPageNumber = currentPageNumber;
		this.pageSize = pageSize;
		this.totalDateNumber = totalDateNumber;
		
		// ��μ�����ҳ��
		if(totalDateNumber % pageSize == 0){
			totalPage = totalDateNumber / pageSize;
		}else{
			totalPage = totalDateNumber / pageSize + 1;
		}
		
		// startIndex �������ǰҳ���Ĺ�ϵ
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
