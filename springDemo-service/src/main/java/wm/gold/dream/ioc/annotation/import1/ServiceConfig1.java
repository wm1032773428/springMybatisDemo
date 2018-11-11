package wm.gold.dream.ioc.annotation.import1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 18:15
 * @Version 1.0
 */
@Configuration
public class ServiceConfig1 {
    @Bean
    public Service1 service1() {
        return new Service1();
    }
}
