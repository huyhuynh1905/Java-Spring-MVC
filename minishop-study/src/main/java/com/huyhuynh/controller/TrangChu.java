package com.huyhuynh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huyhuynh.entity.DatabaseShop;

@Controller
@RequestMapping("/")
public class TrangChu {

	@GetMapping
	public String pageTrangChuDefault() {
		ApplicationContext context = new ClassPathXmlApplicationContext("minishopcontainer.xml");
		
		DatabaseShop databaseShop = (DatabaseShop) context.getBean("databasashop");
		databaseShop.getListSV();
		
		return "/views/trangchu.jsp";
	}
}
