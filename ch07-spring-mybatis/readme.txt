ch07-spring-mybatis的集成：
    步骤：
        1.新建maven项目
        2.加入maven依赖
            1）spring依赖
            2）mybatis依赖
            3）mysql驱动
            4）spring的事务的依赖
            5）mybatis和spring继承的依赖：mybatis官方提供的，用来在spring项目中创建mybatis
                的SqlSessionFactory，dao对象的
        3.创建实体类
        4.创建dao接口和mapper文件
        5.创建mybatis主配置文件
        6.创建Service接口和实现类，属性是dao
        7.创建spring的配置文件：声明mybatis的对象交给spring创建
            1）数据源(DataSource)
            2）SqlSessionFactory
            3）Dao对象
            4）声明自定义的service
        8.创建测试类，获取Service对象，通过service调用到完成数据库的访问。



事务：
    事务的隔离级别：（4个值）
    DEFAULT：采用DB默认的事务隔离级别。Mysql默认为REPEATABLE_READ; Oracle默认为：READ_COMMITTED
    READ_UNCOMMITTED：读未提交，未解决任何并发问题
    READ_COMMITTED：读已提交，解决脏读，存在不可重复读和幻读
    REPEATABLE_READ：可重复读，解决脏读，不可重复读，存在幻读
    SERIALIZABLE：串行化，不存在并发问题。
 PROPAGATION_REQUIRED
 PROPAGATION_REQUIRES_NEW
 PROPAGATION_SUPPORTS
 以上三个需要掌握

 事务提交事务，回滚事务的时机：
 1）当你的业务方法，执行成功，没有抛出异常，当方法执行完毕，spring在方法执行后提交事务，事务管理器commit
 2）当你的业务方法抛出运行时异常或者ERROR，spring执行回滚，调用事务管理器的rollback
    （运行时异常的定义：RuntimeException 和他的子类都是运行时异常，例如：NullPointException，NumberFormatException）
 3）当你的业务方法抛出非运行时异常，主要是受查异常时，提交事务。
    （受查异常：在你写代码中，必须处理的异常，例如IOException，SQLException）

 总结spring事务：
    1.管理事务的是，事务管理和他的实现类
    2.spring的事务是一个统一模型
        1）指定要使用的事务管理器的实现类，使用<bean>
        2）指定哪些类，哪些方法需要加入事务的功能
        3）指定方法需要的隔离接，传播行为，超时等。

    你需要告诉spring，你项目中类信息，方法的名称，方法的事务传播行为。