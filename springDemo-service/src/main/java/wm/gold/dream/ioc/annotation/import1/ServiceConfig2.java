package wm.gold.dream.ioc.annotation.import1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 18:13
 * @Version 1.0
 */
@Configuration
public class ServiceConfig2 {
    @Bean
    public Service2 service2() {
        return new Service2();
    }
}
