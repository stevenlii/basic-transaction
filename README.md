# basic-transaction 自定义实现session模仿事务
steps:
1)dataSource
2)transactionManager配置到org.springframework.jdbc.datasource.DataSourceTransactionManager
3)<tx:annotation-driven  支持@Transactional注解
知识点：

一、Spring 实现你自己的事务同步 - java相关技术（partner4java专栏）希望对您的学习有所帮助 - 博客频道 - CSDN.NET
http://blog.csdn.net/partner4java/article/details/7017398
c3p0、dbcp、tomcat jdbc pool 连接池区别（推荐使用jdbc pool） - chenaini119的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/chenaini119/article/details/69254803

二、两个区别
在    <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource" destroy-method="close">  
中，

org.springframework.jdbc.datasource.DriverManagerDataSource的实现是
SingleConnectionDataSource，这不是多线程的扩展（注释有讲）
三、
3.1 推荐使用：
org.apache.tomcat.jdbc.pool.DataSource和druid

3.2
关于Spring事务<tx:annotation-driven/>的理解（Controller可以使用@Transactional） - 小单的博客专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/catoop/article/details/50067785
Spring中tx命名空间和配置注解工作原理浅析 - RoxLiu的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/roxliu/article/details/21000939
关于Advisor（Advisor表示只有一个通知和一个切入点的切面，在AspectJ中没有相应的概念对应，我理解是一个特殊的切面）
除了在进行事务控制的情况下，其他情况一般不推荐使用该方式，该方式属于侵入式设计（？？？），必须实现通知API
spring Aop中aop:advisor 与 aop:aspect的区别 - 有志者一定行 - 博客频道 - CSDN.NET
(如果使用aop:advisor配置,那么切面逻辑必须要实现advice【MethodBeforeAdvice】接口才行!否则会失败!）
http://blog.csdn.net/u011710466/article/details/52888277
http://chouyi.iteye.com/blog/1670749
学习AOP之透过Spring的Ioc理解Advisor - 5207 - 博客园
http://www.cnblogs.com/5207/p/6066494.html

四、主流Java数据库连接池比较与开发配置实战 - 程序人生 - 博客频道 - CSDN.NET
http://blog.csdn.net/fysuccess/article/details/66972554

五、关于druid，见相关分支