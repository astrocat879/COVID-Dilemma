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
public class PrimeMinisterSelector {
    public static void add(Event ee){
        ISP.PMEvents.add(ee);
        ISP.PMUsed.add(false);
    }
    public static int select(){
        boolean has = false;
        for(int i = 0;i<ISP.PMUsed.size();i++){
            if(ISP.PMUsed.get(i) == false){
                has = true;
                break;
            }
        }
        if(!has)return -1;
        while(true){
            int id = (int)(Math.random()*(ISP.PMEvents.size()));
            if(ISP.PMUsed.get(id) == false){
                ISP.PMUsed.set(id,true);
                return id;
            }
        }
    }
    public static boolean checker(){
        int cnt = 0;
        for(int i = 0;i<ISP.PMUsed.size();i++){
            if(ISP.PMUsed.get(i) == false)cnt++;
        }
        return (cnt == 1);
    }
    public static void reset(){
        for(int i = 0;i<ISP.PMUsed.size();i++){
            ISP.PMUsed.set(i, false);
        }
    }
}
