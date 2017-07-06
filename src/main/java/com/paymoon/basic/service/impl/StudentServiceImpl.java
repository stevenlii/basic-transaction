package com.paymoon.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paymoon.basic.commons.id.Rpid;
import com.paymoon.basic.mappers.StudentMapper;
import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.StudentService;
@Transactional
@Service(value="studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentMapper studentMapper;
	
	public void addStudent(){
		Student student  = new Student();
		student.setUserName("mybatis");
		student.setId(Rpid.generate());
		studentMapper.insertStudent(student);
		System.out.println("success");
	}
	public void addStudentBatch(){
	}
	@Override
	public Student getStudentByUserName(String userName) {
		return studentMapper.getStudentByUserNameViaResultsAnnotations(userName);
	}

}
