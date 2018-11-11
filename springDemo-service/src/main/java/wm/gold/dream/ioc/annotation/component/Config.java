package wm.gold.dream.ioc.annotation.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 15:51
 * @Version 1.0
 * Spring提供进一步典型化注解：@Component，@Service，和 @Controller。@Component是任何Spring管理组件的通用构造型。
 * 要自动检测这些类并注册相应的bean，您需要添加 @ComponentScan到您的@Configuration类，其中该basePackages属性是两个类的公共父包。
 * （或者，您可以指定以逗号或分号或空格分隔的列表，其中包含每个类的父包。）
 */
@Configuration
@ComponentScan(basePackages = "wm.gold.dream.ioc.annotation.component",
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value=Repository.class))
public class Config  {
// 最后，单个类可以@Bean为同一个bean 保存多个方法，作为根据运行时可用依赖性使用的多个工厂方法的安排。
// 这与在其他配置方案中选择“最贪婪”构造函数或工厂方法的算法相同：在构造时选择具有最多可满足依赖项的变体，
// 类似于容器在多个@Autowired构造函数之间进行选择的方式。
    @Bean
    @Qualifier("public")
    @Scope("prototype")
    public TestBean publicInstance() {
        return new TestBean();
    }

    @Bean(initMethod = "init",destroyMethod = "cleanup")
    protected TestBean protectedInstance(
            @Qualifier("public") TestBean spouse) {
        TestBean tb = new TestBean();
        return tb;
    }

    @Bean(name = "myThing")
    public TestBean privateInstance() {
        return new TestBean();
    }

    @Bean(name = { "dataSource1", "subsystemA-dataSource", "subsystemB-dataSource" })
    public TestBean requestScopedInstance() {
        return new TestBean();
    }
}
