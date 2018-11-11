1,Lookup的使用,解决问题：生命周期不同的bean如何依赖，比如单例依赖多例，首先不能注入了
2,replaced-method,代理类中某个method
3,别名
4,depends-on
5,短的生命周期bean注入长的生命周期
6,PropertyPlaceholderConfigurer属性文件读取
7,FactoryBean 该FactoryBean接口是Spring IoC容器实例化逻辑的可插拔点。如果你有一个复杂的初始化代码，用Java表示，而不是（可能）冗长的XML，你可以创建自己的 FactoryBean，在该类中编写复杂的初始化，然后将自定义FactoryBean插入容器。
    该FactoryBean接口提供了三种方法：
    Object getObject()：返回此工厂创建的对象的实例。实例可以共享，具体取决于此工厂是返回单例还是原型。
    boolean isSingleton()：true如果FactoryBean返回单例或false其他方式返回 。
    Class getObjectType()：返回getObject()方法返回的对象类型，或者null如果事先不知道类型。


Bean的作用范围
    singleton：每个Spring IoC容器仅有一个
    prototype：每次调用都会new一个对象
    request：将单个bean定义范围限定为单个HTTP请求的生命周期吗，仅仅在web的容器有效
    session：将单个bean定义范围限定为HTTP的生命周期Session，仅仅在web的容器有效
    application：将单个bean定义到一个生命周期的范围ServletContext，一个tomcat容器可以有很多Spring IoC容器
    websocket：