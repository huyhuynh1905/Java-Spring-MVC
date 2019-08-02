package com.huyhuynh.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseShop {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void getListSV() {
		String sql = "select * from sinhvien";
		List<SinhVien> arrSv = jdbcTemplate.query(sql, new RowMapper<SinhVien>() {

			public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				SinhVien sv = new SinhVien();
				sv.setId(rs.getInt("id"));
				sv.setHoten(rs.getString("hoten"));
				sv.setNamsinh(rs.getInt("namsinh"));
				sv.setHoten(rs.getString("diachi"));
				return sv;
			}
		});
		for(SinhVien sv : arrSv) {
			System.out.println(sv.getHoten());
		}
	}
}
