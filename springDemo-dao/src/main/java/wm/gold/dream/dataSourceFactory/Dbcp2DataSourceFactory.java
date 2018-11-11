package wm.gold.dream.dataSourceFactory;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @Author: wangmeng
 * @Date: 2018/11/5 20:58
 * @Version 1.0
 */
public class Dbcp2DataSourceFactory extends UnpooledDataSourceFactory {
    public Dbcp2DataSourceFactory() {
        //父类的setProperties方法会通过反射设置参数
        this.dataSource = new BasicDataSource();
    }
}
