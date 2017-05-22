package cn.partner4java.myptm;  
  
import java.io.Serializable;  
  
/** 
* 模拟一个session类 
* @author partner4java 
* 
*/  
public class MySession {  
    /** 用来标识一个session */  
    private Long sessionId;  
  
    public void save(Serializable entity){  
        System.out.println(sessionId + ":save");  
    }  
      
    public void beginTransaction(){  
        System.out.println(sessionId + ":beginTransaction");  
    }  
      
    public void commit(){  
        System.out.println(sessionId + ":commit");  
    }  
      
    public void rollback(){  
        System.out.println(sessionId + ":rollback");  
    }  
      
    public Long getSessionId() {  
        return sessionId;  
    }  
  
    public void setSessionId(Long sessionId) {  
        this.sessionId = sessionId;  
    }  
  
    @Override  
    public String toString() {  
        return "MySession [sessionId=" + sessionId + "]";  
    }  
  
      
}  