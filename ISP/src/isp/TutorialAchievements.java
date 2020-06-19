/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievements for tutorial
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TutorialAchievements{
    public static void generateAchievements(){
        ISP.TutAch.add(new Achievement("Start tutorial",false));
        ISP.TutAch.add(new Achievement("Reach day 1",false));
        ISP.TutAch.add(new Achievement("Finish tutorial",false));
    }

}
