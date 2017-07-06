package com.paymoon.basic.client;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.StudentService;

import junit.framework.TestCase;

public class Client extends TestCase {

	private StudentService sService;
    protected void setUp() throws Exception {   
        super.setUp();   
        @SuppressWarnings("resource")
		BeanFactory context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
	    sService = (StudentService)context.getBean("studentService");   
    }  
    
    protected void tearDown() throws Exception {   
        super.tearDown();   
    }   
    
    //单个添加
	@Test
	public void testRequires(){
		sService.addStudent();
	}
	@Test
	public void testAddStudentBatch(){
		Student student =  sService.getStudentByUserName("mybatis");
		System.out.println(student);
	}
	
}