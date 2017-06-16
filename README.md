# basic-transaction
all of transaction about java, which includes spring, mybatis, hibernate ,jdbc and so on.

一、Spring AOP事务管理（使用切面把事务管理起来） - java相关技术（partner4java专栏）希望对您的学习有所帮助 - 博客频道 - CSDN.NET
http://blog.csdn.net/partner4java/article/details/7015946
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

    

