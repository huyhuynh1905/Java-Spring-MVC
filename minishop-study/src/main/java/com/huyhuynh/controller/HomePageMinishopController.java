package com.huyhuynh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huyhuynh.entity.NhanVien;

@Controller
public class HomePageMinishopController {
	
	@RequestMapping("/")
	public String getHomeIndex() {
		return "/views/index.jsp";
	}
	
	@RequestMapping("/trangchu")
	@ResponseBody
	public String getHomeMessage() {
		ApplicationContext context = new ClassPathXmlApplicationContext("minishopcontainer.xml");
		NhanVien nv = (NhanVien) context.getBean("nhanvien");
		return "This is Home Page "+nv.toString();
	}
}
