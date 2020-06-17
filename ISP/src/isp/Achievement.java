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

/**
 *Revision History:
 *  - June 6th, 2020: Created by Ronald You
 * 
 */
public class Achievement {
    String question;
    boolean status;
    public Achievement(String q,boolean stat){
        question = q;
        status = stat;
    }
}
