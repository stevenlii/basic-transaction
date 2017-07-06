package com.paymoon.basic.client;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.StudentService;
import com.paymoon.basic.service.impl.StudentServiceImpl;

import junit.framework.TestCase;

public class Client extends TestCase {

	private StudentServiceImpl sService;
    protected void setUp() throws Exception {   
        super.setUp();   
        @SuppressWarnings("resource")
		BeanFactory context = new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
	    sService = (StudentServiceImpl)context.getBean("studentServiceimpl");   
    }  
    
    protected void tearDown() throws Exception {   
        super.tearDown();   
    }   
    
    //单个添加
	@Test
	public void testAddStudent(){
		sService.addStudent();
	}
	@Test
	public void testAddStudentBatch(){
		Student student =  sService.getStudentByUserName("mybatis");
		System.out.println(student);
	}
	//使用sqlSession<理论上使用应该在DaoImpl里面，这里只是测试>
	@Test
	public void testGetStudentBySqlSession(){
		Student student =  sService.getStudentBySqlSession("mybatis");
		System.out.println(student);
	}
	//使用sqlSession<理论上使用应该在DaoImpl里面，这里只是测试>
	//SqlSession多参数的使用
	//需要在Mappers里改成多参数，然后这里传haspMap即可
	@Test
	public void testGetStudentBySqlSessionMultipleParam(){
		
		Student student =  sService.getStudentBySqlSessionMultipleParam("mybatis");
		System.out.println(student);
	}
	//Mappers多参数的使用,与sqlsession不同
	@Test
	public void testGetStudentBySqlSessionMultipleParamMapper(){
		
		Student student =  sService.getStudentBySqlSessionMultipleParam("mybatis");
		System.out.println(student);
	}
	
}