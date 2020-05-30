/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.util.Timer;
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
public class tutorial {
    public static void run(Stage window){
        // tutorial scene
        Pane root2 = new Pane();
        Image bg  = new Image("Tutorial.jpg");
        root2.getChildren().add(new ImageView(bg));
        ISP.s2 = new Scene(root2, 1200, 750);
        
//        window.setTitle("Covid Dilemma");
//        window.setScene(ISP.s2);
//        window.show();
    }
}
