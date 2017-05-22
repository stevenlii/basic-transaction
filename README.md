# basic-transaction
一、Spring 实现你自己的事务同步 - java相关技术（partner4java专栏）希望对您的学习有所帮助 - 博客频道 - CSDN.NET
http://blog.csdn.net/partner4java/article/details/7017398
c3p0、dbcp、tomcat jdbc pool 连接池区别（推荐使用jdbc pool） - chenaini119的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/chenaini119/article/details/69254803

二、两个区别
在    <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource" destroy-method="close">  
中，

org.springframework.jdbc.datasource.DriverManagerDataSource的实现是
SingleConnectionDataSource，这不是多线程的扩展（注释有讲）
三、推荐使用：
org.apache.tomcat.jdbc.pool.DataSource和druid

四、主流Java数据库连接池比较与开发配置实战 - 程序人生 - 博客频道 - CSDN.NET
http://blog.csdn.net/fysuccess/article/details/66972554

五、关于druid，见相关分支