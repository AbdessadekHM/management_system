package com.main.Model;


import lombok.Getter;


public class Incident {
    @Getter
    private int reference;
    @Getter
    private String status;
    @Getter
    private String time;

    @Getter
    private int membre_id;


    public Incident(int reference, String status, String time, int membre) {
        this.reference = reference;
        this.status = status;
        this.time = time;
        this.membre_id = membre;
    }
    
}
