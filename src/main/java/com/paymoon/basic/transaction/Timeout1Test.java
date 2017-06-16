package com.paymoon.basic.transaction;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
/**
 * 不做为运行的实例，只是做为参考
 * @author yol
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:spring-config.xml")  
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)  
@Transactional(timeout = 2)  
public class Timeout1Test {  
    @Autowired  
    private DataSource ds;  
    @Test  
    public void testTimeout() throws InterruptedException {  
        System.out.println(System.currentTimeMillis());  
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);  
        jdbcTemplate.execute(" update test set name = name || '1'");  
        System.out.println(System.currentTimeMillis());  
        Thread.sleep(3000L);  
    }  
}  