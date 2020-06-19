/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement for PM
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
 *Revision History:
 *  - June 10th, 2020; Created by Ronald You
 * 
 */
public class PMAchievements{
    public static void generateAchievements(){
        ISP.PMAch.add(new Achievement("Develop a cure",false));
        ISP.PMAch.add(new Achievement("Choose Canada first",false));
        ISP.PMAch.add(new Achievement("Stimulate the economy",false));
    }

}
