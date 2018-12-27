package com.hbb.test;

import java.util.Scanner;

import com.hbb.service.ShopService;

/**
 * 商品库存、购买模拟系统
 * @author Administrator
 *
 */
public class MainShoping{
	private static ShopService shops=new ShopService();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		message();
		while(true) {
			System.out.println("请输入指令:"); 
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
				System.out.println("------------------------欢迎下次光临------------------------");
				return;
			default:
				System.out.println("输入指令不正确请重新输入:");
				message();
				break;
			}
		}
	}
	
	/**
	 * 操作
	 */
	private static void message() {
		System.out.println("----------------------------欢迎来到胖墩超市----------------------------");
		System.out.println("请输入指令完成操作:");
		System.out.println("1:查询商品");
		System.out.println("2:增加商品");
		System.out.println("3:删除商品");
		System.out.println("4:修改商品");
		System.out.println("5:退出系统");
		System.out.println("--------------------------------------------------------------------");
	}
}
