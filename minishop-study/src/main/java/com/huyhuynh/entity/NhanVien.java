package com.huyhuynh.entity;

public class NhanVien {
	private String id;
	private String name;
	private String address;
	
	
	public NhanVien() {
		super();
	}
	public NhanVien(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return "Day la class nhan vien!";
	}
	@Override
	public String toString() {
		return "NhanVien [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void startMethod() {
		System.out.println("Start Method");
	}
	public void destroyMethod() {
		System.out.println("Destroy Method");
	}
	
	
}
