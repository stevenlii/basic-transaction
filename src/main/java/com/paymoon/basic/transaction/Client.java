package com.paymoon.basic.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.partner4java.dao.HelloDao;

public class Client {
   public static void main(String[] args) {
       ApplicationContext ac = new ClassPathXmlApplicationContext("app-context.xml");  
         
       HelloDao helloDao = (HelloDao) ac.getBean("helloDao");  
       helloDao.saveHello();  
//       后台打印：  
//       1322395163008:save  
//       1322395163008:beginTransaction  
//       1322395163008:commit  
}
}

