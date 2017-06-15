# basic-transaction Propagation Spring事务传播特性实例解析
Spring事务传播特性实例解析 - 柳波 五期信息技术提高班 - 博客频道 - CSDN.NET
http://blog.csdn.net/liovey/article/details/14149137
传播特性
       该特性是保证事务是否开启，业务逻辑是否使用同一个事务的保证。当事务在传播过程中会受其影响。其传播特性包括：
  1、Propagation.REQUIRED
方法被调用时自动开启事务，在事务范围内使用则使用同一个事务，否则开启新事务。       
  2、Propagation.REQUIRES_NEW
无论何时自身都会开启事务
  3、Propagation.SUPPORTS
自身不会开启事务，在事务范围内则使用相同事务，否则不使用事务
  4、Propagation.NOT_SUPPORTED
自身不会开启事务，在事务范围内使用挂起事务，运行完毕恢复事务
  5、Propagation.MANDATORY
自身不开启事务，必须在事务环境使用否则报错
  6、Propagation.NEVER
自身不会开启事务，在事务范围使用抛出异常
  7、Propagation.NESTED
如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务, 则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行。需要JDBC3.0以上支持。