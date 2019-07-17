package com.huyhuynh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {
	
	@RequestMapping("/")
	private String homeIndex() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	private String loginPage() {
		return "Login";
	}
}
