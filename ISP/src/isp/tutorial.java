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
import javafx.animation.PauseTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
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
 *  - June 4th, 2020: Updated by Ronald You
 *  - June 6th, 2020: Updated by Ronald You
 *  - June 6th, 2020; Commented by Ronald You
 *  - June 7th, 2020; Updated by Justin Zhu
 *  - June 7th, 2020; Updated by Ronald You
 *  - June 8th, 2020; Updated by Ronald You
 *  - June 9th, 2020; Updated by Ronald You
 *  - June 10th, 2020; Updated by Ronald You
 */
public class tutorial {
    public static int idx = 0, day=0;
    public static int [] factors = new int [2];
    public static Rectangle hr, mr;
    public static Pane root2;
    public static Color qBlue = Color.rgb(62, 135, 203);
    public static Color purp = Color.rgb(142, 124, 195);
    public static Label quest;
    public static Stage window;
    public static Button option1 = new Button(ISP.TutEvents.get(idx).answer1);
    public static Button option2 = new Button(ISP.TutEvents.get(idx).answer2);
    public static Label daystatus = new Label("Day "+day);
    public static Button option1back = new Button("");
    public static Button option2back = new Button("");
    public static Group front = new Group();
    public static Group back = new Group();
    public static Group optionResults = new Group();
    // plays out animation of card flipping
    public static void flipCard(Group front, Group back){
        //flipButton(option1, option1back);
        //flipButton(option1back, option1);
        
        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(500), front);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);

        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(500), back);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                for (int i=0;i<ISP.TutEvents.get(idx).factor1.length;i++){
                    factors[ISP.TutEvents.get(idx).factor1[i]] += ISP.TutEvents.get(idx).amount1[i];
                }
                //System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
                quest.relocate(397, ISP.TutEvents.get(idx).getY());
                option1.setText(ISP.TutEvents.get(idx).answer1);
                option2.setText(ISP.TutEvents.get(idx).answer2);
                quest.setText(ISP.TutEvents.get(idx).question);
                SequentialTransition  seq = new SequentialTransition(new PauseTransition(Duration.millis(3050)),stShowBack);
                seq.play();
                //stShowBack.play();
                updateMeters();
                
            }
        });
        SequentialTransition  seq2 = new SequentialTransition(new PauseTransition(Duration.millis(3050)),stHideFront);
        seq2.play();
        //stHideFront.play();
        ScaleTransition stHideFront2 = new ScaleTransition(Duration.millis(500), back);
        stHideFront2.setFromX(1);
        stHideFront2.setToX(0);

        ScaleTransition stShowBack2 = new ScaleTransition(Duration.millis(500), front);
        stShowBack2.setFromX(0);
        stShowBack2.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                for (int i=0;i<ISP.TutEvents.get(idx).factor1.length;i++){
                    factors[ISP.TutEvents.get(idx).factor1[i]] += ISP.TutEvents.get(idx).amount1[i];
                }
                //System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
                quest.relocate(397, ISP.TutEvents.get(idx).getY());
                option1.setText(ISP.TutEvents.get(idx).answer1);
                option2.setText(ISP.TutEvents.get(idx).answer2);
                quest.setText(ISP.TutEvents.get(idx).question);
                //SequentialTransition  seq3 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stShowBack2);
                //seq3.play();
                stShowBack2.play();
                updateMeters();
                
            }
        });
        //SequentialTransition  seq4 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stHideFront2);
        //seq4.play();
        stHideFront2.play();
    }
    
    public static int flipButton(Button frontb, Button backb, Group optBack){
       
        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(500), frontb);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);
        
        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(500), backb);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stShowBack.play();
                
                
            }
        });
        stHideFront.play();
        
        ScaleTransition stHideFront2 = new ScaleTransition(Duration.millis(500), optBack);
        stHideFront2.setFromX(1);
        stHideFront2.setToX(0);

        ScaleTransition stShowBack2 = new ScaleTransition(Duration.millis(500), optBack);
        stShowBack2.setFromX(0);
        stShowBack2.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stShowBack2.play();
            }
        });
        stHideFront2.play();
          
        return 1;
    }
    
    public static int flipButtonBack(Button frontb, Button backb, Group optBack){
        System.out.println("FRICK");
        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(500), optBack);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);
        
        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(500), backb);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                SequentialTransition  seq = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stShowBack);
                seq.play();
                //stShowBack.play();
                
                
            }
        });
        SequentialTransition  seq = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stHideFront);
        seq.play();
        //stHideFront.play();
        
        ScaleTransition stHideFront2 = new ScaleTransition(Duration.millis(500), frontb);
        stHideFront2.setFromX(1);
        stHideFront2.setToX(0);

        ScaleTransition stShowBack2 = new ScaleTransition(Duration.millis(500), frontb);
        stShowBack2.setFromX(0);
        stShowBack2.setToX(1);
        
        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stShowBack2.play();
            }
        });
        stHideFront2.play();
          
        return 1;
    }
    
    //Updates the factors sliding a rectangle up and down to simulate filling and emptying
    public static void updateMeters(){
        hr.setHeight(10+100-factors[0]);
        mr.setHeight(10+100-factors[1]);
    }
    public static void run(Stage window){
        //styles of the buttons
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
        
       
        //top left game mode
        Label gameID = new Label ("Tutorial");
        gameID.setFont(new Font("Arial",18));
        gameID.setTextFill(Color.web("#ffffff"));
        gameID.relocate(22,18);
        
        // creating question rectangle
        Rectangle qRect = new Rectangle();  
        qRect.setX(352.0f); 
        qRect.setY(118.0f); 
        qRect.setWidth(496.0f); 
        qRect.setHeight(149.0f); 
        
       
        //Setting the height and width of the arc 
        qRect.setArcWidth(50.0); 
        qRect.setArcHeight(50.0);  
        qRect.setFill(qBlue);
        
        
        // creating card rectangle
        Rectangle cardRect = new Rectangle();  
        cardRect.setX(346.0f); 
        cardRect.setY(107.0f); 
        cardRect.setWidth(508.0f); 
        cardRect.setHeight(527.0f); 
        cardRect.setFill(purp);
        back.getChildren().add(cardRect);
        back.getChildren().add(qRect);
        front.getChildren().add(cardRect);
        front.getChildren().add(qRect);
        
        
        // importing images
        Image bg  = new Image("TutorialScreen.jpg");
        root2.getChildren().add(new ImageView(bg));
        Image cb = new Image("checkBox.png");
        ImageView ch = new ImageView();
        
        //achievement checkboxes
        Label ach1 = new Label (ISP.TutAch.get(0).question);
        Label ach2 = new Label (ISP.TutAch.get(1).question);
        Label ach3 = new Label (ISP.TutAch.get(2).question);
        
        ach1.relocate(950,28);
        ach1.setFont(new Font("Arial",18));
        ach1.setTextFill(Color.web("#ffffff"));
        
        ach2.relocate(950,88);
        ach2.setFont(new Font("Arial",18));
        ach2.setTextFill(Color.web("#ffffff"));

        ach3.relocate(950,148);
        ach3.setFont(new Font("Arial",18));
        ach3.setTextFill(Color.web("#ffffff"));
        
        ch.setImage(cb);
        ch.setFitWidth(37);
        ch.setFitHeight(37);
        ch.setPreserveRatio(true);
        ch.setSmooth(true);
        ch.relocate(890,28);
        
        ImageView ch2 = new ImageView();
        ch2.setImage(cb);
        ch2.setFitWidth(37);
        ch2.setFitHeight(37);
        ch2.setPreserveRatio(true);
        ch2.setSmooth(true);
        ch2.relocate(890,88);
        ImageView ch3 = new ImageView();
        ch3.setImage(cb);
        ch3.setFitWidth(37);
        ch3.setFitHeight(37);
        ch3.setPreserveRatio(true);
        ch3.setSmooth(true);
        ch3.relocate(890,148);
        Image ac = new Image("achBox.png");
        ImageView bob = new ImageView();
        bob.setImage(ac);
        bob.setFitWidth(50);
        bob.setFitHeight(50);
        bob.setPreserveRatio(true);
        bob.setSmooth(true);
        bob.relocate(883,18);
        ImageView bob2 = new ImageView();
        bob2.setImage(ac);
        bob2.setFitWidth(50);
        bob2.setFitHeight(50);
        bob2.setPreserveRatio(true);
        bob2.setSmooth(true);
        bob2.relocate(883,78);
        ImageView bob3 = new ImageView();
        bob3.setImage(ac);
        bob3.setFitWidth(50);
        bob3.setFitHeight(50);
        bob3.setPreserveRatio(true);
        bob3.setSmooth(true);
        bob3.relocate(883,138);

        root2.getChildren().add(ch);
        root2.getChildren().add(ch2);
        root2.getChildren().add(ch3);
        root2.getChildren().add(bob);
        root2.getChildren().add(bob2);
        root2.getChildren().add(bob3);
        root2.getChildren().add(ach1);
        root2.getChildren().add(ach2);
        root2.getChildren().add(ach3);
        
        ISP.s2 = new Scene(root2, 1200, 750);
        
        
        Rectangle optRect = new Rectangle();  
        optRect.setX(358); 
        optRect.setY(291); 
        optRect.setWidth(232); 
        optRect.setHeight(311); 
        optRect.setFill(qBlue);
        root2.getChildren().add(optionResults);
        
        
                
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
        back.getChildren().add(option1back);
        back.getChildren().add(option2back);
        //back.getChildren().add(optionResults);
        front.getChildren().add(optionResults);
        
        quest = new Label(ISP.TutEvents.get(idx).question);
        quest.setFont(new Font("Monospaced",24));
        quest.setTextFill(Color.web("#ffffff"));
        
        quest.relocate(397, ISP.TutEvents.get(idx).getY());
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
        root2.getChildren().add(gameID);
        back.getChildren().add(quest);
        front.getChildren().add(quest);
        back.getChildren().add(option1);
        back.getChildren().add(option2);
        front.getChildren().add(option1);
        front.getChildren().add(option2);
        
        optionResults.getChildren().add(optRect);
        
        hr = new Rectangle(400, 0, 150, 10+100-factors[0]);
        mr = new Rectangle(600, 0, 150, 10+100-factors[1]);
        hr.setFill(Color.valueOf("#9c9c9c"));
        mr.setFill(Color.valueOf("#9c9c9c"));
        root2.getChildren().addAll(hr, mr);
        
        Image topbar  = new Image("TutorialTopBar.png");
        root2.getChildren().add(new ImageView(topbar));
        
                
        
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
        
        
        root2.getChildren().add(back);
        
        root2.getChildren().add(front);
        
        
        option1.setStyle(IDLE_BUTTON_STYLE);
        option1.setOnMouseEntered(e -> option1.setStyle(HOVERED_BUTTON_STYLE));
        option1.setOnMouseExited(e -> option1.setStyle(IDLE_BUTTON_STYLE));
        option1.setOnMousePressed(e -> option1.setStyle(CLICKED_BUTTON_STYLE));
        option1.setOnAction(actionEvent -> {
            flipButton(option1,option1back,optionResults);
       
            flipCard(front, back);
            
            flipButtonBack(option1,option1back,optionResults);
            
            day+=ISP.TutEvents.get(idx).getDays();
            daystatus.setText("Day "+day);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                    window.setScene(ISP.s0);
                    idx = 0;
                    day=0;
                    factors[0] = 60;
                    factors[1] = 60;
            }
            option1.setStyle(IDLE_BUTTON_STYLE);
            
        });
        
        
        option2.setStyle(IDLE_BUTTON_STYLE);
        option2.setOnMouseEntered(e -> option2.setStyle(HOVERED_BUTTON_STYLE));
        option2.setOnMouseExited(e -> option2.setStyle(IDLE_BUTTON_STYLE));
        option2.setOnMousePressed(e -> option2.setStyle(CLICKED_BUTTON_STYLE));
        option2.setOnAction(actionEvent -> {
            flipButton(option2,option2back,optionResults);
            flipCard(front, back);
            day+=ISP.TutEvents.get(idx).getDays();
            daystatus.setText("Day "+day);
            idx++;
            if (idx >= ISP.TutEvents.size()){
                window.setScene(ISP.s0);
                idx = 0;
                day=0;
                factors[0] = 60;
                factors[1] = 60;
            }
            option2.setStyle(IDLE_BUTTON_STYLE);
            
        });
    }
}
