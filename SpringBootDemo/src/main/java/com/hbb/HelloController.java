package com.hbb;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Controller
public class HelloController {

	@RequestMapping("test")
	public String test(Model md,HttpSession session) {
		List<HelloBean> list=new ArrayList<HelloBean>();
		HelloBean h = new HelloBean(1,"1512@qq.com","2018-12-23");
		list.add(h);
		
		HelloBean h1 = new HelloBean(2,"23234@qq.com","2014-7-23");
		list.add(h1);
		
		HelloBean h2 = new HelloBean(3,"3453@163.com","2019-6-6");
		list.add(h2);
		md.addAttribute("lists",list);
		List<Map<String,String>> map1=new ArrayList<>();
		Map<String,String> map2=new HashMap<>();
		map2.put("101", "哈哈嘻嘻呵呵");
		map2.put("102", "郝斌");
		map1.add(map2);
		md.addAttribute("listmaps",map1);
		md.addAttribute("today",new Date());
		session.setAttribute("admin",true);
		return "admin_list";
	}
	@RequestMapping("jsp")
	public String jj() {
		return "NewFile";
	}
}
