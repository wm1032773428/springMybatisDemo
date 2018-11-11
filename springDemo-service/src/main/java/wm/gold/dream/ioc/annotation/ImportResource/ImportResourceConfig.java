package wm.gold.dream.ioc.annotation.ImportResource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 10:21
 * @Version 1.0
 */
@Configuration
@ImportResource("classpath:application-ioc-other.xml")
public class ImportResourceConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DreamDataSource dreamDataSource() {
        return new DreamDataSource(url, username, password);
    }
}
