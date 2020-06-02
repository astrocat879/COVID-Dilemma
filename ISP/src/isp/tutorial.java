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
import javafx.scene.control.Label;
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
public class Tutorial {
    public static int idx = 0;
    public static int [] factors = new int [2];
    public static void run(Stage window){
        // tutorial scene
        idx = 0;
        factors[0] = 50;
        factors[1] = 50;
        Pane root2 = new Pane();
        Image bg  = new Image("TutorialScreen.jpg");
        root2.getChildren().add(new ImageView(bg));
        ISP.s2 = new Scene(root2, 1200, 750);
        
        
        Label quest = new Label(ISP.TutEvents.get(idx).question);
        Button option1 = new Button(ISP.TutEvents.get(idx).answer1);
        Button option2 = new Button(ISP.TutEvents.get(idx).answer2);
        quest.relocate(400, 200);
        option1.relocate(400, 400);
        option2.relocate(650, 400);
        root2.getChildren().add(quest);
        root2.getChildren().add(option1);
        root2.getChildren().add(option2);
        
        Button b = new Button("Back");
        root2.getChildren().add(b);
        b.setOnAction(actionEvent -> window.setScene(ISP.s0));
        
        option1.setOnAction(actionEvent -> {
            for (int i=0;i<ISP.TutEvents.get(idx).factor1.length;i++){
                factors[ISP.TutEvents.get(idx).factor1[i]] += ISP.TutEvents.get(idx).amount1[i];
            }
            System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                window.setScene(ISP.s0);
            }
            else{
                quest.setText(ISP.TutEvents.get(idx).question);
                option1.setText(ISP.TutEvents.get(idx).answer1);
                option2.setText(ISP.TutEvents.get(idx).answer2);
            }
        });
        option2.setOnAction(actionEvent -> {
            for (int i=0;i<ISP.TutEvents.get(idx).factor2.length;i++){
                factors[ISP.TutEvents.get(idx).factor2[i]] += ISP.TutEvents.get(idx).amount2[i];
            }
            System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                window.setScene(ISP.s0);
            }
            else{
                quest.setText(ISP.TutEvents.get(idx).question);
                option1.setText(ISP.TutEvents.get(idx).answer1);
                option2.setText(ISP.TutEvents.get(idx).answer2);
            }
        });
    }
}
