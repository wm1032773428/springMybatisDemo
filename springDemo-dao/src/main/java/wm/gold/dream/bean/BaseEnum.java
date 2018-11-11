package wm.gold.dream.bean;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 17:36
 * @Version 1.0
 */
public interface BaseEnum<E> {

    String getValue();

    E getEnumByValue(String value);

}
