package wm.gold.dream.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 22:53
 * @Version 1.0
 *
 * 引介
 */
@Aspect
@Component
public class UsageTracking {

    @DeclareParents(value="wm.gold.dream.aop.service.servicechild.Service1+", defaultImpl=DefaultUsageTracked.class)
    public static UsageTracked mixin;

}
