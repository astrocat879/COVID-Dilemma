/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author astro
 */
public class End2 {
    public static void run(Stage window){
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #cc4125; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #a61c00;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #a61c00; ";
        Pane root = new Pane();
        ISP.end2 = new Scene(root, 1200, 750);
        
        Image img  = new Image("GameOverPM.jpg");
        root.getChildren().add(new ImageView(img));
        Button b = new Button("Continue");
         b.relocate(1105,715);
        b.setStyle(b_IDLE_BUTTON_STYLE);
        b.setOnMouseEntered(e -> b.setStyle(b_HOVERED_BUTTON_STYLE));
        b.setOnMouseExited(e -> b.setStyle(b_IDLE_BUTTON_STYLE));
        b.setOnMousePressed(e -> b.setStyle(b_CLICKED_BUTTON_STYLE));
        b.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            window.setScene(ISP.s0);
        });
        root.getChildren().add(b);
     
    }
}
