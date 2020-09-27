package cn.com.jaav.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *工具类，返回一个connection对象
 */
public class JDBCUtil
{
    private static final String user = "root";
    private static final String passwd = "8546";
    private static final String url = "jdbc:mysql://localhost:3306/employment?characterEncoding=utf8&useSSL=false&serverTimezone=UTC";
    public static Connection getConnection()
    {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url,user,passwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
