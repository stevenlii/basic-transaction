# basic-transaction
all of transaction about java, which includes spring, mybatis, hibernate ,jdbc and so on.




一、Spring AOP事务管理（使用切面把事务管理起来）
所有事务的属性玩法：（http://blog.csdn.net/partner4java/article/details/7015946）
@Transactional注解： 
你可以指定传播、隔离级别、超时以及允许和不允许的异常。 
@Transactional注解的属性: 
propagation：指定事务定义中使用的传播 
isolation：设定事务的隔离级别 
timeout：指定事务的超市（秒） 
readOnly：指定事务的超时 
noRollbackFor：目标方法可抛出的异常所构成的数组，但通知仍会提交事务 
rollbackFor：异常所构成的数组，如果目标方法抛出了这些异常，通知就会回滚事务 

深入分析事务的隔离级别-HollisChuang's Blog
http://www.hollischuang.com/archives/943
数据库的读现象浅析-HollisChuang's Blog
http://www.hollischuang.com/archives/900

二、在了解Spring Transaction事务管理 - NO END FOR LEARNING
http://benweizhu.github.io/blog/2015/02/07/spring-transacation/
的“理解Spring声明式事务的实现”部分
可以明白xml方式配置tx的方式和注解的方式
 xml方式：配置方式,见resources/xmlCfgTx
 从<tx:advice id="txAdvice" 到 </aop:config>结束
 其相当于
写了 <tx:annotation-driven transaction-manager="txManager"/>
并在service中用@Transactional标在类的上方，并在有get的地方标注了@Transactional(readOnly=true)


事务隔离级别:
　　@Transactional(isolation = Isolation.READ_UNCOMMITTED)
　　　　读取未提交数据(会出现脏读, 不可重复读) 基本不使用
　　@Transactional(isolation = Isolation.READ_COMMITTED)
　　　　读取已提交数据(会出现不可重复读和幻读)
　　@Transactional(isolation = Isolation.REPEATABLE_READ)
　　　　可重复读(会出现幻读)
　　@Transactional(isolation = Isolation.SERIALIZABLE)
　　　　串行化
还能配置传播，readOnly timeout等
 

　　！！！MYSQL: 默认为REPEATABLE_READ级别
　　！！！SQLSERVER: 默认为READ_COMMITTED

　　脏读 : 一个事务读取到另一事务未提交的更新数据

　　不可重复读 : 在同一事务中, 多次读取同一数据返回的结果有所不同, 换句话说, 后续读取可以读到另一事务已提交的更新数据. 相反, "可重复读"在同一事务中多次读取数据时, 能够保证所读数据一样, 也就是后续读取不能读到另一事务已提交的更新数据

　　幻读 : 一个事务读到另一个事务已提交的insert数据 

    

