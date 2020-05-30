package isp;

/**
 *
 * @author astro
 */
import java.util.*;
public class Event {
    ArrayList<Integer> factor1, amount1, factor2, amount2;
    String question, answer1, answer2;
    public Event(ArrayList<Integer> factor1, ArrayList<Integer> amount1,ArrayList<Integer> factor2, ArrayList<Integer> amount2, String question, String answer1, String answer2){
        this.factor1 = factor1;
        this.amount1 = amount1;
        this.factor2 = factor2;
        this.amount2 = amount2;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }
}
