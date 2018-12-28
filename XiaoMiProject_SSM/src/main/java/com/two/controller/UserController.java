package com.two.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.two.bean.UserBean;
import com.two.dao.inter.UserDaoInter;
import com.two.service.UserServiceInter;
/**
 * 登录注册
 * @author Administrator
 *
 */
@Controller
@RequestMapping("dl")
public class UserController {
	@Autowired
	private UserServiceInter user;
	/**
	 * 登录
	 * @param userBean
	 * @param verify
	 * @param session
	 * @param md
	 * @return
	 */
	@RequestMapping("login")
	public ModelAndView login(UserBean userBean,String verify,HttpSession session,ModelAndView md) {
		String ver=(String)session.getAttribute("verify");
		System.out.println(verify);System.out.println(ver);
			//验证验证码
			 if(verify == null || "".equals(verify) || !ver.equalsIgnoreCase(verify)) {
				md.addObject("fail","验证码错误!");
				md.setViewName("login");
				return md;
			 }
			int id = user.login(userBean);
			if(id>0) {
				userBean.setUid(id);
				session.setAttribute("user",userBean);
				session.setMaxInactiveInterval(24*60);
				md.setViewName("index");
				return md;
			}else {
//				 如果集合遍历完毕 还么有匹配的那就是 数据库中么有注册 就返回登录页面
				md.addObject("fail","用户名或密码错误!");
				md.setViewName("login");
				return md;
			}
	}
	/**
	 * 注册
	 * @param userBean
	 * @param verify
	 * @param session
	 * @param md
	 * @return
	 */
	@RequestMapping("registerUser")
	public String registerUser(UserBean userBean,String verify,HttpSession session,Model md) {
			//获取到生成的图片验证码
			String Imgverify=(String) session.getAttribute("verify");
			//验证码匹配 & 不匹配就返回register 提醒
			if(verify==null||verify.equals("")||!verify.equalsIgnoreCase(Imgverify)){
				md.addAttribute("fail", "验证码错误");
				return "register";
			}
			//判断用户名是否重复注册 
		     if(user.findUser(userBean)) {
		    		md.addAttribute("fail", "用户名已经注册");
                    return "register";		     
		     }
			//封装数据 传递 
			user.insertUser(userBean);
		     return "login";
	}
}
