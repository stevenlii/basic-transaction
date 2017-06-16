package com.tgb.service;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="sService")
public class StudentService {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(timeout = 2) 
	public void addStudent(){
		
		 System.out.println(System.currentTimeMillis());  
		String sql = "insert into student(name) values('st0')";
		jdbcTemplate.execute(sql);
		try{
			Thread.sleep(3000L); 
			 System.out.println(System.currentTimeMillis());  
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
	@Transactional(timeout = 2) 
	public void addStudent2(){
		try{
			Thread.sleep(3000L); 
			System.out.println(System.currentTimeMillis());  
			String sql = "insert into student(name) values('st0')";
			jdbcTemplate.execute(sql);
			
			
			System.out.println(System.currentTimeMillis());  
		}catch(Exception e){
			throw new RuntimeException();
		}
	}

}
