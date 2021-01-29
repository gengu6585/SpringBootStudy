package com.zwj.git_springboot_study.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author:zengwenjie
 * @Date:2020/8/27 16:53
 */
public class JDBCUtil {
    private static DruidDataSource dataSource;

    static {

        try {
            Properties properties = new Properties();
            properties.load(com.zwj.git_springboot_study.util.JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /***
     * description: 获取一条连接
     * @param: 无
     * @return: java.sql.Connection
     * @author zwj
     * @date: 2020/8/28 10:35
     */
    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }



    /***
     * description: 关闭连接
     * @param: conn
     * @return: void
     * @author zwj
     * @date: 2020/8/28 10:36
     */
    public static void close(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}


