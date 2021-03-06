ch11-spring-web:在web项目中使用spring完成学生注册功能

实现步骤：
    1.创建maven，web项目
    2.加入依赖：
        拷贝ch7-spring-mybatis的依赖
        加入jsp，servlet依赖
    3.拷贝ch7-spring-mybatis的代码和配置文件
    4.创建一个jsp发起请求，有参数id，name，email，age
    5.创建servlet，接收请求参数，调用service，调用dao完成注册
    6.创建一个jsp作为显示结果页面