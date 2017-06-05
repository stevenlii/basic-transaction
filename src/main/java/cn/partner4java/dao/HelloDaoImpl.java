package cn.partner4java.dao;  
  
import org.springframework.jdbc.core.support.JdbcDaoSupport;  
import org.springframework.transaction.annotation.Transactional;

import cn.partner4java.myptm.MySession;
import cn.partner4java.myptm.MySessionFactory;  
  
/** 
* 一个hello world dao，起到模拟调用自定义事务同步的作用 
* @author partner4java 
* 
*/  
public class HelloDaoImpl extends JdbcDaoSupport implements HelloDao {  
    private MySessionFactory mySessionFactory;  
  
    public void setMySessionFactory(MySessionFactory mySessionFactory) {  
        this.mySessionFactory = mySessionFactory;  
    }  
      
    @Transactional  
    public void saveHello(){  
        MySession mySession = mySessionFactory.getSession();  
        mySession.save(null);
//        this.getJdbcTemplate().execute("select * from user"); 
    }  
} 