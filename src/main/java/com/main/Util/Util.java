package com.main.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public static String timeFormatter(LocalDateTime time){

        System.out.println(time);
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatedTime = formatObj.format(time);
        return formatedTime;


    }
    
}
