package wm.gold.dream.ioc.applicationevent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 14:30
 * @Version 1.0
 */
@Component
public class BlackListNotifierFroAnn {
    @EventListener
    @Order(2)
    public void processBlackListEvent(ApplicationEvent event) {
        System.out.println("get email for annotation...");
    }
//    如果需要在另一个侦听器之前调用一个侦听器，则可以将@Order 注释添加到方法声明中，如以下示例所示：
    @EventListener({BlackListEvent.class})
    @Order(1)
    public void handleContextStart(BlackListEvent event) {
        System.out.println("get BlackListEvent for annotation..."+event.getContent());
    }



}
