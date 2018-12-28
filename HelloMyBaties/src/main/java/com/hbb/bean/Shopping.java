package com.hbb.bean;

public class Shopping {
//	this is  id
	private Integer id;
private String name;
private double price;
private Integer count;
@Override
public String toString() {
	return "Shopping [id=" + id + ", name=" + name + ", price=" + price + ", count=" + count + "]";
}
public Shopping(String name, double price, Integer count) {
	super();
	this.name = name;
	this.price = price;
	this.count = count;
}

public Shopping(Integer id, String name, double price, Integer count) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.count = count;
}
public Shopping() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}

}
