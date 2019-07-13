package drui01;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream rs = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.propertise");
        pro.load(rs);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        Connection conn = ds.getConnection();
        //String dbDriver="com.mysql.cj.jdbc.Driver";

    }
}

