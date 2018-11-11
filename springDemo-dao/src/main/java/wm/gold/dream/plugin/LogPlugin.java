package wm.gold.dream.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 19:55
 * @Version 1.0
 *
 * MyBatis 允许你在已映射语句执行过程中的某一点进行拦截调用。默认情况下，MyBatis 允许使用插件来拦截的方法调用包括：
 *
 * Executor (update, query, flushStatements, commit, rollback, getTransaction, close, isClosed)
 * ParameterHandler (getParameterObject, setParameters)
 * ResultSetHandler (handleResultSets, handleOutputParameters)
 * StatementHandler (prepare, parameterize, batch, update, query)
 *
 * @Signature:
 * type:切入的类
 * method:切入的类的哪个方法
 * args:切入类的方法的有哪些参数,用来确定方法的,防止同名重载区别不出来
 */
@Intercepts({@Signature(type= StatementHandler.class, method = "query", args = {Statement.class,ResultHandler.class})})
public class LogPlugin implements Interceptor {
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("------------插件切入----------------");
        return invocation.proceed();
    }
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
    public void setProperties(Properties properties) {
    }
}
