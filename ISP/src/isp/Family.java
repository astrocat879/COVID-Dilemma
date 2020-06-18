/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Revision History: - June 14th, 2020: Created by Ronald You
 *
 */
public class Family {

    public static int idx = 0, day = 0;
    public static int[] factors = new int[4];
    public static Rectangle hr, mr, mhr, sr;
    public static Pane root2;
    public static Color qYel = Color.rgb(241, 194, 50);
    public static Color green = Color.rgb(147, 196, 125);
    public static Label quest;
    public static Stage window;
    public static Button option1 = new Button(ISP.FEvents.get(idx).answer1);
    public static Button option2 = new Button(ISP.FEvents.get(idx).answer2);
    public static Event[] deathEvents = new Event[4];
    public static Label daystatus = new Label("Day " + day);
    public static Button option1back = new Button("");
    public static Button option2back = new Button("");
    public static Group front = new Group();
    public static Group back = new Group();
    public static Group optionResults1 = new Group();
    public static Group optionResults2 = new Group();
    public static ImageView ch3 = new ImageView();

    public static void flipCard2(Group front, Group back) {

        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(500), front);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);

        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(500), back);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);

        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {

//                SequentialTransition seq = new SequentialTransition(new PauseTransition(Duration.millis(3050)), stShowBack);
//                seq.play();
                stShowBack.play();

            }
        });
        stHideFront.play();
        ScaleTransition stHideFront2 = new ScaleTransition(Duration.millis(500), back);
        stHideFront2.setFromX(1);
        stHideFront2.setToX(0);

        ScaleTransition stShowBack2 = new ScaleTransition(Duration.millis(500), front);
        stShowBack2.setFromX(0);
        stShowBack2.setToX(1);

        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {

                for (int i = 0; i < ISP.FEvents.get(idx).factor2.length; i++) {
                    factors[ISP.FEvents.get(idx).factor2[i]] += ISP.FEvents.get(idx).amount2[i];
                    factors[ISP.FEvents.get(idx).factor2[i]] = Math.max(-1, factors[ISP.FEvents.get(idx).factor2[i]]);
                    factors[ISP.FEvents.get(idx).factor2[i]] = Math.min(95, factors[ISP.FEvents.get(idx).factor2[i]]);
                }

                System.out.println(factors[0] + " " + factors[1]+ " " + factors[2] + " " + factors[3]);
                updateMeters();
                if (factors[0] < 0 || factors[1] < 0 || factors[2] < 0 || factors[3] < 0) {
                    if (factors[0] < 0){
                        quest.relocate(397, deathEvents[0].getY());
                        option1.setText(deathEvents[0].answer1);
                        option2.setText(deathEvents[0].answer2);
                        quest.setText(deathEvents[0].question);
                    }
                    else if (factors[1] < 0){
                        quest.relocate(397, deathEvents[1].getY());
                        option1.setText(deathEvents[1].answer1);
                        option2.setText(deathEvents[1].answer2);
                        quest.setText(deathEvents[1].question);
                    }
                    else if (factors[2] < 0){
                        quest.relocate(397, deathEvents[2].getY());
                        option1.setText(deathEvents[2].answer1);
                        option2.setText(deathEvents[2].answer2);
                        quest.setText(deathEvents[2].question);
                    }
                    else{
                        quest.relocate(397, deathEvents[3].getY());
                        option1.setText(deathEvents[3].answer1);
                        option2.setText(deathEvents[3].answer2);
                        quest.setText(deathEvents[3].question);
                    }
                }
                else{
                    day += ISP.FEvents.get(idx).getDays();
                    daystatus.setText("Day " + day);
                    idx = FamilySelector.select();
                    
                    quest.relocate(397, ISP.FEvents.get(idx).getY());
                    option1.setText(ISP.FEvents.get(idx).answer1);
                    option2.setText(ISP.FEvents.get(idx).answer2);
                    quest.setText(ISP.FEvents.get(idx).question);
                }

                //updateMeters();
                //SequentialTransition  seq3 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stShowBack2);
                //seq3.play();
                //if(idx + 1== ISP.FEvents.size()){
                //root2.getChildren().add(ch3);
                //}
                stShowBack2.play();
//                option2.setDisable(false);
//                option1.setDisable(false);

            }
        });
        //SequentialTransition  seq4 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stHideFront2);
        //seq4.play();
        stHideFront2.play();

    }

    // plays out animation of card flipping
    public static void flipCard(Group front, Group back) {

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

//                SequentialTransition seq = new SequentialTransition(new PauseTransition(Duration.millis(3050)), stShowBack);
//                seq.play();
                stShowBack.play();

            }
        });
