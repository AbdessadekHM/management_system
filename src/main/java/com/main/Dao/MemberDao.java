package com.main.Dao;

import java.util.List;

import com.main.Model.*;

public interface MemberDao {
    public void insere(Membre m);
    public List<Incident> chargetListIncidents();

    
}
