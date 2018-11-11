package wm.gold.dream;


import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import wm.gold.dream.dao.AuthorMapper;
import wm.gold.dream.entity.Author;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("configuration.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);

//        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
//        Blog blog=blogMapper.selectBlogById(new RowBounds (0,1),40L);
//        System.out.println(blog.getName());
//        sqlSession.commit();
//        blogMapper.selectBlogById(40L);
//        System.out.println(blog.getName());
        //sqlSession.commit();
//        SqlSession sqlSession2=sqlSessionFactory.openSession();
//        BlogMapper blogMapper2=sqlSession2.getMapper(BlogMapper.class);
//        Blog blog2=blogMapper2.selectBlogById(40L);
//        System.out.println(blog2.getName());



//        System.out.println(blog.getAuthor().getEmail());
//        System.out.println(blog.getAuthor().getBio());

//        blogMapper.insert2(blog);
//        System.out.println(blog.getId());
//        sqlSession.commit();
        AuthorMapper authorMapper=sqlSession.getMapper(AuthorMapper.class);

//        Author author=new Author();
//        author.setUsername("asdas");
//        author.setPassword("sfdasd");
//        author.setEmail("sfsdas");
//        int id=authorMapper.insertAuthor(author);
        Author author=authorMapper.selectAuthorById2(1L);
        System.out.println(author.getUsername());
    }

//    本地缓存(BaseExcute里面的PerpetualCache localCache;属性)
//    Mybatis 使用到了两种缓存：本地缓存（local cache）和二级缓存（second level cache）。
//
//    每当一个新 session 被创建，MyBatis 就会创建一个与之相关联的本地缓存。任何在 session 执行过的查询语句本身都会被保存在本地缓存中，那么，相同的查询语句和相同的参数所产生的更改就不会二度影响数据库了。本地缓存会被增删改、提交事务、关闭事务以及关闭 session 所清空。
//
//    默认情况下，本地缓存数据可在整个 session 的周期内使用，这一缓存需要被用来解决循环引用错误和加快重复嵌套查询的速度，所以它可以不被禁用掉，但是你可以设置 localCacheScope=STATEMENT 表示缓存仅在语句执行时有效。
//
//    注意，如果 localCacheScope 被设置为 SESSION，那么 MyBatis 所返回的引用将传递给保存在本地缓存里的相同对象。对返回的对象（例如 list）做出任何更新将会影响本地缓存的内容，进而影响存活在 session 生命周期中的缓存所返回的值。因此，不要对 MyBatis 所返回的对象作出更改，以防后患。
//

//    二级缓存是CachingExecutor


//    有一个方法可以刷新（执行）存储在 JDBC 驱动类中的批量更新语句。当你将 ExecutorType.BATCH 作为 ExecutorType 使用时可以采用此方法。

//    List<BatchResult> flushStatements()  真正执行批量操作的方法
}
