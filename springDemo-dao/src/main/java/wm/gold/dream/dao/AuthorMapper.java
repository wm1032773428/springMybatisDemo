package wm.gold.dream.dao;

import org.apache.ibatis.annotations.*;
import wm.gold.dream.entity.Author;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 23:01
 * @Version 1.0
 */
public interface AuthorMapper {


    @Insert("insert into author(id, username,password,email) values(#{id}, #{username}, #{password}, #{email})")
    @SelectKey(statement="select max(id)+1 a from author", keyProperty="id", before=true, resultType=Long.class)
    int insertAuthor(Author author);

    @Results(id="resultAuthorMap",value = {
     @Result(property = "id",column = "id",id = true),
     @Result(property = "username",column = "username"),
     @Result(property = "password",column = "password"),
     @Result(property = "email",column = "email")
    })
    @Select("select * from author where id=#{id}")
    Author selectAuthorById(Long id);

    @Results(id = "resultAuthorMap2")
    @ConstructorArgs
    @Select("select * from author where id=#{id}")
    Author selectAuthorById2(Long id);


//todo    这个例子展示了如何使用 @Flush 注解去调用 SqlSession#flushStatements()：
//
//    @Flush
//    List<BatchResult> flush();
}
