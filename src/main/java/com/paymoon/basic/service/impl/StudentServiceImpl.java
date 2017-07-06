package com.paymoon.basic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paymoon.basic.commons.id.Rpid;
import com.paymoon.basic.mappers.StudentMapper;
import com.paymoon.basic.po.Student;
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
	public Student getStudentBySqlSessionMultipleParam(String userName) {
		Map<String, Object> mapParam = new HashMap<>();
		mapParam.put("userName", userName);
		mapParam.put("id", "PM0706161336iqNmW");
		List<Student> students = sqlSession.selectList("com.paymoon.basic.mappers.StudentMapper.getStudentByUserNameViaResultsAnnotationsMultipleParam", mapParam);
		return students.get(0);
	}
	public Student getStudentBySqlSessionMultipleParamMapper(String userName) {
//		Map<String, Object> mapParam = new HashMap<>();
//		mapParam.put("userName", userName);
//		mapParam.put("id", "PM0706161336iqNmW");
		return studentMapper.getStudentByUserNameViaResultsAnnotationsMultipleParam(userName, "PM0706161336iqNmW");
	}

}
