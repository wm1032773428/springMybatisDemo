package wm.gold.dream.dao;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import wm.gold.dream.entity.Blog;
import wm.gold.dream.entity.Post;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 15:16
 * @Version 1.0
 */
public interface BlogMapper {


    Blog selectBlogById(Long id);

    //Blog selectBlogById2(Long id);

    Blog selectBlogById3(Long id);

    Blog selectBlogById4(Long id);

    Blog selectBlogById5(Long id);

    Blog selectBlogById6(Long id);

    Blog selectBlogById7(Long id);

    Post selectBlogById8(Long id);

    Long insert(Blog blog);

    Long insert2(Blog blog);

    int updateBlogById(String name);


//    从被 ResultHandler 调用的方法返回的数据不会被缓存。
    void selectBlogById(ResultHandler resultHandler, Long id);

//假分页
    Blog selectBlogById(RowBounds rowBounds, Long id);
}
