package wm.gold.dream.ioc.annotation.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wm.gold.dream.ioc.annotation.primary.MovieCatalog;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 15:15
 * @Version 1.0
 */
@Configuration
@ComponentScan("wm.gold.dream.ioc.annotation.qualifier")
public class MovieConfiguration2 {
    @Bean
    @MovieQualifier(format=Format.VHS, genre="Action")
    public MovieCatalog actionVhsCatalog1() {
        return new MovieCatalog(1);
    }

    @Bean
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    public MovieCatalog actionVhsCatalog2() {
        return new MovieCatalog(2);
    }

    @Bean
    @MovieQualifier(format=Format.DVD, genre="Action")
    public MovieCatalog actionVhsCatalog3() {
        return new MovieCatalog(3);
    }

    @Bean
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    public MovieCatalog actionVhsCatalog4() {
        return new MovieCatalog(4);
    }
}
