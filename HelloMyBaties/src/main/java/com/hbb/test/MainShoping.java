package com.hbb.test;

import java.util.Scanner;

import com.hbb.service.ShopService;

/**
 * ��Ʒ��桢����ģ��ϵͳ
 * @author Administrator
 *
 */
public class MainShoping{
	private static ShopService shops=new ShopService();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		message();
		while(true) {
			System.out.println("������ָ��:"); 
			int check=sc.nextInt();
			switch(check) {
			case 1:
				shops.selectShop();
				break;
			case 2:
				shops.insertShop();
				break;
			case 3:
				shops.deleteShop();
				break;
			case 4:
				shops.updateShop();
				break;
			case 5:
				System.out.println("------------------------��ӭ�´ι���------------------------");
				return;
			default:
				System.out.println("����ָ���ȷ����������:");
				message();
				break;
			}
		}
	}
	
	/**
	 * ����
	 */
	private static void message() {
		System.out.println("----------------------------��ӭ�����ֶճ���----------------------------");
		System.out.println("������ָ����ɲ���:");
		System.out.println("1:��ѯ��Ʒ");
		System.out.println("2:������Ʒ");
		System.out.println("3:ɾ����Ʒ");
		System.out.println("4:�޸���Ʒ");
		System.out.println("5:�˳�ϵͳ");
		System.out.println("--------------------------------------------------------------------");
	}
}
