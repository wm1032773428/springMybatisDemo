package wm.gold.dream.resultHandler;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import wm.gold.dream.entity.Blog;

/**
 * @Author: wangmeng
 * @Date: 2018/11/6 15:27
 * @Version 1.0
 */
public class MyResultHandler implements ResultHandler {
    public void handleResult(ResultContext resultContext) {
        Blog blog = (Blog) resultContext.getResultObject();

//        构造一些其他的东西
    }
}
