package com.qiao.domain;

import java.util.List;

/**
 *Practice by Jaquior_qiao on 17/11/24
 *Appreciate the person codingBoy,who give me a lot help 
 */
public class PageBean<Object> {
	private int pc;//当前页码page code
	//private int tp;//总页数total pages
	private int tr;//总记录数total records
	private int pr;//每页记录数page records
	
	private List<Object> beanList;//当前页的记录
	private String url;
	//获取总页数
	public int getTp(){
	        int tp=tr/pr;
	        return tr % pr == 0 ? tp : tp + 1 ;
	}
	
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getTr() {
		return tr;
	}
	public void setTr(int tr) {
		this.tr = tr;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	public List<Object> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<Object> beanList) {
		this.beanList = beanList;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
