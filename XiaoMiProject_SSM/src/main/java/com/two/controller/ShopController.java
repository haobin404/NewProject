package com.two.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.two.bean.PageBean;
import com.two.bean.ShopBean;
import com.two.bean.ShopVersionBean;
import com.two.service.ShopServiceInter;
import com.two.service.ShopVersionServiceInter;
/**
 * 商品的处理器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
      @Autowired
     private ShopServiceInter ssi;
      @Autowired
      private ShopVersionServiceInter sv;
	@RequestMapping("ShopType")
	public String ShopType(String[] name,Model md) {
		 //取出所有的参数并且 转换成list集合
	    List<String> list = Arrays.asList(name);
	    //实例化 service 调用方法将参数list集合传递 返回上屏的list集合
	    List<ShopBean> newlist = ssi.findShopTwoType(list);
        //将集合存入session中 请求重定向
	    md.addAttribute("shops",newlist); 
	   return "index";
	}
	@RequestMapping("ShopTypeList")
	public String ShopTypeList(String[] name,Model md,Integer nowpage,HttpSession session) {
	      if(nowpage==null || "".equals(nowpage)) {
	    	  nowpage=1;
	      }
       PageBean pagebean = ssi.findShopFenYeType(name,nowpage,10);
       md.addAttribute("type",name);
       session.setAttribute("pagebean",pagebean);
        return "list";
	}
	@RequestMapping("xqs/{id}")
	public String xqs(@PathVariable Integer id,HttpSession session) {
         ShopBean shop = ssi.getShopId(id);
         List<ShopVersionBean> list = sv.getShopVersionId(id);
         session.setAttribute("xqs_shop",shop);
         session.setAttribute("xqs_version",list);
         return "xianqing";
	}
	
	@RequestMapping("shopLike")
	public String xqs(String name,HttpSession session) {
		List<ShopBean> shopLike = ssi.getShopLike(name);
		PageBean<ShopBean> page=new PageBean<ShopBean>();
		page.setData(shopLike);
		page.setRowsize(10);
		page.setNowpage(1);
		page.setCount(10);
	    session.setAttribute("pagebean",page);
        return "list";
	}
}
