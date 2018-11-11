package wm.gold.dream.ioc.beanwrapper;


import java.beans.PropertyEditorSupport;

/**
 * @Author: wangmeng
 * @Date: 2018/11/9 10:06
 * @Version 1.0
 */
public class CustomCarEditor extends PropertyEditorSupport {

//    public String getAsText() {
//        Car car=(Car)getValue();
//        return car != null ? car.getName()+","+car.getBrand()+","+car.getMaxSpeed() : "";
//    }


    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        if (text == null || text.indexOf(",") == -1) {
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setName(infos[0]);
        car.setBrand(infos[1]);
        car.setMaxSpeed(Double.parseDouble(infos[2]));
        setValue(car);
    }


}
