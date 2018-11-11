package wm.gold.dream.ioc.other;


/**
 * @Author: wangmeng
 * @Date: 2018/10/29 19:59
 * @Version 1.0
 * 演示方法注入Lookup
 */
public abstract class CommandManager {

    public Object process(Object commandState) {
        Account command = createCommand();
        return command;
    }
    //@Lookup
    public abstract Account createCommand();


}
