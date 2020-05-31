/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author astro
 */
public class TutorialEvents {
    public static void generateEvents(){
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {0, 1}, new int [] {-10, 20}, "You get a job offer at Costco. Take it?", "Nah, I don't want to go out", "Sure, I need the money"));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {0, 1}, new int [] {20, -10}, "A yoga mat is on sale! Buy it?", "Hmm... I'm too lazy.", "Sure, I need exercise."));
    }
}
