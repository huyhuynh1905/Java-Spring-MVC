package com.huyhuynh.corespring.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.huyhuynh.corespring.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<String>();
		menus.add("Tea");
		menus.add("Milk");
		menus.add("Warter");
		menus.add("Cocacola");
		return menus;
	}

}
