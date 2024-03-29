/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
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

public class ISP extends Application {
    
    static Scene s0, s1, s2,s3,s4,s5,s6,s7,s8,s9,s10, end1,end2;
    public static ArrayList<Event> TutEvents = new ArrayList<Event>();
    public static ArrayList<Event> PMEvents = new ArrayList<Event>();
    public static ArrayList<Boolean> PMUsed = new ArrayList<Boolean>();
    public static ArrayList<Event> FEvents = new ArrayList<Event>();
    public static ArrayList<Boolean> FUsed = new ArrayList<Boolean>();
    public static ArrayList<Achievement> TutAch = new ArrayList<Achievement>();
    public static ArrayList<Achievement> PMAch = new ArrayList<Achievement>();
    public static ArrayList<Achievement> FAch = new ArrayList<Achievement>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        PMAchievements.generateAchievements();
        FamilyAchievements.generateAchievements();
        End1.run(primaryStage);
        End2.run(primaryStage);
        PrimeMinisterEvents.generateEvents();
        FamilyEvents.generateEvents();
        TutorialAchievements.generateAchievements();
        TutorialEvents.generateEvents();
        SelectLevel.run(primaryStage);
        tutorial.run(primaryStage);
        MainMenu.run(primaryStage);
        TutorialEnd.run(primaryStage);
        PrimeMinister.run(primaryStage);
        Family.run(primaryStage);
        //AchievementScreen1.run(primaryStage);
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
