/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement for Family
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FamilyAchievements{
    public static void generateAchievements(){
        ISP.FAch.add(new Achievement("Find another job",false));
        ISP.FAch.add(new Achievement("Exercise",false));
        ISP.FAch.add(new Achievement("Learn to code",false));
    }
}
