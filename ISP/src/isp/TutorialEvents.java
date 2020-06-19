/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
 */
package isp;

import java.util.ArrayList;
import java.util.Arrays;


public class TutorialEvents {
    public static void generateEvents(){
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You find yourself in the middle of a pandemic: COVID19.", "Uh oh...", "So what?",155, 0));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Fortunately, you are well off currently, so you aren't in a bind.", "Good to hear!", "So what?",155, 0));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Above, you can see your money and health meters, which dictate whether you survive or not.", "Okay.", "So what?",135, 0));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You will have to make a series of decisions, which will impact your meters.", "Okay.", "So what?",140, 0));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Make sure neither of the meters are empty or else you won't survive!", "Okay.", "Sure.",156, 0));
        ISP.TutEvents.add(new Event(new int [] {1}, new int [] {-5}, new int [] {0, 1}, new int [] {-10, 20}, "You get a job offer at Costco. Take it?", "Nah, I don't want to go out", "Sure, I need the money",162, 1));
        ISP.TutEvents.add(new Event(new int [] {0}, new int [] {-5}, new int [] {0, 1}, new int [] {20, -10}, "A yoga mat is on sale! Buy it?", "Hmm... I'm too lazy.", "Sure, I need exercise.",162, 1));
        ISP.TutEvents.add(new Event(new int [] {0, 1}, new int [] {-20, 5}, new int [] {0, 1}, new int [] {10, -5}, "Vegetables are getting expensive... will you continue buying them?", "Nah... my diet can take a small hit.", "Yes, my health is important.",148, 1));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Okay, that was a small sample of how the game works.", "Okay.", "What's next?",155, 0));
        ISP.TutEvents.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Next, you may play as either the Prime Minister, or a family, found in the level select menu. Good luck!", "Okay.", "Thanks!",142, 0));
    }
}
