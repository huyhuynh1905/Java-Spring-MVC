package com.huyhuynh.controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class DataLoader implements ResourceLoaderAware {
	private ResourceLoader resource;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.resource = resourceLoader;
	}
	public Resource getResource(String url) {
		return resource.getResource(url);
	}

}
