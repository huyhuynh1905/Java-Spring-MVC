package com.huyhuynh.entity;

public class SinhVien {
	int id;
	String hoten;
	int namsinh;
	String diachi;
	
	
	
	public SinhVien() {
		super();
	}
	public SinhVien(int id, String hoten, int namsinh, String diachi) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.diachi = diachi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
}
