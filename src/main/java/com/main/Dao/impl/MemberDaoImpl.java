package com.main.Dao.impl;

import java.sql.*;
import java.util.*;

import com.main.Dao.MemberDao;
import com.main.Dao.utils.ConnectionToDB;
import com.main.Model.Incident;
import com.main.Model.Membre;

public class MemberDaoImpl implements MemberDao {
    private Connection conn;

    private static MemberDaoImpl instance = new MemberDaoImpl();

    public MemberDaoImpl(){
        conn = ConnectionToDB.getInstance().getConnection();
    }
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
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void insere(Membre m) {
        System.out.println(m.getIdentifiant());
        System.out.println(m.getNom());
        System.out.println(m.getPrenom());
        System.out.println(m.getEmail());
        System.out.println(m.getPhone());
        String statement = "INSERT INTO membres(identifiant, nom, prenom, email, phone) VALUES ("+
         m.getIdentifiant()+","+
        "'"+ m.getNom()+"', "+
        "'"+ m.getPrenom()+"', "+
        "'"+ m.getEmail()+"', "+
        "'"+ m.getPhone()+"')";
        System.out.println(statement);
        try {
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }

    public static MemberDaoImpl getInstance(){
        return instance;
    }
     
}
