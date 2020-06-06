/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
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
 *Revision History:
 *  - June 5th, 2020: Created by Justin Zhu
 *  - June 6th, 2020: Updated by Matthew Li
 *  - June 6th, 2020: Updated by Ronald You
 * 
 */
public class SelectLevel {
    public static void run(Stage window){
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #8e7cc3; ; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #674ea7;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #674ea7; ";
        
        final String IDLE_BUTTON_STYLE = "-fx-font-size:40 ;  -fx-background-color: #8e7cc3; -fx-background-radius: 15px; -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; -fx-text-fill: #ffffff;";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; ";
        Pane root3 = new Pane();
        ISP.s1 = new Scene(root3, 1200, 750);
        Image img  = new Image("Level Select.jpg");
        root3.getChildren().add(new ImageView(img));
        
        Button primeMinister, civilian,tut;
        tut = new Button("Tutorial");
        tut.relocate(413,295);
        tut.setPrefSize(375, 91);
        tut.setStyle(IDLE_BUTTON_STYLE);
        tut.setOnMouseEntered(e -> tut.setStyle(HOVERED_BUTTON_STYLE));
        tut.setOnMouseExited(e -> tut.setStyle(IDLE_BUTTON_STYLE));
        tut.setPrefSize(375, 91);
        tut.setOnMousePressed(e -> tut.setStyle(CLICKED_BUTTON_STYLE));
        tut.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.out.println("Achievements");
            window.setScene(ISP.s2);
        });
        
        primeMinister = new Button("Prime Minister");
        primeMinister.relocate(413,447);
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
        civilian = new Button("Civilian");
        civilian.relocate(413,599);
        civilian.setPrefSize(375, 92);
        civilian.setStyle(IDLE_BUTTON_STYLE);
        civilian.setOnMouseEntered(e -> civilian.setStyle(HOVERED_BUTTON_STYLE));
        civilian.setOnMouseExited(e -> civilian.setStyle(IDLE_BUTTON_STYLE));
        civilian.setOnMousePressed(e -> civilian.setStyle(CLICKED_BUTTON_STYLE));
        civilian.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.out.println("Civilian Mode Selected");
            //window.setScene(/**/);
        });
        root3.getChildren().add(tut);
        root3.getChildren().add(primeMinister);
        root3.getChildren().add(civilian);
        
        Button b = new Button("Back");
        b.relocate(3,715);
        b.setStyle(b_IDLE_BUTTON_STYLE);
        b.setOnMouseEntered(e -> b.setStyle(b_HOVERED_BUTTON_STYLE));
        b.setOnMouseExited(e -> b.setStyle(b_IDLE_BUTTON_STYLE));
        b.setOnMousePressed(e -> b.setStyle(b_CLICKED_BUTTON_STYLE));
        b.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            window.setScene(ISP.s0);
        });
        root3.getChildren().add(b);
    }
}
