package com.main.Dao.blueprints;

import java.util.List;

import com.main.Model.*;

public interface MemberDao {
    public void insere(Membre m);
    public List<Incident> chargetListIncidents();

    
}
