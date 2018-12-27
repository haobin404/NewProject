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
	 * �޸�
	 */
	public void updateShop() {
		System.out.println("������Ҫ�޸ĵ���Ʒ���:");
		int id = sc.nextInt();
	    Shopping ss = mapper.selectShopId(id);
	    System.out.println("����"+ss.getName()+"�޸�Ϊ:");
		String name=sc.next();
		System.out.println("�۸�:"+ss.getPrice()+"�޸�Ϊ:");
		double price = sc.nextDouble();
		System.out.println("���:"+ss.getCount()+"�޸�Ϊ:");
		int count = sc.nextInt();
		mapper.updateShop(new Shopping(id,name,price,count)); 
	    System.out.println("--------------------------------------------------------------------");
       System.out.println("�޸ĳɹ���");
	}
	/**
	 * ɾ��
	 */
	public void deleteShop() {
		System.out.println("����ɾ������Ʒ���:");
		int id = sc.nextInt();
		mapper.deleteShop(id);
		System.out.println("ɾ���ɹ���");
	}
	/**
	 * ����
	 */
	public void insertShop() {
	System.out.println("�����������Ʒ����:");
		String name=sc.next();
		System.out.println("�����������Ʒ�۸�:");
		double price = sc.nextDouble();
		System.out.println("�����������Ʒ���:");
		int count = sc.nextInt();
		mapper.insertShop(new Shopping(name,price,count)); 
           session.commit();
           System.out.println("����ɹ�!");
	}
	/**
	 * ��ѯ
	 */
	public void selectShop() {
		List<Shopping> selectShop = mapper.selectShop();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("���\t \t |\t \t ��Ʒ\t\t |\t \t�۸�\t \t|\t \t���");
		for(Shopping ss:selectShop) {
			System.out.println(ss.getId()+"\t \t|\t\t "+ss.getName()+"\t \t|\t \t"+ss.getPrice()+"\t \t|\t \t"+ss.getCount());
		}
		System.out.println("--------------------------------------------------------------------");
	}
}
