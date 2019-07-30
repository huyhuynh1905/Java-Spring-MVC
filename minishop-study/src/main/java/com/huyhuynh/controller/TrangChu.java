package com.huyhuynh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lo")
public class TrangChu {

	@GetMapping
	public String pageTrangChuDefault() {
		
		return "/views/trangchu.jsp";
	}
}
