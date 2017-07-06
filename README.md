# basic-transaction mybatis
不同于basic-transaction-spring-mybatis分支
这个分支将会使用xml和annotation共存的方式
mybatis有没有annotation的动态SQL语句？ - 开源中国社区
https://www.oschina.net/question/112957_2133314

http://www.javacoder.top/

与：
Spring、Spring MVC、MyBatis整合文件配置详解 - Pickle - 博客园
http://www.cnblogs.com/wxisme/p/4924561.html
的配置方式不同，他也和hibernate一样，两种方式
如果使用sqlMap的方式，是这样配置：
<!-- 配置sqlSessionFactory -->
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <!-- 数据库连接池 -->
    <property name="dataSource" ref="dataSource"/>
    <!-- 加载Mybatis全局配置文件 -->
    <property name="configLocation" value="/WEB-INF/classes/mybatis/SqlMapConfig.xml"/>
</bean>

<!-- 配置mapper扫描器 -->
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <!-- 扫描包路径，如果需要扫描多个包中间用半角逗号隔开 -->
    <property name="basePackage" value="com.wxisme.ssm.mapper"></property>
    <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"/>
</bean>

不使用则
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
	<property name="dataSource" ref="dataSource" />
	<property name="typeAliasesPackage" value="com.paymoon.basic.po"/>
	<property name="mapperLocations" value="classpath*:com/paymoon/basic/mappers/*.xml" />
</bean>
