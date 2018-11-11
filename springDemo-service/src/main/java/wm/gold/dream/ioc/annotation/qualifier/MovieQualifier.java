package wm.gold.dream.ioc.annotation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 15:13
 * @Version 1.0
 *
 * 在某些情况下，使用没有值的注释可能就足够了。当注释用于更通用的目的并且可以跨多种不同类型的依赖项应用时
 */
@Target({ElementType.FIELD, ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MovieQualifier {

    String genre();

    Format format();
}
