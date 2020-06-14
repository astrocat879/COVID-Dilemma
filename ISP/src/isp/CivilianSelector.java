/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author hewmatt
 */
import java.util.*;
public class CivilianSelector {
    ArrayList<Event> events;
    ArrayList<Boolean> use;
    public CivilianSelector(){
        events = new ArrayList<>();
        use = new ArrayList<>();
    }
    public void add(Event ee){
        events.add(ee);
        use.add(false);
    }
    public int select(){
        boolean has = false;
        for(int i = 0;i<use.size();i++){
            if(use.get(i) == true){
                has = true;
                break;
            }
        }
        if(!has)return -1;
        while(true){
            int id = (int)(Math.random()*(events.size()));
            if(use.get(id) == false){
                return id;
            }
        }
    }
    public Event getEvent(int id){
        return events.get(id);
    }
    public void complete(int id){
        use.set(id,true);
    }
}
