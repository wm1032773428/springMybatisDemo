package wm.gold.dream.ioc.applicationevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 13:57
 * @Version 1.0
 */
@Component
public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendEmail(String address, String content) {
            System.out.println("send email...");
            publisher.publishEvent(new BlackListEvent(this, address, content));
            return;
    }
}
