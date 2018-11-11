package wm.gold.dream.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 18:25
 * @Version 1.0
 *
 * 在类型处理器的配置元素（typeHandler element）上增加一个 javaType 属性（比如：javaType="String"）；
 * 在类型处理器的类上（TypeHandler class）增加一个 @MappedTypes 注解来指定与其关联的 Java 类型列表。 如果在 javaType 属性中也同时指定，则注解方式将被忽略。
 *
 * 在类型处理器的配置元素上增加一个 jdbcType 属性（比如：jdbcType="VARCHAR"）；
 * 在类型处理器的类上（TypeHandler class）增加一个 @MappedJdbcTypes 注解来指定与其关联的 JDBC 类型列表。 如果在 jdbcType 属性中也同时指定，则注解方式将被忽略。
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Date.class)
public class DateTypeHandler extends BaseTypeHandler<Date> {

    public static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public DateTypeHandler() {

    }

    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, simpleDateFormat.format(parameter));
    }

    public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String dateStr = rs.getString(columnName);
        return getDateFromStr(dateStr);
    }

    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String dateStr = rs.getString(columnIndex);
        return getDateFromStr(dateStr);
    }

    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String dateStr = cs.getString(columnIndex);
        return getDateFromStr(dateStr);
    }

    private Date getDateFromStr(String str){
        try {
            return str != null ? simpleDateFormat.parse(str) : null;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Cannot parse " + str + " to Date");
    }
}
