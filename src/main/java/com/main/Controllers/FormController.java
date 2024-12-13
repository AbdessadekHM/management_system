package com.main.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FormController {
    @FXML
    public TextField nom, prenom, email, phone ;



   @FXML
   public void initialize(){
    
    phone.textProperty().addListener((observale, oldvalue, newvlaue) -> {
        System.out.println(newvlaue);
    });
   }
}
