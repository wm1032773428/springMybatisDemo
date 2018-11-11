package wm.gold.dream.ioc.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 21:06
 * @Version 1.0
 */
@Service
public class MyService {

    private ConversionService conversionService;

    @Autowired
    public MyService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    public void doIt() {
        //this.conversionService.convert()
    }

    public static void main(String[] args) {
        //创建ConversionService
        ConversionServiceFactoryBean conversionServiceFactoryBean=new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(Collections.singleton(new Converter() {
            public Object convert(Object o) {
                return null;
            }
        }));
        conversionServiceFactoryBean.getObject();

//        转换List的Integer到List的String
        DefaultConversionService cs = new DefaultConversionService();

        List<Integer> input = new ArrayList<Integer>();
        cs.convert(input,
                TypeDescriptor.forObject(input), // List<Integer> type descriptor
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(String.class)));
    }
}