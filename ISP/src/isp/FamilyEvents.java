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
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your neighbour invites your family over for dinner, what do you do?","Hmm, why not, I could use some fun","Stay home and ignore invite",155, 0));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Thousands of people are protesting in the streets for Taco Tuesday","I should go, I love tacos","Maybe not, I prefer taco thursday",155, 0));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your son wants to go to the store with you","Bring him to the store","Don’t bring him to the store, I need my alone time",155, 0));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your daughter wants to go hang out with friends","Don’t let her","Let her",155, 0));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your children aren’t doing homework","Let them chill","Force them by taking away their video games",155, 0));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Gyms have closed down","Buy expensive equipment ","Force them by taking away their video games",155, 0));
       
    }
    
    
}

