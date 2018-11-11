package wm.gold.dream.ioc.annotation.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 13:50
 * @Version 1.0
 */
@Configuration
@ComponentScan("wm.gold.dream.ioc.annotation.resource")
public class FamilyConfiguration {
    @Bean("aaa")
    public Family family1() {
        return new Family();
    }

    @Bean("bbb")
    public Family family2() {
        return new Family();
    }
}
