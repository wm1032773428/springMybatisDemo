package wm.gold.dream.ioc.annotation.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 14:34
 * @Version 1.0
 */
@Configuration
@ComponentScan("wm.gold.dream.ioc.annotation.primary")
public class MovieConfiguration {


//由于按类型自动装配可能会导致多个候选人，因此通常需要对选择过程有更多控制权。
// 实现这一目标的一种方法是使用Spring的 @Primary注释。@Primary表示当多个bean可以自动装配到单值依赖项时，
// 应该优先选择特定的bean。如果候选者中只存在一个主bean，则它将成为自动装配的值。
    @Bean
    @Primary
    public MovieCatalog firstMovieCatalog() {
        return new MovieCatalog(1);
    }
//    当您需要更多控制选择过程时，可以使用Spring的@Qualifier注释。
// 您可以将限定符值与特定参数相关联，缩小类型匹配集，以便为每个参数选择特定的bean。
// 在最简单的情况下，这可以是一个简单的描述性值
    @Bean
    @Qualifier("wm")//精确匹配，优先级更高
    public MovieCatalog secondMovieCatalog() {
        return new MovieCatalog(2);
    }

}