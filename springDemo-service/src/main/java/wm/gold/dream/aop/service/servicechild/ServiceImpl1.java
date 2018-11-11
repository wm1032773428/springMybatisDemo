package wm.gold.dream.aop.service.servicechild;

import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/11/9 16:07
 * @Version 1.0
 */
@Component
@ClassAOP
public class ServiceImpl1 implements Service1{
    @MethodAOP
    public void testAop1(ParamObject str){
        System.out.println("testAop1");
    }

    @Override
    public ParamObject testReturnVal(ParamObject str) {
        System.out.println(str);
        return str;
    }

    @Override
    public void testThrowingVal() {
        if(1==1){
            throw new RuntimeException("");
        }
    }

    @Override
    public <T> void testFan(T t) {
        System.out.println(t.getClass());
    }
}
