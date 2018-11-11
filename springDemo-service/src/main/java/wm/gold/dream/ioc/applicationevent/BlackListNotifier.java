package wm.gold.dream.ioc.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 13:58
 * @Version 1.0
 */
@Component
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("get email..."+event.getContent());
}
}
