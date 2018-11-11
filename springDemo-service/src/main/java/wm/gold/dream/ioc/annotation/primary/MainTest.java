package wm.gold.dream.ioc.annotation.primary;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wm.gold.dream.ioc.annotation.ImportResource.ImportResourceConfig;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MovieConfiguration.class);
        MovieRecommender movieRecommender= applicationContext.getBean("movieRecommender",MovieRecommender.class);
        System.out.println(movieRecommender.getMovieCatalog1());
        System.out.println(movieRecommender.getMovieCatalog2());
    }
}
