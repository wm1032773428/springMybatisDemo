package wm.gold.dream.ioc.annotation.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 11:09
 * @Version 1.0
 * 激活:ctx.getEnvironment().setActiveProfiles("development");
 * @Profile也可以修饰类
 */
@Configuration
public class StandaloneDataConfig {

    @Bean("lastDataSource")
    @Profile("development")
    public DreamDataSource devDataSource() {
        return new DreamDataSource("","dev","dev");
    }

    @Bean("lastDataSource")
    @Profile("production")
    public DreamDataSource prdDataSource() throws Exception {
        return new DreamDataSource("","prd","prd");
    }

    @Bean("lastDataSource")
    @Profile("default")
    public DreamDataSource defaultDataSource() throws Exception {
        return new DreamDataSource("","default","default");
    }
}
