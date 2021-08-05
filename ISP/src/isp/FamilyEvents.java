/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Creates all events for family
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FamilyEvents{
    public static void generateEvents(){
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "It's a nice day today!", "Yay!", "Nay!",145, 0));
        FamilySelector.add(new Event(new int [] {0,1,2}, new int [] {5,5,-10}, new int [] {2}, new int [] {5}, "Your neighbour invites your family over for dinner, what do you do?","Hmm, why not, I could use some fun","Stay home and ignore invite",145, 1));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Thousands of people are protesting in the streets for Taco Tuesday","I should go, I love tacos","Maybe not, I prefer taco thursday",155, 0));
        FamilySelector.add(new Event(new int [] {0,2,3}, new int [] {5,-10,-5}, new int [] {0,2,3}, new int [] {-5,-5,-5}, "Your son wants to go to the store with you","Bring him to the store","Don’t bring him to the store, I need my alone time",150, 1));
        FamilySelector.add(new Event(new int [] {0}, new int [] {-5}, new int [] {0,2}, new int [] {-5,-5}, "Your daughter wants to go hang out with friends","Don’t let her","Let her",155, 1));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {0}, new int [] {-5}, "Your children aren’t doing homework","Let them chill","Force them by taking away their video games",155, 1));
        FamilySelector.add(new Event(new int [] {2,3}, new int [] {10,-10}, new int [] {2}, new int [] {-10}, "Gyms have closed down","Buy expensive equipment to exercise","Continue watching Netflix",155, 1));
        FamilySelector.add(new Event(new int [] {0,1,2,3}, new int [] {5,5,-10,-15}, new int [] {1}, new int [] {5}, "Your family feels cooped up","Go on a road trip and book a hotel","Take a walk in the park",155, 1));
        FamilySelector.add(new Event(new int [] {0,1,3}, new int [] {5,5,-5}, new int [] {0,1}, new int [] {5,10}, "Your internet provider has been lacking recently","Upgrade your plan","Switch to Bell",155, 1));
        FamilySelector.add(new Event(new int [] {2,3}, new int [] {-10,-5}, new int [] {}, new int [] {}, "You need to buy groceries however you are out of masks","Buy groceries anyways","Just wait it out",155, 1));
        FamilySelector.add(new Event(new int [] {0,2}, new int [] {5,-10}, new int [] {2}, new int [] {5}, "Your boss tells you to go to the office to get something","Go get it","Don’t go and get it and tell them its dangerous",155, 1));
        FamilySelector.add(new Event(new int [] {2,3}, new int [] {-5,-5}, new int [] {0,1,2,3}, new int [] {-100,-100,-100,-100}, "Oh no! Your toilet broke and water is all over the house. What do you do?","Call the plumber over to fix the toilet","Try to fix the toilet yourself",140, 1));
        FamilySelector.add(new Event(new int [] {2,3}, new int [] {-15,10}, new int [] {}, new int [] {}, "The summer camp you signed up for is giving refunds, but it is in person. Do you go or not?","I need the money","Not worth it, I rather be safe",140, 0));
        FamilySelector.add(new Event(new int [] {0,1}, new int [] {10,5}, new int [] {0,1}, new int [] {-5,10}, "You get into a fight with your significant other. You want to go outside but you can't. What do you do?","Talk it out with her","Continue not talking and wait it out",130, 1));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your parents call to check in on you. How do you reply?","Tell them the truth","Lie to them",155, 1));
        FamilySelector.add(new Event(new int [] {0,1,3}, new int [] {10,10,-15}, new int [] {3}, new int [] {5}, "You just got fired because your boss realized they don't need you anymore. What do you do next?","Relax and do nothing","Find another job",135, 0));
        FamilySelector.add(new Event(new int [] {1,2}, new int [] {-10, -5}, new int [] {3}, new int [] {-5}, "You're not feeling well and have no energy","Wait it out","See a doctor",155, 1));
        FamilySelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "At the store you see someone walk in without lining up. What is going through your head?","They probably have a valid reason","I want to yell at them because it isn’t fair that they can get in and we all have to wait",135, 0));
        FamilySelector.add(new Event(new int [] {0,1}, new int [] {5,5}, new int [] {0,1}, new int [] {5,5}, "You are bored at home. Your T.V. and any form of entertainment is used up by your kids. You have no work to do. What do you do for the day?","Learn how to code","Play your favourite instrument",125, 1));
        FamilySelector.add(new Event(new int [] {0,1}, new int [] {5,5}, new int [] {0,1}, new int [] {-5,-5}, "Your best friend gets COVID-19, how do you help them out?","Give them a call and talk with them","Do nothing",155, 1));
        FamilySelector.add(new Event(new int [] {0}, new int [] {5}, new int [] {0,1,3}, new int [] {10,5,-10}, "Your significant other’s computer just broke down but they need to work.","Let them use your computer","Get her a new computer",145, 0));
        FamilySelector.add(new Event(new int [] {0,3}, new int [] {10,-5}, new int [] {0,3}, new int [] {-5,-5}, "Your children love beef but it's getting expensive. They dislike chicken but it's a cheaper option. What do you do?","Beef","Chicken",127, 1));
        FamilySelector.add(new Event(new int [] {0,3}, new int [] {5,-5}, new int [] {0,3}, new int [] {5,5}, "Your kids need a form of entertainment during quarantine. What do you do?","Let them stay home and play video games","Teach them something new, such as programming",140, 1));
        

       

        

        
        
      

       
    }
    
    
}

