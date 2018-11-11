package wm.gold.dream.bean;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 16:53
 * @Version 1.0
 */
public enum Color implements BaseEnum<Color>{

    RED("red","1"),
    GREEN("green","2");

    Color(String name, String value) {
        this.name = name;
        this.value = value;
    }

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Color getEnumByValue(String value) {
        for(Color color:values()){
            if(color.value.equals(value)){
                return color;
            }
        }
        return null;
    }
}
