# basic-transaction 

与分支basic-transaction-spring-jdbc不同的是，这个是事务标准方式实现

org.springframework.transaction.TransactionDefinition; 我们能控制的事务，就是这几种
Spring高级程序设计 16 事务管理 - java相关技术（partner4java专栏）希望对您的学习有所帮助 - 博客频道 - CSDN.NET
http://blog.csdn.net/partner4java/article/details/7017412

2分析事务属性 
众所周知的ACID属性： 
原子性（atomicity）、一致性（consistency）、隔离性（isolation）以及持久性（durability）。我们无法控制一致性、原子性以及持久性，但可以控制超时，设置事务的只读性以指定隔离级别。 
Spring在TransactionDefinition接口封装了所有这些设置。 

探索TransactionDefinition接口：
