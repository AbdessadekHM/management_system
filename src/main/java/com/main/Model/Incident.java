package com.main.Model;

import java.time.LocalDateTime;
import java.util.*;

import lombok.Getter;


public class Incident {
    @Getter
    private String reference, status;
    @Getter
    private LocalDateTime time;

    @Getter
    private Membre membre;


    public Incident(String reference, String status, LocalDateTime time, Membre membre) {
        this.reference = reference;
        this.status = status;
        this.time = time;
        this.membre = membre;
    }
    
}
