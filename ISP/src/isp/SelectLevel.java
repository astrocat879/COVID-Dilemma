/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.util.*;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView; 
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
/**
 *
 * @author astro
 */
public class SelectLevel {
    public static void run(Stage s){
        final String IDLE_BUTTON_STYLE = "-fx-font-size:40 ;  -fx-background-color: #8e7cc3; -fx-background-radius: 15px; -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; -fx-text-fill: #ffffff;";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; ";
        Pane root3 = new Pane();
        ISP.s1 = new Scene(root3, 1200, 750);
        Image img  = new Image("Level Select.jpg");
        root3.getChildren().add(new ImageView(img));
        
        Button primeMinister, civilian;
        primeMinister = new Button("Prime Minister");
        primeMinister.relocate(412,292);
        primeMinister.setPrefSize(375, 92);
        primeMinister.setStyle(IDLE_BUTTON_STYLE);
        primeMinister.setOnMouseEntered(e -> primeMinister.setStyle(HOVERED_BUTTON_STYLE));
        primeMinister.setOnMouseExited(e -> primeMinister.setStyle(IDLE_BUTTON_STYLE));
        primeMinister.setOnMousePressed(e -> primeMinister.setStyle(CLICKED_BUTTON_STYLE));
        primeMinister.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.out.println("Prime Minister Mode Selected");
            //window.setScene(/**/);
        });
        root3.getChildren().add(primeMinister);
    }
}
