package wm.gold.dream.ioc.format;

import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 21:29
 * @Version 1.0
 *
 * 类似的还有@JsonFormat
 * 前后端调用才能有效果
 */
public class MyModel {

    @NumberFormat(style=NumberFormat.Style.CURRENCY)
    private BigDecimal decimal;

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }


}
