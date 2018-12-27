package com.hbb.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.hbb.bean.Shopping;
import com.hbb.bean.ShoppingBean;
import com.hbb.utils.SessionUtil;

public class ShopService {
	private static Scanner sc=new Scanner(System.in);
	private static SqlSession session = SessionUtil.getSession();
	private static ShoppingBean mapper = session.getMapper(ShoppingBean.class);
	/**
	 * 修改
	 */
	public void updateShop() {
		System.out.println("请输入要修改的商品编号:");
		int id = sc.nextInt();
	    Shopping ss = mapper.selectShopId(id);
	    System.out.println("名称"+ss.getName()+"修改为:");
		String name=sc.next();
		System.out.println("价格:"+ss.getPrice()+"修改为:");
		double price = sc.nextDouble();
		System.out.println("库存:"+ss.getCount()+"修改为:");
		int count = sc.nextInt();
		mapper.updateShop(new Shopping(id,name,price,count)); 
	    System.out.println("--------------------------------------------------------------------");
       System.out.println("修改成功！");
	}
	/**
	 * 删除
	 */
	public void deleteShop() {
		System.out.println("输入删除的商品编号:");
		int id = sc.nextInt();
		mapper.deleteShop(id);
		System.out.println("删除成功！");
	}
	/**
	 * 增加
	 */
	public void insertShop() {
	System.out.println("请输入插入商品名称:");
		String name=sc.next();
		System.out.println("请输入插入商品价格:");
		double price = sc.nextDouble();
		System.out.println("请输入插入商品库存:");
		int count = sc.nextInt();
		mapper.insertShop(new Shopping(name,price,count)); 
           session.commit();
           System.out.println("插入成功!");
	}
	/**
	 * 查询
	 */
	public void selectShop() {
		List<Shopping> selectShop = mapper.selectShop();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("编号\t \t |\t \t 商品\t\t |\t \t价格\t \t|\t \t库存");
		for(Shopping ss:selectShop) {
			System.out.println(ss.getId()+"\t \t|\t\t "+ss.getName()+"\t \t|\t \t"+ss.getPrice()+"\t \t|\t \t"+ss.getCount());
		}
		System.out.println("--------------------------------------------------------------------");
	}
}
