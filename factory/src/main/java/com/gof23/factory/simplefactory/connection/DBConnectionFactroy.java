package com.gof23.factory.simplefactory.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactroy {

    static{
        try {
            // 加载驱动,驱动只需要加载一次,使用静态代码块就可以解决
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * @param url
     * @param username
     * @param password
     * @return
     * @throws SQLException
     */
    // 传入特定参数,返回需要的对象,简单工厂设计模式
    public Connection getConnection(String url,String username,String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }




}
