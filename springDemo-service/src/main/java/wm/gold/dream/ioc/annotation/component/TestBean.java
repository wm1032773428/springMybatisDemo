package wm.gold.dream.ioc.annotation.component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 16:05
 * @Version 1.0
 */
public class TestBean {

    public void init() {
       System.out.println("------------init-------------");
    }

    public void cleanup() {
        System.out.println("------------cleanup-------------");
    }
}
