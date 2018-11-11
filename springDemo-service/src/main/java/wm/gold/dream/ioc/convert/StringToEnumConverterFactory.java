package wm.gold.dream.ioc.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 20:46
 * @Version 1.0
 *
 * srping的东西 实现ConverterFactory接口
 *
 * 当您需要集中整个类层次结构的转换逻辑时（例如，从String转换为java.lang.Enum对象时），您可以实现 ConverterFactory
 */
final class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {

    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnumConverter(targetType);
    }

    private final class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

        private Class<T> enumType;

        public StringToEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        public T convert(String source) {
            return (T) Enum.valueOf(this.enumType, source.trim());
        }
    }
}
