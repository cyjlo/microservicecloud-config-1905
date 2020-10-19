package com.hc.chapter04.util;

import java.util.List;

/**
 * 封装分页信息的类
 * @author 24541
 *
 */
public class Pagetion {
	
	private List list;//需要分页查询显示的列表

	private Integer pageNo;//当前页码

	private Integer pageSize;//每页显示的数量

	private Integer totalCount;//总记录数

	private Integer totalPage; //总页码

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Integer getPageNo() {
		if(pageNo == null) {
			pageNo = 1;
		}
		//为了保证页面的有效性，进行最大页和最小页的判断
		if(pageNo > this.getTotalPage()){
			pageNo =  this.getTotalPage();
		}
		if(pageNo < 1){
			pageNo = 1;
		}
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
		return this.totalPage;
	}


	

}
