package wm.gold.dream.ioc.annotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 18:33
 * @Version 1.0
 */
public class MyConditional implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        MultiValueMap<String, Object> attrs = annotatedTypeMetadata.getAllAnnotationAttributes(HasWiFi.class.getName());
        return (Boolean) attrs.get("value1").get(0);
    }

}
