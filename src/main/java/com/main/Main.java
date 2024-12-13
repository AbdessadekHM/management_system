package com.main;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.main.Dao.utils.ConnectionToDB;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatedTime = formatObj.format(time);

        System.out.println(formatedTime);
        System.out.println("Hello world!");

        Connection conn = ConnectionToDB.getInstance().getConnection();
    }
}