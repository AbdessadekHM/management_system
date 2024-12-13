package com.main.fileservice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.*;

import com.main.Model.Membre;


public class ReadCsvFiles {

    private static ReadCsvFiles instance = new ReadCsvFiles();
    private Connection conn;

    public static ReadCsvFiles getInstance(){
        return instance;
    }

    public Set<Membre> chargerListMembre(String path){

        URL url = getClass().getResource("/data/" + path);
        if(url == null){
            System.out.println("not exist");
            return null;
        }
        
        File file = new File(url.getPath());

        Set<Membre> membres = new HashSet<>();
        try {
            Scanner reader = new Scanner(file);
            reader.nextLine();
            
            String line;
            while(reader.hasNext()){
                line = reader.next();
                String[] splitedLine = line.split(",");
                membres.add(new Membre(splitedLine[0], splitedLine[1], splitedLine[2], splitedLine[3]));
                

            }
            return membres;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }




    }


    /*
     * Test
     */
    //public static void main(String[] args){
        //Set<Membre> result = ReadCsvFiles.getInstance().chargerListMembre("membres.csv");
        //System.out.println(result);
    //}
    
}
