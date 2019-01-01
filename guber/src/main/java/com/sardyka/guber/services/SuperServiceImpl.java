package com.sardyka.guber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.sardyka.guber.beans.Cab;

@Service
public class SuperServiceImpl implements SuperService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 

	@Override
	public List<Cab> getCabs() {
		RowMapper<Cab> cabRowMapper = (rs, rowNumber) -> new Cab(
				rs.getDate("manufacture_year"),
				rs.getString("car_make"),
				rs.getString("licence_plate"),
				rs.getInt("capacity"),
				rs.getBoolean("has_baby_chair")
				);
		return jdbcTemplate.query("SELECT * FROM cab", cabRowMapper);
	}

}
