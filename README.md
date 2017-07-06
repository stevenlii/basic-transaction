# basic-transaction mybatis
mybatis
终结篇：MyBatis原理深入解析（一） - 简书
http://www.jianshu.com/p/ec40a82cae28

http://m.blog.csdn.net/fighterandknight/article/details/51448161


搭建流程
1、xml文件
datasource
sqlSessionFactory
transactionManager
即可
此处还配置了sqlSession，里面也有selectOne这样的方法，关于如何使用这个模板，需要进步研究
 

2、StudentMapper Interface+注解，就是Dao了

3、Service 直接@Autowired使用，前提是
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	<property name="basePackage" value="com.paymoon.basic.mappers" />
</bean>
配置好了

4、client拿Service使用，前提
<context:component-scan base-package="com.paymoon.basic.service"></context:component-scan>

A)为方便测试改造

StudentServiceImpl 去除实现接口
Client里面直接引用
B)SqlSessionTemplate的使用方式
参照mybatis-spring – MyBatis-Spring | 第五章 使用 SqlSession
http://www.mybatis.org/spring/zh/sqlsession.html
猜测
使用这个的场景
把Mappers当做配置文件使用，
仍然写Dao Interface
仍然写DaoImpl,
在DaoImpl里面调用Mappers的方法，同时也可以使用SqlSessionTemplate的诸多方法

	