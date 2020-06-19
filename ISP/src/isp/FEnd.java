/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Win Screen for Family
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FEnd {
     public static void run(Stage window){
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #8e7cc3; ; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #674ea7;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #674ea7; ";
        
        Image cb = new Image("checkBox.png");
        Pane root4 = new Pane();
        ISP.s7 = new Scene(root4, 1200, 750);
        Image img  = new Image("FamilyEnd.jpg");
        root4.getChildren().add(new ImageView(img));
        
        ImageView ch = new ImageView();
        ch.setImage(cb);
        ch.setFitWidth(89);
        ch.setFitHeight(89);
        ch.setPreserveRatio(true);
        ch.setSmooth(true);
        ch.relocate(423,300);
        
        ImageView ch2 = new ImageView();
        ch2.setImage(cb);
        ch2.setFitWidth(89);
        ch2.setFitHeight(89);
        ch2.setPreserveRatio(true);
        ch2.setSmooth(true);
        ch2.relocate(423,418);
        
        ImageView ch3 = new ImageView();
        ch3.setImage(cb);
        ch3.setFitWidth(89);
        ch3.setFitHeight(89);
        ch3.setPreserveRatio(true);
        ch3.setSmooth(true);
        ch3.relocate(423,548);
        
        
        if(ISP.FAch.get(0).status == true){
            root4.getChildren().add(ch);
       
        }
        if(ISP.FAch.get(1).status == true){
            root4.getChildren().add(ch2);
        }
        if(ISP.FAch.get(2).status == true){
            root4.getChildren().add(ch3);
        }
        
        
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
        root4.getChildren().add(b);
        //window.setScene(ISP.s7);
        //window.show();
    }
   
    
}
