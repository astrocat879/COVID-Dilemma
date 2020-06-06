/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;

/**
 *
 * @author ronal
 */
public class Achievements {
    boolean ach [] = new boolean [5];
    File fileName;
    public Achievements(String f) throws FileNotFoundException{
        fileName = new File(f + ".txt");
        if(!fileName.exists()){
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        }
    }
    
    public boolean[] getAch(String fName){
       boolean check [] = new boolean [ach.length];
       String input = "";
        int lineNums = 0;
        try{
            BufferedReader lineInput = new BufferedReader(new FileReader(fileName));
                String checkingLength = "";
		while(checkingLength!=null){
                    checkingLength = lineInput.readLine();
                    lineNums ++;
                }
	}
        
	catch (IOException e) {}
        
        try{
            BufferedReader lineInput = new BufferedReader(new FileReader(fileName));
            input = lineInput.readLine();
            for(int i=0;i<lineNums;i++){
                if(input.substring(input.indexOf(" ")).equals("true")){
                    check[i] = true;
                }
                else{
                    check[i] = false;
                }
            }
	}
        
	catch (IOException e) {}
        return check;
    }
    
    

    
   
    
}