//        SequentialTransition seq2 = new SequentialTransition(new PauseTransition(Duration.millis(3050)), stHideFront);
//        seq2.play();

        stHideFront.play();
        ScaleTransition stHideFront2 = new ScaleTransition(Duration.millis(500), back);
        stHideFront2.setFromX(1);
        stHideFront2.setToX(0);

        ScaleTransition stShowBack2 = new ScaleTransition(Duration.millis(500), front);
        stShowBack2.setFromX(0);
        stShowBack2.setToX(1);

        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                //SequentialTransition  seq3 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stShowBack2);
                //seq3.play();
                //if(idx + 1== ISP.FEvents.size()){
                //root2.getChildren().add(ch3);
                //}
                for (int i = 0; i < ISP.FEvents.get(idx).factor1.length; i++) {
                    factors[ISP.FEvents.get(idx).factor1[i]] += ISP.FEvents.get(idx).amount1[i];
                    factors[ISP.FEvents.get(idx).factor1[i]] = Math.max(-1, factors[ISP.FEvents.get(idx).factor1[i]]);
                    factors[ISP.FEvents.get(idx).factor1[i]] = Math.min(95, factors[ISP.FEvents.get(idx).factor1[i]]);
                }

                updateMeters();
                System.out.println(factors[0] + " " + factors[1]+ " " + factors[2] + " " + factors[3]);
                if (factors[0] < 0 || factors[1] < 0 || factors[2] < 0 || factors[3] < 0) {
                    if (factors[0] < 0){
                        quest.relocate(397, deathEvents[0].getY());
                        option1.setText(deathEvents[0].answer1);
                        option2.setText(deathEvents[0].answer2);
                        quest.setText(deathEvents[0].question);
                    }
                    else if (factors[1] < 0){
                        quest.relocate(397, deathEvents[1].getY());
                        option1.setText(deathEvents[1].answer1);
                        option2.setText(deathEvents[1].answer2);
                        quest.setText(deathEvents[1].question);
                    }
                    else if (factors[2] < 0){
                        quest.relocate(397, deathEvents[2].getY());
                        option1.setText(deathEvents[2].answer1);
                        option2.setText(deathEvents[2].answer2);
                        quest.setText(deathEvents[2].question);
                    }
                    else{
                        quest.relocate(397, deathEvents[3].getY());
                        option1.setText(deathEvents[3].answer1);
                        option2.setText(deathEvents[3].answer2);
                        quest.setText(deathEvents[3].question);
                    }
                }
                else{
                    day += ISP.FEvents.get(idx).getDays();
                    daystatus.setText("Day " + day);
                    idx = FamilySelector.select();
                    
                    quest.relocate(397, ISP.FEvents.get(idx).getY());
                    option1.setText(ISP.FEvents.get(idx).answer1);
                    option2.setText(ISP.FEvents.get(idx).answer2);
                    quest.setText(ISP.FEvents.get(idx).question);
                }
                
                

                //updateMeters();
                stShowBack2.play();
