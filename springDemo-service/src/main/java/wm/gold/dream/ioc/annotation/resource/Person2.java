package wm.gold.dream.ioc.annotation.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 12:13
 * @Version 1.0
 * @Resource 采用名称属性。默认情况下，Spring将该值解释为要注入的bean名称。
 * 换句话说，它遵循按名称语义仅支持具有单个参数的字段和bean属性setter方法。ByName
 * 如果未明确指定名称，则默认名称是从字段名称或setter方法派生的。
 * 如果是字段，则采用字段名称。在setter方法的情况下，则采用方法形参名字
 * 不能用集合接收
 * <p>
 * 首先匹配名字,没有名字匹配类型,如果匹配类型有多个则报错
 */
@Component
public class Person2 {
    @Resource(name = "bbb")
    private Family family1;

    //@Resource(name="aaa",type = Family.class)
    private Family family2;

    public Family getFamily1() {
        return family1;
    }

    public void setFamily1(Family family1) {
        this.family1 = family1;
    }


    public Family getFamily2() {
        return family2;
    }

    //采用方法形参名字
    @Resource
    public void setFamily2(Family bbb) {
        this.family2 = bbb;
    }
}
