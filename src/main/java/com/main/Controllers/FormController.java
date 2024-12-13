package com.main.Controllers;

import com.main.Dao.impl.MemberDaoImpl;
import com.main.Model.Membre;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FormController {
    @FXML
    public TextField nom ;
    @FXML
    public TextField prenom ;
    @FXML
    public TextField email ;
    @FXML
    public TextField phone ;
    MemberDaoImpl memberDao;




   @FXML
   public void initialize(){
    
    memberDao = MemberDaoImpl.getInstance();

    System.out.println("be happy");

   }

   @FXML
   public void onButtonClick(){
    Membre member = new Membre(nom.getText(),prenom.getText(), email.getText(), phone.getText());
    memberDao.insere(member);
    nom.setText("");
    prenom.setText("");
    email.setText("");
    phone.setText("");
    


   }
}
