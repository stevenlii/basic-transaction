# basic-transaction hibernate
Hibernate 的 10 个常见面试问题及答案 - 技术翻译 - 开源中国社区
https://www.oschina.net/translate/10-hibernate-interview-questions-answers-java-j2ee-senior

Hibernate核心原理解析 - 逍遥飞鹤的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/he90227/article/details/50300039
Hibernate实现原理 与 缺点 - 每天进步一点点！ - ITeye技术网站
http://uule.iteye.com/blog/2122797
lazy get load 序列化
Hibernate的lazy问题 - 闫小甲的博客 - ITeye技术网站
http://yanxiaojia.iteye.com/blog/1536533
Hibernate Lazy属性 - 无可奈何SOS - 博客园
http://www.cnblogs.com/wukenaihe/archive/2013/06/11/3131640.html
sessionFactory加载过程

详细解释Spring与Hibernate的整合原理 - 不能说的秘密的博客 - 博客频道 - CSDN.NET(两种方式）
http://blog.csdn.net/canot/article/details/50512217

注意property的name不同，可以配置注解
 <property name="mappingDirectoryLocations">
            <list>
                <value>classpath:domain  <!--加载这个路径下的所有.hbm.xml-->
                </value>
            </list>
        </property>
 与
 <property name="packagesToScan">
			<list>
				<value>com.test.bean</value>
			</list>
		</property>
，上面是hbm.xml,下面是使用hibernate注解的配置
如仅使用hibernate时，在在hibernate.cfg.xml文件中配置是
<!-- 基于annotation的配置 -->
        <mapping class="com.xiaoluo.bean.User"/>
<!-- 基于hbm.xml配置文件 -->
        <mapping resource="com/xiaoluo/bean/User.hbm.xml"/>
        
        
Hibernate事务与并发问题处理（乐观锁与悲观锁） - u012557298的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/u012557298/article/details/54917225
java中hibernate的Serializable解析 - zygzzp的专栏 - 博客频道 - CSDN.NET
http://blog.csdn.net/nyistzp/article/details/9008923
Hibernate POJO在序列化（JSON）时遇到的若干问题 - Gugia桑 - 博客园
http://www.cnblogs.com/gugia/p/5117735.html
hibernate的各种保存方式的区别 (save,persist,update,saveOrUpdte,merge,flush,lock)等 - DANCE WITH JAVA - BlogJava
http://www.blogjava.net/dreamstone/archive/2007/07/29/133071.html


遇到的问题
1、
 <!-- 因为在GenericHibernateDao里，用的是hibernateTemplate，所以需要这个配置，如果用sessionFactory，就不需要了，
     用sessionFactory的例子见：http://websystique.com/spring/spring4-hibernate4-mysql-maven-integration-example-using-annotations
     -->
    <bean id="hibernateTemplate" class="org.springframework.orm.hibernate5.HibernateTemplate">
		<property name="sessionFactory" ref="sessionFactory" />
	</bean>
	
2、jpa 2.0 - java.lang.ClassNotFoundException: org.hibernate.engine.transaction.spi.TransactionContext - Stack Overflow
https://stackoverflow.com/questions/35464428/java-lang-classnotfoundexception-org-hibernate-engine-transaction-spi-transacti


3、spring - Migration to hibernate core 5.2.1 ava.lang.NoSuchMethodError: org.hibernate.Session.getFlushMode()Lorg/hibernate/FlushMode; - Stack Overflow
https://stackoverflow.com/questions/38417613/migration-to-hibernate-core-5-2-1-ava-lang-nosuchmethoderror-org-hibernate-sess

4/java - org.hibernate.MappingException: Unknown entity: annotations.Users - Stack Overflow
https://stackoverflow.com/questions/23214454/org-hibernate-mappingexception-unknown-entity-annotations-users
最后发现是<value>中间有空格。。</value>

5/ id以前类型是int类型，这次改成了varchar