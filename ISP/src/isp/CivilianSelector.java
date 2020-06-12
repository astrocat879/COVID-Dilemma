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
