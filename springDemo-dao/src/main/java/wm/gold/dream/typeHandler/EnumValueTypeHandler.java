package wm.gold.dream.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import wm.gold.dream.bean.BaseEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 17:30
 * @Version 1.0
 * 你可以创建一个能够处理多个类的泛型类型处理器。为了使用泛型类型处理器， 需要增加一个接受该类的 class 作为参数的构造器，
 * 这样在构造一个类型处理器的时候 MyBatis 就会传入一个具体的类。
 * //GenericTypeHandler.java
 * public class GenericTypeHandler<E extends MyObject> extends BaseTypeHandler<E> {
 *   private Class<E> type;
 *   public GenericTypeHandler(Class<E> type) {
 *     if (type == null) throw new IllegalArgumentException("Type argument cannot be null");
 *     this.type = type;
 *   }
 */
public class EnumValueTypeHandler<E extends BaseEnum> extends BaseTypeHandler<E> {

    private final Class<E> type;
    private final E[] enums;

    public EnumValueTypeHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        } else {
            this.type = type;
            this.enums = (E[])type.getEnumConstants();
            if (this.enums == null) {
                throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
            }
        }
    }

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, e.getValue());
    }

    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String value = resultSet.getString(s);
        return getEnumByValue(value);
    }

    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String value = resultSet.getString(i);
        return getEnumByValue(value);
    }

    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String value = callableStatement.getString(i);
        return getEnumByValue(value);
    }

    private E getEnumByValue(String value){
        if(value!=null){
            for(E e:enums){
                if(e.getValue().equals(value)){
                    return e;
                }
            }
            throw new IllegalArgumentException("Cannot convert " + value + " to Enum");
        }else {
            return null;
        }
    }
}
