package com.main.Model;

import java.util.*;

import lombok.Getter;


public class Incident {
    @Getter
    private String reference, status;
    @Getter
    private Date time;

    @Getter
    private Membre membre;


    public Incident(String reference, String status, Date time, Membre membre) {
        this.reference = reference;
        this.status = status;
        this.time = time;
        this.membre = membre;
    }
    
}
