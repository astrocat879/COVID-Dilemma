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
public class FamilyAchievements{
    public static void generateAchievements(){
        ISP.FAch.add(new Achievement("Lose your job",false));
        ISP.FAch.add(new Achievement("Fill your money meter",false));
        ISP.FAch.add(new Achievement("Learn to code",false));
    }
}
