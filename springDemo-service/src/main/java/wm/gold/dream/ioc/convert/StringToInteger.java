package wm.gold.dream.ioc.convert;

import org.springframework.core.convert.converter.Converter;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 20:44
 * @Version 1.0
 *
 *  实现Converter接口
 */
final class StringToInteger implements Converter<String, Integer> {

    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
