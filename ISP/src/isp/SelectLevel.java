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
        Pane root3 = new Pane();
        ISP.s1 = new Scene(root3, 1200, 750);
        Image img  = new Image("LevelSelect.jpg");
        root3.getChildren().add(new ImageView(img));
        
    }
}
