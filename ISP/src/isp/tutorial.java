/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
 */
package isp;

import javafx.scene.shape.Rectangle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javafx.animation.ScaleTransition;
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
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *Revision History:
 *  - May 27th, 2020: Created by Justin Zhu
 *  - May 30th, 2020: Updated by Justin Zhu
 *  - June 2nd, 2020: Updated by Ronald You
 *  - June 2nd, 2020: Updated by Justin Zhu
 *  - June 6th, 2020: Updated by Ronald You
 * 
 */
public class tutorial {
    public static int idx = 0, day=0;
    public static int [] factors = new int [2];
    public static Rectangle hr, mr;
    public static Pane root2;
    public static void buttonFlip(Button front, Button back){
        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(500), front);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);

        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(500), back);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stShowBack.play();
            }
        });
        stHideFront.play();
    }
    public static void updateMeters(){
        hr.setHeight(10+100-factors[0]);
        mr.setHeight(10+100-factors[1]);
    }
    public static void run(Stage window){
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #8e7cc3; ; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #674ea7;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #674ea7; ";
        
        final String IDLE_BUTTON_STYLE = "-fx-font-size:20 ; -fx-background-color: #54a0de;  -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:20;  -fx-background-color: #0198E1; -fx-text-fill: #ffffff ";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:20;  -fx-background-color: #0198E1;  ";
        // tutorial scene
        //-fx-background-color: #cfe2f3
        idx = 0;
        factors[0] = 60;
        factors[1] = 60;
        root2 = new Pane();
        
        Image bg  = new Image("TutorialScreen.jpg");
        root2.getChildren().add(new ImageView(bg));
        Image cb = new Image("checkBox.png");
        ImageView ch = new ImageView();
        ch.setImage(cb);
        ch.setFitWidth(37);
        ch.setFitHeight(37);
        ch.setPreserveRatio(true);
        ch.setSmooth(true);
        ch.relocate(890,530);
        ImageView ch2 = new ImageView();
        ch2.setImage(cb);
        ch2.setFitWidth(37);
        ch2.setFitHeight(37);
        ch2.setPreserveRatio(true);
        ch2.setSmooth(true);
        ch2.relocate(890,590);
        ImageView ch3 = new ImageView();
        ch3.setImage(cb);
        ch3.setFitWidth(37);
        ch3.setFitHeight(37);
        ch3.setPreserveRatio(true);
        ch3.setSmooth(true);
        ch3.relocate(890,650);
        Image ac = new Image("achBox.png");
        ImageView bob = new ImageView();
        bob.setImage(ac);
        bob.setFitWidth(50);
        bob.setFitHeight(50);
        bob.setPreserveRatio(true);
        bob.setSmooth(true);
        bob.relocate(883,520);
        ImageView bob2 = new ImageView();
        bob2.setImage(ac);
        bob2.setFitWidth(50);
        bob2.setFitHeight(50);
        bob2.setPreserveRatio(true);
        bob2.setSmooth(true);
        bob2.relocate(883,580);
        ImageView bob3 = new ImageView();
        bob3.setImage(ac);
        bob3.setFitWidth(50);
        bob3.setFitHeight(50);
        bob3.setPreserveRatio(true);
        bob3.setSmooth(true);
        bob3.relocate(883,640);
        root2.getChildren().add(ch);
        root2.getChildren().add(ch2);
        root2.getChildren().add(ch3);
        root2.getChildren().add(bob);
        root2.getChildren().add(bob2);
        root2.getChildren().add(bob3);
        
        ISP.s2 = new Scene(root2, 1200, 750);
        
                
        Button option1back = new Button("");
        Button option2back = new Button("");
        option1back.wrapTextProperty().setValue(true);
        option2back.wrapTextProperty().setValue(true);
        option1back.relocate(358, 291);
        option2back.relocate(611, 291);
        option1back.setPrefSize(232, 311);
        option2back.setPrefSize(232, 311);
        root2.getChildren().add(option1back);
        root2.getChildren().add(option2back);
        option1back.setScaleX(0);
        option2back.setScaleX(0);
        
        Label quest = new Label(ISP.TutEvents.get(idx).question);
        quest.setFont(new Font("Monospaced",24));
        quest.setTextFill(Color.web("#ffffff"));
        Button option1 = new Button(ISP.TutEvents.get(idx).answer1);
        Button option2 = new Button(ISP.TutEvents.get(idx).answer2);
        quest.relocate(397, ISP.TutEvents.get(idx).getY());
        System.out.println(ISP.TutEvents.get(idx).getY());
        quest.setWrapText(true);
        quest.setMaxWidth(400);
        option1.wrapTextProperty().setValue(true);
        option2.wrapTextProperty().setValue(true);
        option1.relocate(358, 291);
        option2.relocate(611, 291);
        option1.setPrefSize(232, 311);
        option2.setPrefSize(232, 311);
        root2.getChildren().add(quest);
        root2.getChildren().add(option1);
        root2.getChildren().add(option2);
        
        hr = new Rectangle(400, 0, 150, 10+100-factors[0]);
        mr = new Rectangle(600, 0, 150, 10+100-factors[1]);
        hr.setFill(Color.valueOf("#9c9c9c"));
        mr.setFill(Color.valueOf("#9c9c9c"));
        root2.getChildren().addAll(hr, mr);
        
        Image topbar  = new Image("TutorialTopBar.png");
        root2.getChildren().add(new ImageView(topbar));
        
                
        Label daystatus = new Label("Day "+day);
        daystatus.setFont(new Font("Monospaced",40));
        daystatus.setTextFill(Color.web("#ffffff"));
        daystatus.relocate(550, 670);
        root2.getChildren().add(daystatus);
        
        Button b = new Button("Back");
        b.relocate(3,715);
        b.setStyle(b_IDLE_BUTTON_STYLE);
        b.setOnMouseEntered(e -> b.setStyle(b_HOVERED_BUTTON_STYLE));
        b.setOnMouseExited(e -> b.setStyle(b_IDLE_BUTTON_STYLE));
        b.setOnMousePressed(e -> b.setStyle(b_CLICKED_BUTTON_STYLE));
        b.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            window.setScene(ISP.s1);
        });
        root2.getChildren().add(b);

        
        option1.setStyle(IDLE_BUTTON_STYLE);
        option1.setOnMouseEntered(e -> option1.setStyle(HOVERED_BUTTON_STYLE));
        option1.setOnMouseExited(e -> option1.setStyle(IDLE_BUTTON_STYLE));
        option1.setOnMousePressed(e -> option1.setStyle(CLICKED_BUTTON_STYLE));
        option1.setOnAction(actionEvent -> {
            for (int i=0;i<ISP.TutEvents.get(idx).factor1.length;i++){
                factors[ISP.TutEvents.get(idx).factor1[i]] += ISP.TutEvents.get(idx).amount1[i];
            }
            day+=ISP.TutEvents.get(idx).getDays();
            System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                window.setScene(ISP.s0);
                idx = 0;
                day=0;
                factors[0] = 60;
                factors[1] = 60;
            }
            daystatus.setText("Day "+day);
            quest.setText(ISP.TutEvents.get(idx).question);
            quest.relocate(397, ISP.TutEvents.get(idx).getY());
            option1back.setText(ISP.TutEvents.get(idx).answer1);
            buttonFlip(option1, option1back);
            option2.setText(ISP.TutEvents.get(idx).answer2);
            updateMeters();
            option1.setStyle(IDLE_BUTTON_STYLE);
        });
        
        
        option2.setStyle(IDLE_BUTTON_STYLE);
        option2.setOnMouseEntered(e -> option2.setStyle(HOVERED_BUTTON_STYLE));
        option2.setOnMouseExited(e -> option2.setStyle(IDLE_BUTTON_STYLE));
        option2.setOnMousePressed(e -> option2.setStyle(CLICKED_BUTTON_STYLE));
        option2.setOnAction(actionEvent -> {
            for (int i=0;i<ISP.TutEvents.get(idx).factor2.length;i++){
                factors[ISP.TutEvents.get(idx).factor2[i]] += ISP.TutEvents.get(idx).amount2[i];
            }
            day+=ISP.TutEvents.get(idx).getDays();
            System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                window.setScene(ISP.s0);
                idx = 0;
                day=0;
                factors[0] = 60;
                factors[1] = 60;
            }
            daystatus.setText("Day "+day);
            quest.setText(ISP.TutEvents.get(idx).question);
            quest.relocate(397, ISP.TutEvents.get(idx).getY());
            option1.setText(ISP.TutEvents.get(idx).answer1);
            option2.setText(ISP.TutEvents.get(idx).answer2);
            updateMeters();
            
            option2.setStyle(IDLE_BUTTON_STYLE);
        });
    }
}
