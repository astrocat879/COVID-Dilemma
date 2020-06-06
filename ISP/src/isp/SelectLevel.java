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
        civilian = new Button("Civilian");
        civilian.relocate(412,446);
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
        root3.getChildren().add(primeMinister);
        root3.getChildren().add(civilian);
    }
}
