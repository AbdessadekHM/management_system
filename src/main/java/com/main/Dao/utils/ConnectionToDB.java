package com.main.Dao.utils;

import java.sql.*;

public class ConnectionToDB {
    private String DB_URL = "jdbc:mysql://localhost/management_system";
    private String USERNAME = "root";
    private String PASSWORD = "abdessadek";
    private static Connection conn;
    private static ConnectionToDB instance = new ConnectionToDB();


    private ConnectionToDB(){
        
            try {
                conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
    }
    public static ConnectionToDB getInstance(){
        return instance;
    }

    public Connection getConnection(){
        return conn;
    }

    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


    
}
