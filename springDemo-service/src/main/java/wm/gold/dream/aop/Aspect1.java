package wm.gold.dream.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import wm.gold.dream.aop.service.servicechild.MethodAOP;
import wm.gold.dream.aop.service.servicechild.ParamObject;

/**
 * @Author: wangmeng
 * @Date: 2018/11/9 15:45
 * @Version 1.0
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class Aspect1 {

    @Before("execution(public * *(..))")
    public void testPointcut1() {
        System.out.println("-------------增强器执行1--------------");
    }

    @Before("execution(* test*(..))")
    public void testPointcut2() {
        System.out.println("-------------增强器执行2--------------");
    }

    @Before("execution(* wm.gold.dream.aop.service.servicechild.ServiceImpl1.*(..))")
    public void testPointcut3() {
        System.out.println("-------------增强器执行3--------------");
    }

    @Before("execution(* wm.gold.dream.aop.service.servicechild.*.*(..))")
    public void testPointcut4() {
        System.out.println("-------------增强器执行4--------------");
    }

    @Before("execution(* wm.gold.dream.aop.service..*.*(..))")
    public void testPointcut5() {
        System.out.println("-------------增强器执行5--------------");
    }

    @Before("within(wm.gold.dream.aop.service.servicechild.*)")
    public void testPointcut6() {
        System.out.println("-------------增强器执行6--------------");
    }

    @Before("within(wm.gold.dream.aop.service..*)")
    public void testPointcut7() {
        System.out.println("-------------增强器执行7--------------");
    }

    @Before("this(wm.gold.dream.aop.service.servicechild.Service1)")
    public void testPointcut8() {
        System.out.println("-------------增强器执行8--------------");
    }

    @Before("target(wm.gold.dream.aop.service.servicechild.Service1)")
    public void testPointcut9() {
        System.out.println("-------------增强器执行9--------------");
    }

    @Before("args(wm.gold.dream.aop.service.servicechild.ParamObject)")
    public void testPointcut10() {
        System.out.println("-------------增强器执行10--------------");
    }

    @Before("args(wm.gold.dream.aop.service.servicechild.ParamObject)")
    public void testPointcut11() {
        System.out.println("-------------增强器执行11--------------");
    }

    @Before("@target(wm.gold.dream.aop.service.servicechild.ClassAOP)")
    public void testPointcut12() {
        System.out.println("-------------增强器执行12--------------");
    }

    @Before("@within(wm.gold.dream.aop.service.servicechild.ClassAOP)")
    public void testPointcut13() {
        System.out.println("-------------增强器执行13--------------");
    }

    @Before("@annotation(wm.gold.dream.aop.service.servicechild.MethodAOP)")
    public void testPointcut14() {
        System.out.println("-------------增强器执行14--------------");
    }

    @Before("@args(wm.gold.dream.aop.service.servicechild.ParamAOP)")
    public void testPointcut15() {
        System.out.println("-------------增强器执行15--------------");
    }

    @Before("bean(serviceImpl1)")
    public void testPointcut16() {
        System.out.println("-------------增强器执行16--------------");
    }

    @Before("bean(*Impl1)")
    public void testPointcut17() {
        System.out.println("-------------增强器执行17--------------");
    }

    //    将异返回传递给建议
    @AfterReturning(
            pointcut = "execution(* testReturn*(..))",
            returning = "retVal")
    public void testPointcut18(Object retVal) {
        System.out.print("增强器执行18------------"+retVal);
    }

    //    将异常传递给建议
    @AfterThrowing(value = "execution(* testThrowing*(..))", throwing = "e")
    public void testPointcut19(Exception e) {
        System.out.print("增强器执行19------------"+e);
    }

    @Around("execution(* testReturn*(..))")
    public Object testPointcut20(ProceedingJoinPoint pjp) throws Throwable {

        pjp.getArgs();//返回方法参数。
        pjp.getThis();//返回代理对象。
        pjp.getTarget();//返回目标对象
        pjp.getSignature();//返回正在建议的方法的描述。
        // start stopwatch
        Object retVal = pjp.proceed();
        // stop stopwatch
        return retVal;
    }

    //    将参数传递给建议
    @Before("execution(* testReturn*(..)) && args(account,..)")
    public void testPointcut21(ParamObject account) {
        System.out.print("增强器执行21------------"+account);
    }

    //    将注解传递给建议
    @Before("execution(* testAop1*(..)) && @annotation(auditable)")
    public void testPointcut22(MethodAOP auditable) {
        System.out.print("增强器执行22------------"+auditable);
    }

    //    对于泛型可以只拦截一种类型
    @Before("execution(* testFan*(..)) && args(param)")
    public void testPointcut23(String param) {
        System.out.print("增强器执行23------------"+param);
    }

    @Pointcut(value="execution(* testFan*(..)) && args(param)",argNames="param")
    public void pointcut1(String param){}

    @Before(value="pointcut1(param)",argNames="param")
    public void testPointcut24(String param){
        System.out.print("增强器执行24------------"+param);
    }
}
