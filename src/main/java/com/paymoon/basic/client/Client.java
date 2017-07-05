package com.paymoon.basic.client;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.paymoon.basic.service.StudentService;

import junit.framework.TestCase;

public class Client  {

   public static void main(String[] args) {
	   @SuppressWarnings("resource")
		BeanFactory context = new FileSystemXmlApplicationContext("/src/main/resources/app-context.xml");
	   StudentService sService = (StudentService)context.getBean("studentService");   
       sService.addStudent();
}
	
}