package wm.gold.dream.aop.service.servicechild;

/**
 * @Author: wangmeng
 * @Date: 2018/11/9 16:32
 * @Version 1.0
 */
public interface Service1 {
    void testAop1(ParamObject str);


    ParamObject testReturnVal(ParamObject str);

    void testThrowingVal();

    <T> void testFan(T t);
}
