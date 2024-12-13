package com.main.Dao;

import java.util.Set;

import com.main.Model.Incident;

public interface IncidentDao {
    public void inserer(Incident i);
    public void inser(Set<Incident> is);
    
}