//                option2.setDisable(false);
//                option1.setDisable(false);

            }
        });
        //SequentialTransition  seq4 = new SequentialTransition(new PauseTransition(Duration.millis(2000)),stHideFront2);
        //seq4.play();
        stHideFront2.play();

    }


    //Updates the factors sliding a rectangle up and down to simulate filling and emptying
    public static void updateMeters() {
        hr.setHeight(10 + 85 - factors[2]);
        mr.setHeight(10 + 85 - factors[3]);
        sr.setHeight(10 + 85 - factors[0]);
        mhr.setHeight(10 + 85 - factors[1]);
    }

    public static void run(Stage window) {
        //styles of the buttons
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #93c47d ; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #6aa84f;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #6aa84f; ";

        final String IDLE_BUTTON_STYLE = "-fx-font-size:20 ; -fx-background-color: #54a0de;  -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:20;  -fx-background-color: #0198E1; -fx-text-fill: #ffffff ";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:20;  -fx-background-color: #0198E1;  ";
        // tutorial scene
        //-fx-background-color: #cfe2f3
        deathEvents[0] = new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your social status plummets. You cannot show your face to the public anymore.","Oh no...","Oops...",145, 0);
        deathEvents[1] = new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your mental health goes into shambles. You are too stressed.","Oh no...","Oops...",145, 0);
        deathEvents[2] = new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your legs give out due to your poor health. ","Oh no...","Oops...",145, 0);
        deathEvents[3] = new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your cash runs out, and debt skyrockets. You go into hiding from debt collectors.","Oh no...","Oops...",145, 0);
        
        idx = FamilySelector.select();

        factors[0] = 50;
        factors[1] = 50;
        factors[2] = 50;
        factors[3] = 50;
        root2 = new Pane();

        //top left game mode
        Label gameID = new Label("Family");
        gameID.setFont(new Font("Arial", 18));
        gameID.setTextFill(Color.web("#ffffff"));
        gameID.relocate(22, 18);

        // creating question rectangle
        Rectangle qRect = new Rectangle();
        qRect.setX(352.0f);
        qRect.setY(118.0f);
        qRect.setWidth(496.0f);
        qRect.setHeight(149.0f);

        //Setting the height and width of the arc 
        qRect.setArcWidth(50.0);
        qRect.setArcHeight(50.0);
        qRect.setFill(qYel);

        // creating card rectangle
        Rectangle cardRect = new Rectangle();
        cardRect.setX(346.0f);
        cardRect.setY(107.0f);
        cardRect.setWidth(508.0f);
        cardRect.setHeight(527.0f);
        cardRect.setFill(green);
        back.getChildren().add(cardRect);
        back.getChildren().add(qRect);
        front.getChildren().add(cardRect);
        front.getChildren().add(qRect);

        // importing images
        Image bg = new Image("Family Screen.jpg");
        root2.getChildren().add(new ImageView(bg));
        Image cb = new Image("checkBox.png");
        ImageView ch = new ImageView();
        
        
        /////////////////////////////////////////////////
        
        
        
        //Image cb = new Image("checkBox.png");
        Pane root4 = new Pane();
        ISP.s7 = new Scene(root4, 1200, 750);
        Image img  = new Image("FamilyEnd.jpg");
        root4.getChildren().add(new ImageView(img));
        
        ImageView ch1 = new ImageView();
        ch1.setImage(cb);
        ch1.setFitWidth(89);
        ch1.setFitHeight(89);
        ch1.setPreserveRatio(true);
        ch1.setSmooth(true);
        ch1.relocate(423,300);
        
        ImageView ch22 = new ImageView();
        ch22.setImage(cb);
        ch22.setFitWidth(89);
        ch22.setFitHeight(89);
        ch22.setPreserveRatio(true);
        ch22.setSmooth(true);
        ch22.relocate(423,418);
        
        ImageView ch33 = new ImageView();
        ch33.setImage(cb);
        ch33.setFitWidth(89);
        ch33.setFitHeight(89);
        ch33.setPreserveRatio(true);
        ch33.setSmooth(true);
        ch33.relocate(423,548);
        
        
        Button b1 = new Button("Continue");
        b1.relocate(1105,715);
        b1.setStyle(b_IDLE_BUTTON_STYLE);
        b1.setOnMouseEntered(e -> b1.setStyle(b_HOVERED_BUTTON_STYLE));
        b1.setOnMouseExited(e -> b1.setStyle(b_IDLE_BUTTON_STYLE));
        b1.setOnMousePressed(e -> b1.setStyle(b_CLICKED_BUTTON_STYLE));
        b1.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            window.setScene(ISP.s0);
        });
        root4.getChildren().add(b1);
        
        
        
        
        ////////////////////////////////////////////////////////////////////////////
        
        

        //achievement checkboxes
        Label ach1 = new Label(ISP.FAch.get(0).question);
        Label ach2 = new Label(ISP.FAch.get(1).question);
        Label ach3 = new Label(ISP.FAch.get(2).question);

        ach1.relocate(948, 32);
        ach1.setFont(new Font("Arial", 18));
        ach1.setTextFill(Color.web("#ff9900"));

        ach2.relocate(948, 92);
        ach2.setFont(new Font("Arial", 18));
        ach2.setTextFill(Color.web("#ff9900"));

        ach3.relocate(948, 152);
        ach3.setFont(new Font("Arial", 18));
        ach3.setTextFill(Color.web("#ff9900"));

        ch.setImage(cb);
        ch.setFitWidth(37);
        ch.setFitHeight(37);
        ch.setPreserveRatio(true);
        ch.setSmooth(true);
        ch.relocate(890, 28);

        ImageView ch2 = new ImageView();
        ch2.setImage(cb);
        ch2.setFitWidth(37);
        ch2.setFitHeight(37);
        ch2.setPreserveRatio(true);
        ch2.setSmooth(true);
        ch2.relocate(890, 88);
        ImageView ch3 = new ImageView();
        ch3.setImage(cb);
        ch3.setFitWidth(37);
        ch3.setFitHeight(37);
        ch3.setPreserveRatio(true);
        ch3.setSmooth(true);
        ch3.relocate(890, 148);
        Image ac = new Image("achBox.png");
        ImageView bob = new ImageView();
        bob.setImage(ac);
        bob.setFitWidth(50);
        bob.setFitHeight(50);
        bob.setPreserveRatio(true);
        bob.setSmooth(true);
        bob.relocate(883, 18);
        ImageView bob2 = new ImageView();
        bob2.setImage(ac);
        bob2.setFitWidth(50);
        bob2.setFitHeight(50);
        bob2.setPreserveRatio(true);
        bob2.setSmooth(true);
        bob2.relocate(883, 78);
        ImageView bob3 = new ImageView();
        bob3.setImage(ac);
        bob3.setFitWidth(50);
        bob3.setFitHeight(50);
        bob3.setPreserveRatio(true);
        bob3.setSmooth(true);
        bob3.relocate(883, 138);

        //root2.getChildren().add(ch);
        //root2.getChildren().add(ch2);
        //root2.getChildren().add(ch3);
        root2.getChildren().add(bob);
        root2.getChildren().add(bob2);
        root2.getChildren().add(bob3);
        root2.getChildren().add(ach1);
        root2.getChildren().add(ach2);
        root2.getChildren().add(ach3);

        ISP.s5 = new Scene(root2, 1200, 750);

        Rectangle optRect = new Rectangle();
        optRect.setX(358);
        optRect.setY(291);
        optRect.setWidth(232);
        optRect.setHeight(311);
        //optRect.setFill(qBlue);
