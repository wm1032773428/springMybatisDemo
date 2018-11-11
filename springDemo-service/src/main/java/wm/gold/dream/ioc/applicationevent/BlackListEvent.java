package wm.gold.dream.ioc.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 13:57
 * @Version 1.0
 */
public class BlackListEvent extends ApplicationEvent {

    private  String address;
    private  String content;

    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlackListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

}
