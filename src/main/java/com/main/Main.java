package com.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader  fxmlLoader = new FXMLLoader(Main.class.getResource("/View/form.fxml"));
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
            stage.setTitle("add to db");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("hello");
            e.printStackTrace();
        }

    }


}