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
 *
 * @author ronal
 */
public class FamilyEvents{
    public static void generateEvents(){
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You find yourself in the middle of a pandemic: COVID19.", "Uh oh...", "So what?",155, 0));
    }
    
    
}

