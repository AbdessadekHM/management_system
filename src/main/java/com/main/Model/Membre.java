package com.main.Model;

import java.util.*;

import lombok.Getter;


public class Membre {
    @Getter
    private int identifiant;
    @Getter
    private String nom, prenom, email, phone;
    private static int id = 0;
    
    private List<Incident> incidents = new ArrayList<>();

    public Membre(String nom, String prenom, String email, String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        identifiant = id;
        id++;
    }

    //when retrieve member from database
    public Membre(int identifiant, String nom, String prenom, String email, String phone) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }
    public void addIncident(Incident incident){
        incidents.add(incident);
    }

    @Override 
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Membre)){
            return false;
        }
        var comparedObject = (Membre) o;

        return comparedObject.getIdentifiant() == this.getIdentifiant();


    }
    
    @Override
    public int hashCode(){
        return identifiant;
    }
    
    
}
