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
 *  - June 6th, 2020: Updated by Ronald You
 * 
 */
public class MainMenu {
    public static void run(Stage window){
        final String b_IDLE_BUTTON_STYLE = " -fx-background-color: #8e7cc3; ; -fx-text-fill: #ffffff";
        final String b_HOVERED_BUTTON_STYLE = "-fx-background-color: #674ea7;  -fx-text-fill: #ffffff;";
        final String b_CLICKED_BUTTON_STYLE = "-fx-background-color: #674ea7; ";
        
        final String b1_IDLE_BUTTON_STYLE = " -fx-background-color: #cc4125; -fx-text-fill: #ffffff";
        final String b1_HOVERED_BUTTON_STYLE = "-fx-background-color: #a61c00;  -fx-text-fill: #ffffff;";
        final String b1_CLICKED_BUTTON_STYLE = "-fx-background-color: #a61c00; ";
        
        final String b2_IDLE_BUTTON_STYLE = " -fx-background-color: #93c47d ; -fx-text-fill: #ffffff";
        final String b2_HOVERED_BUTTON_STYLE = "-fx-background-color: #6aa84f;  -fx-text-fill: #ffffff;";
        final String b2_CLICKED_BUTTON_STYLE = "-fx-background-color: #6aa84f; ";
        
        final String IDLE_BUTTON_STYLE = "-fx-font-size:40 ;  -fx-background-color: #8e7cc3; -fx-background-radius: 15px; -fx-text-fill: #ffffff";
        final String HOVERED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; -fx-text-fill: #ffffff;";
        final String CLICKED_BUTTON_STYLE = "-fx-font-size:40; -fx-background-color: #674ea7; -fx-background-radius: 15px; ";

        Button start,at,quit;
        Pane root = new Pane();
        Image img  = new Image("Main Menu.jpg");
        root.getChildren().add(new ImageView(img));
        //start button for levels
        start = new Button("Play");
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
        //achievements button
        at = new Button("Achievements");
        at.relocate(413,447);
        at.setPrefSize(375, 91);
        at.setStyle(IDLE_BUTTON_STYLE);
        at.setOnMouseEntered(e -> at.setStyle(HOVERED_BUTTON_STYLE));
        at.setOnMouseExited(e -> at.setStyle(IDLE_BUTTON_STYLE));
        at.setOnMousePressed(e -> at.setStyle(CLICKED_BUTTON_STYLE));
        at.setOnAction(e -> {
            try{Thread.sleep(100);}
            catch(Exception f){}
            Image cb = new Image("checkBox.png");
            System.out.println("Achievements");
            Image img1  = new Image("tutAchScreen.jpg");
            
            Pane root4 = new Pane();
            ISP.s8 = new Scene(root4, 1200, 750);
            root4.getChildren().add(new ImageView(img1));
            ImageView ch = new ImageView();
            ch.setImage(cb);
            ch.setFitWidth(89);
            ch.setFitHeight(89);
            ch.setPreserveRatio(true);
            ch.setSmooth(true);
            ch.relocate(442,240);
        
            ImageView ch2 = new ImageView();
            ch2.setImage(cb);
            ch2.setFitWidth(89);
            ch2.setFitHeight(89);
            ch2.setPreserveRatio(true);
            ch2.setSmooth(true);
            ch2.relocate(442,366);
        
            ImageView ch3 = new ImageView();
            ch3.setImage(cb);
            ch3.setFitWidth(89);
            ch3.setFitHeight(89);
            ch3.setPreserveRatio(true);
            ch3.setSmooth(true);
            ch3.relocate(442,489);
        
        
            if(ISP.TutAch.get(0).status == true){
                root4.getChildren().add(ch);
            }
            if(ISP.TutAch.get(1).status == true){
                root4.getChildren().add(ch2);
            }
            if(ISP.TutAch.get(2).status == true){
                root4.getChildren().add(ch3);
            }
            Button back1 = new Button("Back to Menu");
            back1.relocate(3,715);
            back1.setStyle(b_IDLE_BUTTON_STYLE);
            back1.setOnMouseEntered(h -> back1.setStyle(b_HOVERED_BUTTON_STYLE));
            back1.setOnMouseExited(h -> back1.setStyle(b_IDLE_BUTTON_STYLE));
            back1.setOnMousePressed(h -> back1.setStyle(b_CLICKED_BUTTON_STYLE));
            back1.setOnAction(h -> {
                    try{Thread.sleep(100);}
                    catch(Exception f){}
                    window.setScene(ISP.s0);
            });
            
            Button cont1 = new Button("Continue");
            cont1.relocate(1105,715);
            cont1.setStyle(b_IDLE_BUTTON_STYLE);
            cont1.setOnMouseEntered(g -> cont1.setStyle(b_HOVERED_BUTTON_STYLE));
            cont1.setOnMouseExited(g -> cont1.setStyle(b_IDLE_BUTTON_STYLE));
            cont1.setOnMousePressed(g -> cont1.setStyle(b_CLICKED_BUTTON_STYLE));
            cont1.setOnAction(g -> {
                try{Thread.sleep(100);}
                catch(Exception f){}
                System.out.println("Achievements");
                Image img2  = new Image("PMAchScreen.jpg");
                Pane root6 = new Pane();
                ISP.s9 = new Scene(root6, 1200, 750);
                root6.getChildren().add(new ImageView(img2));
                ImageView ch11 = new ImageView();
                ch11.setImage(cb);
                ch11.setFitWidth(89);
                ch11.setFitHeight(89);
                ch11.setPreserveRatio(true);
                ch11.setSmooth(true);
                ch11.relocate(380,238);

                ImageView ch22 = new ImageView();
                ch22.setImage(cb);
                ch22.setFitWidth(89);
                ch22.setFitHeight(89);
                ch22.setPreserveRatio(true);
                ch22.setSmooth(true);
                ch22.relocate(380,364);

                ImageView ch33 = new ImageView();
                ch33.setImage(cb);
                ch33.setFitWidth(89);
                ch33.setFitHeight(89);
                ch33.setPreserveRatio(true);
                ch33.setSmooth(true);
                ch33.relocate(380,487);

                if(ISP.PMAch.get(0).status == true){
                    root6.getChildren().add(ch11);
                }
                if(ISP.PMAch.get(1).status == true){
                    root6.getChildren().add(ch22);
                }
                if(ISP.PMAch.get(2).status == true){
                    root6.getChildren().add(ch33);
                }
                Button back2 = new Button("Back");
                back2.relocate(3,715);
                back2.setStyle(b1_IDLE_BUTTON_STYLE);
                back2.setOnMouseEntered(h -> back2.setStyle(b1_HOVERED_BUTTON_STYLE));
                back2.setOnMouseExited(h -> back2.setStyle(b1_IDLE_BUTTON_STYLE));
                back2.setOnMousePressed(h -> back2.setStyle(b1_CLICKED_BUTTON_STYLE));
                back2.setOnAction(h -> {
                        try{Thread.sleep(100);}
                        catch(Exception f){}
                        window.setScene(ISP.s8);
                });
                Button cont2 = new Button("Continue");
                cont2.relocate(1105,715);
                cont2.setStyle(b1_IDLE_BUTTON_STYLE);
                cont2.setOnMouseEntered(j -> cont2.setStyle(b1_HOVERED_BUTTON_STYLE));
                cont2.setOnMouseExited(j -> cont2.setStyle(b1_IDLE_BUTTON_STYLE));
                cont2.setOnMousePressed(j -> cont2.setStyle(b1_CLICKED_BUTTON_STYLE));
                cont2.setOnAction(j -> {
                    try{Thread.sleep(100);}
                    catch(Exception f){}
                    System.out.println("Achievements");
                    Image img3  = new Image("FamilyAchScreen.jpg");
                    Pane root8 = new Pane();
                    ISP.s10 = new Scene(root8, 1200, 750);
                    root8.getChildren().add(new ImageView(img3));
                    ImageView ch111 = new ImageView();
                    ch111.setImage(cb);
                    ch111.setFitWidth(89);
                    ch111.setFitHeight(89);
                    ch111.setPreserveRatio(true);
                    ch111.setSmooth(true);
                    ch111.relocate(386,238);

                    ImageView ch222 = new ImageView();
                    ch222.setImage(cb);
                    ch222.setFitWidth(89);
                    ch222.setFitHeight(89);
                    ch222.setPreserveRatio(true);
                    ch222.setSmooth(true);
                    ch222.relocate(386,364);

                    ImageView ch333 = new ImageView();
                    ch333.setImage(cb);
                    ch333.setFitWidth(89);
                    ch333.setFitHeight(89);
                    ch333.setPreserveRatio(true);
                    ch333.setSmooth(true);
                    ch333.relocate(386,487);

                    if(ISP.FAch.get(0).status == true){
                        root8.getChildren().add(ch111);
                    }
                    if(ISP.FAch.get(1).status == true){
                        root8.getChildren().add(ch222);
                    }
                    if(ISP.FAch.get(2).status == true){
                        root8.getChildren().add(ch333);
                    }
                    Button back3 = new Button("Back");
                    back3.relocate(3,715);
                    back3.setStyle(b2_IDLE_BUTTON_STYLE);
                    back3.setOnMouseEntered(h -> back3.setStyle(b2_HOVERED_BUTTON_STYLE));
                    back3.setOnMouseExited(h -> back3.setStyle(b2_IDLE_BUTTON_STYLE));
                    back3.setOnMousePressed(h -> back3.setStyle(b2_CLICKED_BUTTON_STYLE));
                    back3.setOnAction(h -> {
                            try{Thread.sleep(100);}
                            catch(Exception f){}
                            window.setScene(ISP.s9);
                    });
                    Button cont3 = new Button("To Menu");
                    cont3.relocate(1105,715);
                    cont3.setStyle(b2_IDLE_BUTTON_STYLE);
                    cont3.setOnMouseEntered(i -> cont3.setStyle(b2_HOVERED_BUTTON_STYLE));
                    cont3.setOnMouseExited(i -> cont3.setStyle(b2_IDLE_BUTTON_STYLE));
                    cont3.setOnMousePressed(i -> cont3.setStyle(b2_CLICKED_BUTTON_STYLE));
                    cont3.setOnAction(i -> {
                        try{Thread.sleep(100);}
                        catch(Exception f){}
                        window.setScene(ISP.s0);
                    });
                    root8.getChildren().add(back3);
                    root8.getChildren().add(cont3);
                    window.setScene(ISP.s10);
                });
                root6.getChildren().add(back2);
                root6.getChildren().add(cont2);
                window.setScene(ISP.s9);
            });
            root4.getChildren().add(back1);
            root4.getChildren().add(cont1);
            window.setScene(ISP.s8);
            
            
            
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

        root.getChildren().add(at);
        root.getChildren().add(quit);

        root.getChildren().add(start);
        ISP.s0 = new Scene(root, 1200, 750);
        
        window.setTitle("Covid Dilemma");
        window.setScene(ISP.s0);
        window.show();
    }
}
