package com.huyhuynh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huyhuynh.entity.NhanVien;

@Controller
public class HomePageMinishopController {
	
	@RequestMapping("/")
	public String getHomeIndex() {
		return "/views/index.jsp";
	}
	
	//Resource
	@RequestMapping("/testresource")
	@ResponseBody
	public String getHomeMessage() {
		ApplicationContext context = new ClassPathXmlApplicationContext("minishopcontainer.xml");
		//Resource resource = context.getResource("https://juliuskma.000webhostapp.com/getdatasinhvientojson.php");
		
		//Sử dụng ResourceLoaderAware để gán ngầm các context (cách khác)
		/*DataLoader daLoader = new DataLoader();
		daLoader.setResourceLoader(context);*/
		DataLoader daLoader = (DataLoader) context.getBean("resourceDataLoader");
		Resource resource = daLoader.getResource("https://juliuskma.000webhostapp.com/getdatasinhvientojson.php");
		
		try {
			InputStream inputStream = resource.getInputStream();
			BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = "";
			while((line = bReader.readLine())!=null) {
				System.out.println(line+"\n");
			}
			bReader.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "This is Home Page";
	}
	
	//Kiểu trả về modelandview truyền các object vào file jsp
	@RequestMapping("/modelandview")
	public ModelAndView getDangNhap() {
		ModelAndView viewDn = new ModelAndView();
		viewDn.setViewName("/views/modelandview.jsp"); //Them trang jsp load ra
		
		String user = "huyhuynh";
		String pass = "123";
		
		//set cac object gui
		viewDn.addObject("username", user);
		viewDn.addObject("password", pass);
		//gui object
		NhanVien nv1 = new NhanVien("01","Huy","Hue");
		NhanVien nv2 = new NhanVien("02","Bao","HN");
		ArrayList<NhanVien> arnv = new ArrayList<NhanVien>();
		arnv.add(nv1);
		arnv.add(nv2);
		viewDn.addObject("listnhanvien",arnv);
		
		return viewDn;
	}
	
	//Gửi các object không thông qua modelandview
	@RequestMapping("/nomodel")
	public String getDangNhap(ModelMap modelMap) {	
		String user = "huyhuynh";
		String pass = "123";
		
		//set cac object gui
		modelMap.addAttribute("username", user);
		modelMap.addAttribute("password", pass);
		
		//gui object
		NhanVien nv1 = new NhanVien("01","Huy","Hue");
		NhanVien nv2 = new NhanVien("02","Bao","HN");
		ArrayList<NhanVien> arnv = new ArrayList<NhanVien>();
		arnv.add(nv1);
		arnv.add(nv2);
		modelMap.addAttribute("listnhanvien",arnv);
		
		return "/views/modelandview.jsp";
	}
	
	
}
