package wm.gold.dream.ioc.annotation.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import wm.gold.dream.ioc.other.CommandManager;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 16:18
 * @Version 1.0
 * 如果您不想依赖默认的bean命名策略，则可以提供自定义bean命名策略。
 * 首先，实现 BeanNameGenerator 接口，并确保包含默认的无参数构造函数。
 * 然后，在配置扫描程序时提供完全限定的类名，如以下示例注释和bean定义所示：
 */
@Configuration
@ComponentScan(basePackages = "wm.gold.dream.ioc.annotation.component", nameGenerator = MyNameGenerator.class)
public class BeanNameGeneratorConfig {



}
