package wm.gold.dream.ioc.annotation.PropertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import wm.gold.dream.ioc.annotation.ImportResource.DreamDataSource;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 11:39
 * @Version 1.0
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class PropertySourceConfig {

    @Autowired
    Environment env;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean("propertySourceDreamDataSource")
    public DreamDataSource dreamDataSource() {

        System.out.println("-------------"+url);
        System.out.println("-------------"+username);
        System.out.println("-------------"+password);

        return new DreamDataSource(env.getProperty("jdbc.url"),
                env.getProperty("jdbc.username"),
                env.getProperty("jdbc.password"));
    }
}
