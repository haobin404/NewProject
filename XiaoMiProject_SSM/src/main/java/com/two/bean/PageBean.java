package com.two.bean;

import java.util.List;

public class PageBean<T> {
private List<T> data;
private Integer count;
private Integer rowsize;
private Integer sumpage;
private Integer nowpage;
private String[] type;
public List<T> getData() {
	return data;
}
public void setData(List<T> data) {
	this.data = data;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
public Integer getRowsize() {
	return rowsize;
}
public void setRowsize(Integer rowsize) {
	this.rowsize = rowsize;
}
public Integer getSumpage() {
	return this.count%this.rowsize==0?
			this.count/this.rowsize:
		  this.count/this.rowsize+1;
}
public void setSumpage(Integer sumpage) {
	this.sumpage = sumpage;
}
public Integer getNowpage() {
	return nowpage;
}
public void setNowpage(Integer nowpage) {
	this.nowpage = nowpage;
}
public String[] getType() {
	return type;
}
public void setType(String[] type) {
	this.type = type;
}
@Override
public String toString() {
	return "PageBean [data=" + data + ", count=" + count + ", rowsize=" + rowsize + ", sumpage=" + sumpage
			+ ", nowpage=" + nowpage + ", type=" + type + "]";
}

}
