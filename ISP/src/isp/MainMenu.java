/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
 */
package isp;

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
 *  - May 25th, 2020: Created by Ronald You
 *  - May 26th, 2020: Updated by Ronald You
 *  - May 27th, 2020: Updated by Justin Zhu
 * 
 */
public class MainMenu {
    public static void run(Stage window){
        final String IDLE_BUTTON_STYLE = "-fx-font-size:40 ;  -fx-background-color: #8e7cc3; -fx-background-radius: 15px; -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; -fx-text-fill: #ffffff;";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; ";

        Button start,tut,quit;
        Pane root = new Pane();
        Image img  = new Image("Main Menu.jpg");
        root.getChildren().add(new ImageView(img));
        //start button for levels
        start = new Button("Start");
        start.relocate(413,295);
        start.setPrefSize(375, 91);
        start.setStyle(IDLE_BUTTON_STYLE);
        start.setOnMouseEntered(e -> start.setStyle(HOVERED_BUTTON_STYLE));
        start.setOnMouseExited(e -> start.setStyle(IDLE_BUTTON_STYLE));
        start.setOnMousePressed(e -> start.setStyle(CLICKED_BUTTON_STYLE));
        start.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.out.println("Start");
            window.setScene(ISP.s1);
        });
        //tutorial button
        tut = new Button("Tutorial");
        tut.relocate(413,447);
        tut.setPrefSize(375, 91);
        tut.setStyle(IDLE_BUTTON_STYLE);
        tut.setOnMouseEntered(e -> tut.setStyle(HOVERED_BUTTON_STYLE));
        tut.setOnMouseExited(e -> tut.setStyle(IDLE_BUTTON_STYLE));
        tut.setPrefSize(375, 91);
        tut.setOnMousePressed(e -> tut.setStyle(CLICKED_BUTTON_STYLE));
        tut.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.out.println("Tutorial");
            window.setScene(ISP.s2);
        });
        //quit button
        quit = new Button("Quit");
        quit.relocate(413,599);
        quit.setPrefSize(375, 91);
        quit.setStyle(IDLE_BUTTON_STYLE);
        quit.setOnMouseEntered(e -> quit.setStyle(HOVERED_BUTTON_STYLE));
        quit.setOnMouseExited(e -> quit.setStyle(IDLE_BUTTON_STYLE));
        quit.setPrefSize(375, 91);
        quit.setOnMousePressed(e -> quit.setStyle(CLICKED_BUTTON_STYLE));
        quit.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            System.exit(0);
        });

        root.getChildren().add(tut);
        root.getChildren().add(quit);

        root.getChildren().add(start);
        ISP.s0 = new Scene(root, 1200, 750);
        
        window.setTitle("Covid Dilemma");
        window.setScene(ISP.s0);
        window.show();
    }
}
