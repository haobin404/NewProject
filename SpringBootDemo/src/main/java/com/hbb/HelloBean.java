package com.hbb;

public class HelloBean {
private long id;
private String name;
private String date;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public HelloBean() {
	super();
	// TODO Auto-generated constructor stub
}
public HelloBean(long id, String name, String date) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
}
@Override
public String toString() {
	return "HelloBean [id=" + id + ", name=" + name + ", date=" + date + "]";
}

}
