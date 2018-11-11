package wm.gold.dream.ioc.convert;

import org.springframework.core.CollectionFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.lang.Nullable;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 20:47
 * @Version 1.0
 *
 * srping的东西 实现GenericConverter接口
 *
 * 当您需要复杂的Converter实现时，请考虑使用该GenericConverter 接口。使用更灵活但不太强类型的签名Converter，GenericConverter 支持在多个源类型和目标类型之间进行转换。此外， GenericConverter还可以在实现转换逻辑时使用可用的源和目标字段上下文。这样的上下文允许类型转换由字段注释或在字段签名上声明的通用信息驱动。以下清单显示了以下接口定义GenericConverter：
 *
 * 运用 ConditionalGenericConverter
 * 有时，Converter只有在特定条件成立时才需要运行。例如，您可能希望Converter仅在目标字段上存在特定注释时运行，
 * 或者Converter仅static valueOf在目标类上定义特定方法（例如方法）时才运行。
 * ConditionalGenericConverter是GenericConverter和 ConditionalConverter接口的联合，
 * 可以让您定义这样的自定义匹配条件：matches方法实现
 */
final class ArrayToCollectionConverter implements ConditionalGenericConverter {
    private final ConversionService conversionService;

    public ArrayToCollectionConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(Object[].class, Collection.class));
    }

    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return true;
    }

    @Nullable
    public Object convert(@Nullable Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        if (source == null) {
            return null;
        } else {
            int length = Array.getLength(source);
            TypeDescriptor elementDesc = targetType.getElementTypeDescriptor();
            Collection<Object> target = CollectionFactory.createCollection(targetType.getType(), elementDesc != null ? elementDesc.getType() : null, length);
            int i;
            Object sourceElement;
            if (elementDesc == null) {
                for(i = 0; i < length; ++i) {
                    sourceElement = Array.get(source, i);
                    target.add(sourceElement);
                }
            } else {
                for(i = 0; i < length; ++i) {
                    sourceElement = Array.get(source, i);
                    Object targetElement = this.conversionService.convert(sourceElement, sourceType.elementTypeDescriptor(sourceElement), elementDesc);
                    target.add(targetElement);
                }
            }

            return target;
        }
    }
}
