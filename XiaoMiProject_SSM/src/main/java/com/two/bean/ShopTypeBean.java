package com.two.bean;

public class ShopTypeBean {
private int stid;
private String stname;
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public String getStname() {
	return stname;
}
public void setStname(String stname) {
	this.stname = stname;
}
@Override
public String toString() {
	return "ShopTypeBean [stid=" + stid + ", stname=" + stname + "]";
}
public ShopTypeBean(int stid, String stname) {
	super();
	this.stid = stid;
	this.stname = stname;
}
public ShopTypeBean() {
	super();
	// TODO Auto-generated constructor stub
}

}
