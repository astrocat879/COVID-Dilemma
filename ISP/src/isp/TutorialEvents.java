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
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You find yourself in the middle of a pandemic: COVID19.", "Uh oh...", "So what?",155));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Fortunately, you are well off currently, so you aren't in a bind.", "Good to hear!", "So what?",155));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Above, you can see your money and health meters, which dictate whether you survive or not.", "Okay.", "So what?",100));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You will have to make a series of decisions, which will impact your meters.", "Okay.", "So what?",155));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Make sure neither of the meters are empty or else you won't survive!", "Okay.", "Sure.",155));
        ISP.TutEvents.add(new Event(new int [] {1}, new int [] {-5}, new int [] {0, 1}, new int [] {-10, 20}, "You get a job offer at Costco. Take it?", "Nah, I don't want to go out", "Sure, I need the money",155));
        ISP.TutEvents.add(new Event(new int [] {0}, new int [] {-5}, new int [] {0, 1}, new int [] {20, -10}, "A yoga mat is on sale! Buy it?", "Hmm... I'm too lazy.", "Sure, I need exercise.",155));
        ISP.TutEvents.add(new Event(new int [] {0, 1}, new int [] {-20, 5}, new int [] {0, 1}, new int [] {-20, 5}, "Vegetables are getting expensive... will you continue buying them?", "Nah... my diet can take a small hit.", "Yes, my health is important.",10));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Okay, that was a small sample of how the game works.", "Okay.", "What's next?",155));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Next, you may play as either the Prime Minister, or a family, found in the level select menu. Good luck!", "Okay.", "Thanks!",155));
    }
}
