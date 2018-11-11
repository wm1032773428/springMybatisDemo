package wm.gold.dream.web;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Author: wangmeng
 * @Date: 2018/11/3 18:39
 * @Version 1.0
 */
public class MyWebAppInitializerForAnnotation extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    /**
     *  问：　/和/*　有什么区别？
     * 　 答： /会拦截除了jsp以外的所有url，/* 会拦截所有url，包括jsp。例如：在webroot下面有一个test.jsp,
     * 当DispatcherServlet 配置映射/ 时，浏览器输入：http://localhost:8083/test.jsp 这个jsp是可以直接访问的，
     * 并且不经过DispatcherServlet ，而当DispatcherServlet 配置映射/* 时，这个请求就会被DispatcherServlet 拦截。
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }

    protected Filter[] getServletFilters() {
        return new Filter[] {
                new HiddenHttpMethodFilter(), new CharacterEncodingFilter() };
    }
}
