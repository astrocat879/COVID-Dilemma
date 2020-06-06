/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
 */


package isp;

/**
 *Revision History:
 *  - May 29th, 2020: Created by Matthew Li
 *  - May 30th, 2020: Updated by Justin Zhu
 *  - June 1st, 2020: Updated by Ronald You
 * 
 */
import java.util.*;
public class Event {
    int [] factor1, amount1, factor2, amount2;
    private int y, dayskip;
    String question, answer1, answer2;
    public Event(int [] factor1, int [] amount1, int [] factor2, int [] amount2, String question, String answer1, String answer2, int dayskip){
        this.factor1 = factor1;
        this.amount1 = amount1;
        this.factor2 = factor2;
        this.amount2 = amount2;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        y = 155;
        this.dayskip = dayskip;
    }
    public Event(int [] factor1, int [] amount1, int [] factor2, int [] amount2, String question, String answer1, String answer2, int y, int dayskip){
        this.factor1 = factor1;
        this.amount1 = amount1;
        this.factor2 = factor2;
        this.amount2 = amount2;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.y = y;
        this.dayskip = dayskip;
    }
    public int getY(){
        return y;
    }
    public int getDays(){
        return dayskip;
    }
}
