package com.paymoon.basic.service;

import com.paymoon.basic.po.Student;

public interface StudentService {
	
	public void addStudent();
	public void addStudentBatch();
	public Student getStudentByUserName(String userName);
}
