package wm.gold.dream.ioc.applicationevent;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wm.gold.dream.ioc.beanwrapper.Car;
import wm.gold.dream.ioc.beanwrapper.CustomCarEditor;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangmeng
 * @Date: 2018/11/9 10:28
 * @Version 1.0
 */
@Configuration
@ComponentScan("wm.gold.dream.ioc.applicationevent")
public class Config {

}
