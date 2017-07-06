package com.paymoon.basic.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paymoon.basic.commons.id.Rpid;
import com.paymoon.basic.mappers.StudentMapper;
import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.StudentService;
@Transactional
@Service(value="studentServiceimpl")
public class StudentServiceImpl{
	
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private SqlSessionTemplate sqlSession;
	public void addStudent(){
		Student student  = new Student();
		student.setUserName("mybatis");
		student.setId(Rpid.generate());
		studentMapper.insertStudent(student);
		System.out.println("success");
	}
	public void addStudentBatch(){
	}
	public Student getStudentByUserName(String userName) {
		return studentMapper.getStudentByUserNameViaResultsAnnotations(userName);
	}
	public Student getStudentBySqlSession(String userName) {
		List<Student> students = sqlSession.selectList("com.paymoon.basic.mappers.StudentMapper.getStudentByUserNameViaResultsAnnotations", userName);
		return students.get(0);
	}

}
