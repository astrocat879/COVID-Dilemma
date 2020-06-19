/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Creates events for PM
 */

package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class PrimeMinisterEvents{
    public static void generateEvents(){
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Someone sent you a nice letter!", "Yay!", "Nay!",145, 0));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {-15,-15,5}, new int [] {0,1,2}, new int [] {5,5,-10}, "COVID-19 is dampening the economy do you…", "Tell them to continue to work to until the situation gets worse", "Tell them to get quarantined, every life matters",145, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,-10}, new int [] {0,1}, new int [] {-5,5}, "A group of protestors are against quarantine. The protest is peaceful, but you think this could be a public health issue.", "Do nothing", "Use force to disperse protesters",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Reporters begin asking you how you think other world leaders did to deal with COVID-19. How do you respond?", "Pause and think for a very very long time before responding", "Reject their question and refuse to respond",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {1,2}, new int [] {5,-10}, new int [] {1,2}, new int [] {-10,10}, "Quarantine and the lack of processing and packaging diminishes the amount of food. How do you plan on resolving the issue?", "Bargain with other countries", "Tell them when COVID-19 is over, the issue resolves itself",125, 1));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Zoom calls are insecure but you must use it to call co-workers. Other countries could easily get sensitive information.", "Try to find an alternative and more secure calling system recommended by your employees", "Just use zoom and risk information leaks",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {-15}, new int [] {0,1,2}, new int [] {10,-5,-15}, "Unemployment rates are now over 80%. What do you do?", "Verbally reassure public", "Open more opportunities for the people and provide monthly relief payments",155, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {5,5}, new int [] {0,1,2}, new int [] {-5,-15,10}, "Airlines are arguing that flights should open again.", "Ignore them", "Agree with them and open up airports to stimulate the economy",155, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,10}, new int [] {0,1}, new int [] {5,-10}, "A company has invented a new vaccine for COVID, but needs it to be tested in hospitals, which may not be secure. Do you let them test?", "Yes", "No",125, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {-5,5,5}, new int [] {0,1,2}, new int [] {10,5,-5}, "Social distancing is extremely important in protecting against Covid-19. How will you enforce it?", "Importing laws that take away money from those who do not follow", "Importing laws that give money to those who do follow",130, 1));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "At times of COVID, you need to make many public speeches about health awareness. Do you …", "Get science to back up your opinion which will take longer", "Speak in a convincing tone so you can soothe them more",145, 1));
        //PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,10}, new int [] {0,1}, new int [] {5,-10}, "During times of COVID, you go through the difficult decision of comforting your citizens or telling them the harshness in order to protect them. Do you …", "Tell them that COVID is no child’s play and protect themselves the best they can", "Soothe them out and tell them that the government will have everything under control",135, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {10,10,-20}, new int [] {1,2}, new int [] {-5,-10}, "An issue with a bio-pandemic is that pregnant women have no safe place to give birth. What do you do?", "Create individual hospitals purely for this purpose", "Try to section out each hospital the best possible so that pregnant women have places to give birth",145, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {5}, new int [] {0}, new int [] {-15}, "People begin yelling at you for doing a bad job at dealing with COVID-19. Do you …", "Apologize for your misjudgement and mistakes", "Try to explain that COVID-19 was not under your control and we can simply not handle such a massive pandemic",135, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,-10}, new int [] {0,1,2}, new int [] {5,5,-10}, "Do you provide a mask to every citizen?", "Seems like a waste of money", "Definitely",155, 1));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Masks are extremely important in protecting against COVID-19", "I understand", "Ok",155, 0));        
        //PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "People ask you what are common preventions to COVID-19. Do you …", "Tell them and let them see the irony of you doing what you say you should not", "Don’t speak and walk away/put on a mask and walk farther",155, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {5}, new int [] {}, new int [] {}, "One of your close relatives gets COVID-19. How do you react?", "Trust science and post on social media", "Keep it private and intend on hiding it",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,5}, new int [] {0,1}, new int [] {-10,-15}, "A new vaccine has been succesfully created, however anti-vaxxers are refusing to take the shot.", "Force them to take the shot", "Leave them alone",135, 1));
        //PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {5}, new int [] {0}, new int [] {7}, "Due to the fact that the time people spend on computers increased greatly, this produced many unethical hackers that try to hack the government system.", "Make a public announcement convincing these people to stop", "Enforce a law for this time where people that do unethical hacking are fined",125, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {5,7}, new int [] {1}, new int [] {3}, "During times like COVID, many people are gaining weight at home. How do you promote exercising at home?", "Implement online events and activities for these people", "Convince them to exercise safely more often",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {-10,5,5}, new int [] {0,1,2}, new int [] {-5,5,10}, "The election is coming up. What do you think is a wise adjustment for it in a time like this?", "Push it off for a year for now", "Hold an online one, the traditional 4 years cannot be broken",142, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,2}, new int [] {10,-10}, new int [] {0,2}, new int [] {-10,10}, "Your country is struggling, but another country asks for help. How do you respond?", "Help them, we should always help a country in need", "Don’t help them, we must fight our own fight before helping others fight theirs",135, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {-5,5,-5}, new int [] {0,1,2}, new int [] {5,-5,5}, "Online meetings for jobs prove to be ineffective. As the prime minister, what do you recommend businesses and companies to do?", "Continue with online meetings, if meetings are to happen safely, they must be online", "Have a group of people work at work at times. The economy still matters to the state of the country",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {5,5,-10}, new int [] {0,1,2}, new int [] {-5,-5,-5}, "Too many people are getting tested for COVID-19, there is not enough equipment to keep up. What do you do?", "Try to get more equipment, everyone that wants a test deserves to get one", "Lessen the people getting tests based off of chances of having Covid based off of symptoms",127, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {10,-3}, new int [] {0}, new int [] {-3}, "The number of depressed citizens is causing fear amongst the communities. How do you plan on resolving the issue?", "Promote healthy and safe exercise, mental health is important, but being safe is as well", "Ask them to try to entertain themselves while social distancing, exercising is not suitable for everyone, but social distancing must be.",125, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1,2}, new int [] {7,7,-15}, new int [] {0,1}, new int [] {-10,-15}, "Health officials recommend spending more money on developing a cure to COVID.", "Okay sure, people need this", "No, the country needs money",145, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-5,10}, new int [] {0,1}, new int [] {5,-10}, "Many people are forced to go out and work in COVID-heavy areas such as TTC drivers, when it is practically useless.", "Stop most human-needed services, their health is also important", "Keep the services, what if people need it?",125, 1));
        //PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {3}, new int [] {0}, new int [] {-3}, "How do you try to keep the society intact whilst maintaining social distancing?", "Promote the use of online messaging and calling", "Do not worry about it, it will be ok after COVID-19",135, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0}, new int [] {7}, new int [] {0}, new int [] {-7}, "Countries would like to trace back the origins of COVID-19 through the WHO. What is your stance?", "Support them, the world deserves an answer", "Don’t support them, we must resolve issues and not point fingers right now",145, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,2}, new int [] {10,-10}, new int [] {0}, new int [] {-5}, "You learn that other countries are taking a new approach on COVID-19. Do you follow along?", "Yes, it must be right if other countries are doing it", "No, we shall wait and see the results, I wish not let it be the downfall of our country",145, 1));
        PrimeMinisterSelector.add(new Event(new int [] {0,1}, new int [] {-10,5}, new int [] {0,1,2}, new int [] {5,-15,5}, "Shops are opening up because of the lack of business and money. Do you …", "Enforce laws to suppress the behaviour", "Allow them to open up, the economy needs it",155, 1));

    }
    
    
}
