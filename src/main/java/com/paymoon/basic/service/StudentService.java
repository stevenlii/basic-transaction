package com.paymoon.basic.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paymoon.basic.dao.IStudentDAO;
import com.paymoon.basic.po.Student;
@Transactional
@Service(value="studentService")
public class StudentService {
	
	@Resource(name = "studentDAOImpl")
	private IStudentDAO studentDAOImpl;
	
	@Transactional(timeout = 2) 
	public void addStudent(){
		Student student  = new Student();
		student.setName("hibernate test");
		studentDAOImpl.create(student);
		System.out.println("success");
	}

}
