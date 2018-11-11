package wm.gold.dream.ioc.annotation.import1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 18:14
 * @Version 1.0
 * 在大多数实际情况中，bean跨配置类彼此依赖。使用XML时，这不是问题，因为不涉及编译器，
 * 并且您可以声明 ref="someBean"并信任Spring在容器初始化期间解决它。
 * 但是注解形式的必须用Import才不会有编译错误
 */
@Configuration
@Import({ServiceConfig1.class, ServiceConfig2.class})
public class ServiceConfig {

//    @Autowired
//    private Service1 service1;
//
//    @Autowired
//    private Service2 service2;


    @Bean
    public Service3 accountRepository(Service1 service1,Service2 service2) {
        System.out.println(service1);
        System.out.println(service2);
        return new Service3();
    }
}
