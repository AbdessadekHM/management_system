package com.main.Dao;

import java.sql.*;
import java.util.*;

import com.main.Dao.blueprints.MemberDao;
import com.main.Model.Incident;
import com.main.Model.Membre;

public class MemberDaoImpl implements MemberDao {
    private Connection conn;

    private static MemberDaoImpl instance = new MemberDaoImpl();
    @Override
    public List<Incident> chargetListIncidents() {
        String statement = "SELECT * FROM incidents WHERE ";

        try {
            Statement stmt = conn.prepareStatement(statement);
            ResultSet rs = stmt.executeQuery(statement);
            
            List<Incident> incidents = new ArrayList<>();
            while(rs.next()){
                incidents.add(new Incident(rs.getInt("reference"), rs.getString("status"),rs.getString("time"), rs.getInt("membre_id")));

            }
            return incidents;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void insere(Membre m) {
        // TODO Auto-generated method stub
        String statement = "INSERT INTO membres(identifiant, nom, prenom, email, phone) VALUES ("+m.getIdentifiant()+","+m.getNom()+","+m.getPrenom()+","+m.getEmail()+","+m.getPhone();

        try {
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

    public MemberDaoImpl getInstance(){
        return instance;
    }
     
}
