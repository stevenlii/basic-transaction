package com.paymoon.basic.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public void addStudent(){
		Student student  = new Student();
		student.setName("hibernate test");
		studentDAOImpl.create(student);
		System.out.println("success");
	}
	public void addStudentBatch(){
		List<Student> students = new ArrayList<>();
		Student student  = new Student();
		student.setName("batch1 hibernate test");
		students.add(student);
		student  = new Student();
		student.setName("batch2 hibernate test");
		students.add(student);
		studentDAOImpl.batchSave(students);
		System.out.println("success");
	}

}
