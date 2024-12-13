package com.main.Dao.impl;

import java.sql.*;
import java.util.Set;

import com.main.Dao.IncidentDao;
import com.main.Model.Incident;

public class IncidentDaoImpl implements IncidentDao {

    private static IncidentDaoImpl instance ;
    private Connection conn;

    @Override
    public void inser(Set<Incident> is) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void inserer(Incident i) {
        String statement = "INSERT INTO incidents(reference, status, time, membre_id) VALUES ("+i.getReference()+","+i.getStatus()+","+i.getTime()+","+i.getMembre_id();

        try {
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public IncidentDaoImpl getInstance(){
        return instance;
    }
    
}
