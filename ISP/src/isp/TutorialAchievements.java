/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class TutorialAchievements{
    public static void generateAchievements(){
        ISP.TutAch.add(new Achievement("Start tutorial",true));
        ISP.TutAch.add(new Achievement("Reach day 1",false));
        ISP.TutAch.add(new Achievement("Finish tutorial",false));
    }

}