//        root2.getChildren().add(optionResults1);

        Rectangle optRect2 = new Rectangle();
        optRect2.setX(611);
        optRect2.setY(291);
        optRect2.setWidth(232);
        optRect2.setHeight(311);
        //optRect2.setFill(qBlue);
//        root2.getChildren().add(optionResults2);

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
//        front.getChildren().add(optionResults1);
//        front.getChildren().add(optionResults2);

        quest = new Label(ISP.FEvents.get(idx).question);
        quest.setFont(new Font("Monospaced", 24));
        quest.setTextFill(Color.web("#ffffff"));

        quest.relocate(397, ISP.FEvents.get(idx).getY());
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

        optionResults1.getChildren().add(optRect);
        optionResults2.getChildren().add(optRect2);

        hr = new Rectangle(600, 0, 120, 10 + 85 - factors[2]);
        mr = new Rectangle(730, 0, 120, 10 + 85 - factors[3]);
        mhr = new Rectangle(500, 0, 120, 10 + 85 - factors[1]);
        sr = new Rectangle(350, 0, 120, 10 + 85 - factors[0]);
        hr.setFill(Color.valueOf("#9c9c9c"));
        mr.setFill(Color.valueOf("#9c9c9c"));
        mhr.setFill(Color.valueOf("#9c9c9c"));
        sr.setFill(Color.valueOf("#9c9c9c"));
        root2.getChildren().addAll(hr, mr, mhr, sr);

        Image topbar = new Image("FamilyTopBar.png");
        root2.getChildren().add(new ImageView(topbar));

        daystatus.setFont(new Font("Monospaced", 40));
        daystatus.setTextFill(Color.web("#ffffff"));
        daystatus.relocate(550, 670);
        root2.getChildren().add(daystatus);

        Button b = new Button("Back");
        b.relocate(3, 715);
        b.setStyle(b_IDLE_BUTTON_STYLE);
        b.setOnMouseEntered(e -> b.setStyle(b_HOVERED_BUTTON_STYLE));
        b.setOnMouseExited(e -> b.setStyle(b_IDLE_BUTTON_STYLE));
        b.setOnMousePressed(e -> b.setStyle(b_CLICKED_BUTTON_STYLE));
        b.setOnAction(e -> {
            try {
                Thread.sleep(100);
            } catch (Exception f) {
            }
            window.setScene(ISP.s1);
        });
        root2.getChildren().add(b);

        root2.getChildren().add(back);

        root2.getChildren().add(front);

        quest.relocate(397, ISP.FEvents.get(idx).getY());
        option1.setText(ISP.FEvents.get(idx).answer1);
        option2.setText(ISP.FEvents.get(idx).answer2);
        quest.setText(ISP.FEvents.get(idx).question);

