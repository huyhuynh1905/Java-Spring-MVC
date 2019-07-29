package com.huyhuynh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
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
}
