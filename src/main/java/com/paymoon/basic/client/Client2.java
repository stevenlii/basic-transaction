package com.paymoon.basic.client;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.impl.StudentServiceimpl;

public class Client2  {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
			BeanFactory context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
		  StudentServiceimpl sService = (StudentServiceimpl)context.getBean("studentServiceimpl");   
			List<Student> student =  sService.xmlGetAll();
			System.out.println(student);
	}
}