//        Label z = new Label("hEllo");
//        z.relocate(370, 300);
//        optionResults1.getChildren().add(z);
        option1.setStyle(IDLE_BUTTON_STYLE);
        option1.setOnMouseEntered(e -> option1.setStyle(HOVERED_BUTTON_STYLE));
        option1.setOnMouseExited(e -> option1.setStyle(IDLE_BUTTON_STYLE));
        option1.setOnMousePressed(e -> option1.setStyle(CLICKED_BUTTON_STYLE));
        option1.setOnAction(actionEvent -> {
            System.out.println(idx);
            if(idx == -1){
                window.setScene(ISP.s7);
            }
//            for (int i = 0; i < ISP.FEvents.get(idx).factor1.length; i++) {
//                factors[ISP.FEvents.get(idx).factor1[i]] += ISP.FEvents.get(idx).amount1[i];
//            }
//            //System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
//            quest.relocate(397, ISP.FEvents.get(idx).getY());
//            option1.setText(ISP.FEvents.get(idx).answer1);
//            option2.setText(ISP.FEvents.get(idx).answer2);
//            quest.setText(ISP.FEvents.get(idx).question);
//            updateMeters();
            flipCard(front, back);
            if (factors[0] < 0 || factors[1] < 0 || factors[2] < 0 || factors[3] < 0) {
                ISP.FAch.get(0).status = false;
                ISP.FAch.get(1).status = false;
                ISP.FAch.get(2).status = false;
                FamilySelector.reset();
                window.setScene(ISP.end1);
                idx = 0;
                day = 0;
                factors[0] = 50;
                factors[1] = 50;
                factors[3] = 50;
                factors[2] = 50;
            }
//            idx = FamilySelector.select();
//            if (ISP.FEvents.get(idx).factor1.length > 0) {
////                flipButton(option1,option1back,optionResults1);
//
////                flipCard(front, back);
//                flipCard(front, back);
//
////                flipButtonBack(option1,option1back,optionResults1);
//            } else {

//            }
            option1.setStyle(IDLE_BUTTON_STYLE);
            
            if(idx == 18){
                ISP.FAch.get(2).status = true;
                root2.getChildren().add(ch3);
            }
             if(idx == 6){
                ISP.FAch.get(1).status = true;
                root2.getChildren().add(ch2);
            }
            if (FamilySelector.checker()){
                if(ISP.FAch.get(0).status == true){
                    root4.getChildren().add(ch1);
       
                }
                if(ISP.FAch.get(1).status == true){
                    root4.getChildren().add(ch22);
                }
                if(ISP.FAch.get(2).status == true){
                    root4.getChildren().add(ch33);
                }
                window.setScene(ISP.s7);
                factors[0] = 50;
                factors[1] = 50;
                factors[3] = 50;
                factors[2] = 50;
            }
            updateMeters();

        });

        option2.setStyle(IDLE_BUTTON_STYLE);
        option2.setOnMouseEntered(e -> option2.setStyle(HOVERED_BUTTON_STYLE));
        option2.setOnMouseExited(e -> option2.setStyle(IDLE_BUTTON_STYLE));
        option2.setOnMousePressed(e -> option2.setStyle(CLICKED_BUTTON_STYLE));
        option2.setOnAction(actionEvent -> {
            System.out.println(idx);
            if(idx == -1){
                     window.setScene(ISP.s7);
            }
//            for (int i = 0; i < ISP.FEvents.get(idx).factor2.length; i++) {
//                factors[ISP.FEvents.get(idx).factor2[i]] += ISP.FEvents.get(idx).amount2[i];
//            }
//            //System.out.println("Health: "+factors[0]+ "  Money: "+factors[1]);
//            quest.relocate(397, ISP.FEvents.get(idx).getY());
//            option1.setText(ISP.FEvents.get(idx).answer1);
//            option2.setText(ISP.FEvents.get(idx).answer2);
//            quest.setText(ISP.FEvents.get(idx).question);
//            updateMeters();
//            if (ISP.FEvents.get(idx).factor2.length > 0) {
////                flipButton(option2,option2back,optionResults2);
//                flipCard2(front, back);
//
////                flipButtonBack(option2,option2back,optionResults2);
//            } else {

//            }
            flipCard2(front, back);
            if (factors[0] < 0 || factors[1] < 0 || factors[2] < 0 || factors[3] < 0) {
                ISP.FAch.get(0).status = false;
                ISP.FAch.get(1).status = false;
                ISP.FAch.get(2).status = false;
                FamilySelector.reset();
                window.setScene(ISP.end1);
                
                idx = 0;
                day = 0;
                factors[0] = 50;
                factors[1] = 50;
                factors[3] = 50;
                factors[2] = 50;
            }
            option2.setStyle(IDLE_BUTTON_STYLE);
            if(idx == 15){
                ISP.FAch.get(0).status = true;
                root2.getChildren().add(ch);
            }
            if (FamilySelector.checker()){
                if(ISP.FAch.get(0).status == true){
                    root4.getChildren().add(ch1);
       
                }
                if(ISP.FAch.get(1).status == true){
                    root4.getChildren().add(ch22);
                }
                if(ISP.FAch.get(2).status == true){
                    root4.getChildren().add(ch33);
                }
                window.setScene(ISP.s7);
                factors[0] = 50;
                factors[1] = 50;
                factors[3] = 50;
                factors[2] = 50;
            }
        });
    }
}
