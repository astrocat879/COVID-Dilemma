package isp;

/**
 *
 * @author astro
 */
import java.util.*;
public class Event {
    int [] factor1, amount1, factor2, amount2;
    private int y;
    String question, answer1, answer2;
    public Event(int [] factor1, int [] amount1, int [] factor2, int [] amount2, String question, String answer1, String answer2){
        this.factor1 = factor1;
        this.amount1 = amount1;
        this.factor2 = factor2;
        this.amount2 = amount2;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        y = 155;
    }
    public Event(int [] factor1, int [] amount1, int [] factor2, int [] amount2, String question, String answer1, String answer2, int y){
        this.factor1 = factor1;
        this.amount1 = amount1;
        this.factor2 = factor2;
        this.amount2 = amount2;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.y = y;
    }
    public int getY(){
        return y;
    }
}
