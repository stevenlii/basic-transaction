package com.paymoon.basic.transaction;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tgb.service.StudentService;

import junit.framework.TestCase;

public class Client extends TestCase {

	private StudentService sService;
    protected void setUp() throws Exception {   
        super.setUp();   
        @SuppressWarnings("resource")
		BeanFactory context = new FileSystemXmlApplicationContext("/src/main/resources/app-context.xml");
        sService = (StudentService)context.getBean("sService");   
    }  
    
    protected void tearDown() throws Exception {   
        super.tearDown();   
    }   
    
  //在事务之后不会超时
	@Test
	public void testTimeout1(){
		sService.addStudent();
	}
	//在事务之中会超时
	@Test
	public void testTimeout2(){
		sService.addStudent2();
	}
	
	
	
	
}