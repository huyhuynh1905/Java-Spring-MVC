package com.huyhuynh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@GetMapping
	public String pageLoginDefaul() {
		return "/views/index.jsp";
	}
	
	@PostMapping
	public String handlerLogin(@RequestParam String username, @RequestParam String password) {
		if (username.equals("huyhuynh")&&password.equals("123")) {
			return "redirect:/";
		}
		return "/views/index.jsp";
	}
}
