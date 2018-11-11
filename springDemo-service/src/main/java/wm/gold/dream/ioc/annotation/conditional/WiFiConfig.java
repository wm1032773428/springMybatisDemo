package wm.gold.dream.ioc.annotation.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 18:34
 * @Version 1.0
 */
@Configuration
@HasWiFi(value1 = true)
public class WiFiConfig {
    @Bean
    public WiFi wiFi() {
        return new WiFi();
    }
}
