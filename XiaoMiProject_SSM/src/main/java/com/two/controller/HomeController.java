package com.two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
	public HomeController() {
		super();
System.out.println("HOMECONTOL>>>>>>>>>>>>>>>>>>>>>>>>>");	}

	@RequestMapping("/")
	public String login() {
		return "login";
	}
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	@RequestMapping("register")
	public String register() {
		return "register";
	}
}
