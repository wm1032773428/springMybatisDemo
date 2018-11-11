package wm.gold.dream.web;


import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;
import wm.gold.dream.web.format.DateFormatter;
import wm.gold.dream.web.interceptor.MyHandlerInterceptor;

import java.text.SimpleDateFormat;
import java.util.List;

//
// import javax.xml.bind.Binder;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.JsonGenerator;
//
//
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import com.fasterxml.jackson.dataformat.smile.SmileFactory;
//import com.google.gson.Gson;
//import javax.json.bind.Jsonb;

/**
 * @Author: wangmeng
 * @Date: 2018/11/3 20:16
 * @Version 1.0
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {
        contentNegotiationConfigurer.
                //是否通过请求Url的扩展名来决定media type
                        favorPathExtension(true)
                //忽请求的Accept请求头
                .ignoreAcceptHeader(true)
                //设置一个默认的返回内容形式，当未明确指定返回内容形式时，使用此设置
                .defaultContentType(MediaType.APPLICATION_JSON)
                //请求以.html结尾的会被当成xml返回
                .mediaType("xml", MediaType.TEXT_XML)
                //请求以.json结尾的会被当成json返回
                .mediaType("json", MediaType.APPLICATION_JSON)
                .mediaType("html", MediaType.TEXT_HTML);
    }

    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    /**
     * 其实可以理解为DispatcherServlet破坏了Servlet的一个特性（根目录下的文件可以直接访问），
     * DefaultServletHttpRequestHandler是帮助回归这个特性的。
     * http://localhost:8080/index.jsp
     *
     * @param defaultServletHandlerConfigurer
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {
        defaultServletHandlerConfigurer.enable();
    }

    /**
     * 解决入参的类型转换
     * @param formatterRegistry
     */
    public void addFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    /**
     * 拦截器
      * @param interceptorRegistry
     */
    public void addInterceptors(InterceptorRegistry interceptorRegistry) {
        interceptorRegistry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/hello").excludePathPatterns("/emp/toLogin", "/emp/login", "/js/**", "/css/**", "/images/**");
    }

    /**
     * 此方法用来专门注册一个Handler，来处理静态资源的，例如：图片，js，css等。举例：
     *
     * @param resourceHandlerRegistry
     */
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {
        resourceHandlerRegistry.addResourceHandler("/resource/**").addResourceLocations("/WEB-INF/static/");
    }

    public void addCorsMappings(CorsRegistry corsRegistry) {

    }

    /**
     * 在调用时立即转发到视图的快捷方式。如果在视图生成响应之前没有要执行的Java控制器逻辑，则可以在静态情况下使用它。
     *
     * @param viewControllerRegistry
     */
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        viewControllerRegistry.addViewController("/app").setViewName("index");
    }

    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {
        viewResolverRegistry.jsp("/WEB-INF/jsp/", ".jsp").viewClass(JstlView.class);

        //找到指定的xml解析成beanFactory，然后根据viewName去beanFactory找view对象，有缓存
        XmlViewResolver xmlViewResolver = new XmlViewResolver();

        //通过viewName为id去spring容器找view对象，无缓存
        BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
        beanNameViewResolver.setOrder(1);

        //以baseName开头的properties配置文件都被解析
        ResourceBundleViewResolver resourceBundleViewResolver = new ResourceBundleViewResolver();
        resourceBundleViewResolver.setBasenames("views");
        resourceBundleViewResolver.setOrder(2);

        viewResolverRegistry.viewResolver(xmlViewResolver);
        viewResolverRegistry.viewResolver(beanNameViewResolver);
        viewResolverRegistry.viewResolver(beanNameViewResolver);
    }

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    //    而要动用这些消息转换器，需要在特定的位置加上@RequestBody和@ResponseBody。
    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
                .indentOutput(true)
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        list.add(new MappingJackson2HttpMessageConverter(builder.build()));
        list.add(new MappingJackson2XmlHttpMessageConverter(builder.createXmlMapper(true).build()));
    }

    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {
        System.out.println("***************"+list.size());
    }

    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {
        //list.add(new AllExceptionResolver());

    }

    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    //如果写了就把spring默认的覆盖了
    public Validator getValidator() {
        return null;
    }

    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
