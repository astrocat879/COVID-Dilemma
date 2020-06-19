/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Selects random family event
 */
package isp;


import java.util.*;
public class FamilySelector {
    public static void add(Event ee){
        ISP.FEvents.add(ee);
        ISP.FUsed.add(false);
    }
    public static int select(){
        boolean has = false;
        for(int i = 0;i<ISP.FUsed.size();i++){
            if(ISP.FUsed.get(i) == false){
                has = true;
                break;
            }
        }
        if(!has)return -1;
        while(true){
            int id = (int)(Math.random()*(ISP.FEvents.size()));
            if(ISP.FUsed.get(id) == false){
                complete(id);
                return id;
            }
        }
    }
    public static Event getEvent(int id){
        return ISP.FEvents.get(id);
    }
    public static void complete(int id){
        ISP.FUsed.set(id,true);
    }
    public static boolean checker(){
        int cnt = 0;
        for(int i = 0;i<ISP.FUsed.size();i++){
            if(ISP.FUsed.get(i) == false)cnt++;
        }
        return (cnt == 1);
    }
    public static void reset(){
        for(int i = 0;i<ISP.FUsed.size();i++){
            ISP.FUsed.set(i, false);
        }
    }
}
