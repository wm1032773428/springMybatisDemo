package wm.gold.dream.ioc.other;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author: wangmeng
 * @Date: 2018/10/29 20:13
 * @Version 1.0
 */
public class ReplacementComputeValue implements MethodReplacer {

    public Object reimplement(Object o, Method m, Object[] args) throws Throwable {
        String input = (String) args[0];
        System.out.println(m);
        System.out.println(input);
        System.out.println(o);//com.gold.dream.bean.MyValueCalculator$$EnhancerBySpringCGLIB$$36d759aa@1acaf3d  就是代理
        return "";
    }
}
