@AspectJ指的是将方面声明为使用注释注释的常规Java类的样式。作为AspectJ 5版本的一部分，AspectJ项目引入了@AspectJ样式 。
Spring使用AspectJ提供的库来解释与AspectJ 5相同的注释，用于切入点解析和匹配。但是，AOP运行时仍然是纯Spring AOP，
并且不依赖于AspectJ编译器或weaver。

支持的切入点指示符
Spring AOP支持以下AspectJ切入点指示符（PCD）用于切入点表达式：

execution：用于匹配方法执行连接点。这是使用Spring AOP时使用的主要切入点指示符。

within：限制匹配某些类型中的连接点（使用Spring AOP时在匹配类型中声明的方法的执行）。

this：限制与连接点的匹配（使用Spring AOP时执行方法），其中bean引用（Spring AOP代理）是给定类型的实例。

target：限制匹配连接点（使用Spring AOP时执行方法），其中目标对象（被代理的应用程序对象）是给定类型的实例。

args：限制与连接点的匹配（使用Spring AOP时执行方法），其中参数是给定类型的实例。

@target：限制与连接点的匹配（使用Spring AOP时执行方法），其中执行对象的类具有给定类型的注释。

@args：限制与连接点的匹配（使用Spring AOP时执行方法），其中传递的实际参数的运行时类型具有给定类型的注释。

@within：限制匹配到具有给定注释的类型中的连接点（使用Spring AOP时执行在具有给定注释的类型中声明的方法）。

@annotation：限制连接点的匹配，其中连接点的主题（在Spring AOP中执行的方法）具有给定的注释。

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
            throws-pattern?)

以下示例显示了一些常见的切入点表达式：

执行任何公共方法：

execution(public * *(..))
执行名称以以下开头的任何方法set：

execution(* set*(..))
执行AccountService接口定义的任何方法：

execution(* com.xyz.service.AccountService.*(..))
执行service包中定义的任何方法：

execution(* com.xyz.service.*.*(..))
执行服务包或其子包中定义的任何方法：

execution(* com.xyz.service..*.*(..))
服务包中的任何连接点（仅在Spring AOP中执行方法）：

within(com.xyz.service.*)
服务包或其子包中的任何连接点（仅在Spring AOP中执行方法）：

within(com.xyz.service..*)
代理实现AccountService接口的任何连接点（仅在Spring AOP中执行方法） ：

this(com.xyz.service.AccountService)

目标对象实现AccountService接口的任何连接点（仅在Spring AOP中执行方法）：

target(com.xyz.service.AccountService)

采用单个参数的任何连接点（仅在Spring AOP中执行方法）以及在运行时传递的参数是Serializable：

args(java.io.Serializable)

目标对象具有@Transactional注释的任何连接点（仅在Spring AOP中执行方法） ：

@target(org.springframework.transaction.annotation.Transactional)

任何连接点（仅在Spring AOP中执行的方法），其中目标对象的声明类型具有@Transactional注释：

@within(org.springframework.transaction.annotation.Transactional)

任何连接点（仅在Spring AOP中执行方法），其中执行方法具有 @Transactional注释：

@annotation(org.springframework.transaction.annotation.Transactional)

任何连接点（仅在Spring AOP中执行的方法），它接受一个参数，并且传递的参数的运行时类型具有@Classified注释：

@args(com.xyz.security.Classified)

名为的Spring bean上的任何连接点（仅在Spring AOP中执行方法） tradeService：

bean(tradeService)
具有与通配符表达式匹配的名称的Spring bean上的任何连接点（仅在Spring AOP中执行方法）*Service：

bean(*Service)

Spring-AOP @AspectJ切点函数之target()和this()
https://blog.csdn.net/yangshangwei/article/details/77861658


xml和注解比较

xml缺点:不能组合切点
注解支持额外的实例化模型和更丰富的切入点组合

@Pointcut("execution(* get*())")
public void propertyAccess() {}

@Pointcut("execution(org.xyz.Account+ *(..))")
public void operationReturningAnAccount() {}

@Pointcut("propertyAccess() && operationReturningAnAccount()")
public void accountPropertyAccess() {}

在XML样式中，您可以声明前两个切入点：

<aop:pointcut id="propertyAccess"
        expression="execution(* get*())"/>

<aop:pointcut id="operationReturningAnAccount"
        expression="execution(org.xyz.Account+ *(..))"/>

XML方法的缺点是您无法 accountPropertyAccess通过组合这些定义来定义切入点。

官网5.10没看懂