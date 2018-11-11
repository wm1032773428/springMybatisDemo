package wm.gold.dream.web.format;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Author: wangmeng
 * @Date: 2018/11/4 2:18
 * @Version 1.0
 */
public class DateFormatter implements Formatter<Date> {
    // 日期类型模板：如yyyy-MM-dd
    private String datePattern;
    // 日期格式化对象
    private SimpleDateFormat dateFormat;

    // 构造器，通过依赖注入的日期类型创建日期格式化对象
    public DateFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
    }

    // 显示Formatter<T>的T类型对象
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }

    // 解析文本字符串返回一个Formatter<T>的T类型对象。
    public Date parse(String source, Locale locale) throws ParseException {
        try {
            return dateFormat.parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
