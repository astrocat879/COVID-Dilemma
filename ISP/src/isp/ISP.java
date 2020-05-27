/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author astro
 */
public class ISP extends Application {
    Button btn;
    @Override
    public void start(Stage primaryStage) throws Exception{
        btn = new Button("BOOMERS UNITE");
        btn.setOnAction(e -> System.out.println("ok"));
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 1200, 750);
        
        primaryStage.setTitle("Covid Dilemma");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
