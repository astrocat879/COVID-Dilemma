/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *Revision History:
 *  - June 14th, 2020: Created by Ronald You
 * 
 */
public class PrimeMinisterEvents{
    public static void generateEvents(){
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "COVID-19 is dampening the economy do you…", "Tell them to continue to work until the situation gets worse", "Tell them to get quarantined, every life matters",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "A group of protestors are against quarantine. The protest is peaceful, but you think this could be a public health issue.", "Do nothing", "Tell protesters to disperse",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Reporters begin asking you how you think other world leaders did to deal with COVID-19. How do you respond?", "Pause and think for a very very long time before responding", "Reject their question and refuse to respond",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Due to quarantine, the amount of crops decreased. Furthermore, the lack of processing and packaging diminishes the amount of food. How do you plan on resolving the issue?", "Bargain with other countries", "Tell them when COVID-19 is over, the issue resolves itself",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Zoom calls are insecure but your co-workers and you must call using it. Other countries could easily hack into your system to get valuable information. You have no idea how to use/configure technology. What do you do?", "Try to find an alternative and more secure calling system recommended by your employees", "Just use zoom and risk information leaks",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Unemployment rates are now over 20%. What do you do?", "Verbally reassure public", "Open up slightly more opportunities for the people",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Airlines companies are arguing that flights should open again.", "Stop the arguing with the fact that public flights cause dangers", "Give them a chance to voice their opinion",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "A company says that they have invented a new shot that prevents COVID, but needs to be tested massly in hospitals and is insecure. Do you let them test?", "Yes", "No",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "During the time of COVID, you must make speeches about new decisions made. How will you enforce social distancing?", "Importing laws that take away money from those who do not follow", "Importing laws that give money to those who do follow",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "At times of COVID, you need to make many public speeches about health awareness. Do you …", "Get science to back up your opinion", "Speak in a convincing tone so you can soothe them more",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "During times of COVID, you go through the difficult decision of comforting your citizens or telling them the harshness in order to protect them. Do you …", "Tell them that COVID is no child’s play and protect themselves the best they can", "Soothe them out and tell them that the government will have everything under control",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "An issue with a bio-pandemic is that pregnant women have no safe place to give birth. What do you do?", "Create individual hospitals purely for this purpose in places with a higher number of COVID-infectants", "Try to section out each hospital the best possible so that pregnant women have places to give birth",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "People begin yelling at you for doing a bad job at dealing with COVID-19. Do you …", "Apologize for your misjudgement and mistakes", "Try to explain that COVID-19 was not under your control and we can simply not handle such a massive pandemic",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Do you make your citizens wear masks?", "Explain how masks can prevent the spread of COVID-19", "Explain how wearing a mask does not do anything as COVID-19 does not only spread through the mouth and nose",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "People ask you what are common preventions to COVID-19. Do you …", "Tell them and let them see the irony of you doing what you say you should not", "Don’t speak and walk away/put on a mask and walk farther",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "One of your close relatives gets COVID-19. How do you react?", "Trust science and post on social media", "Keep it private and intend on hiding it",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Due to the fact that the time people spend on computers increased greatly, this produced many unethical hackers that try to hack the government system. How do you handle this situation?", "Make a public announcement convincing these people to stop", "Enforce a law for this time where people that do unethical hacking are fined",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "During times like COVID, many people are gaining fat at home. How do you promote exercising at home?", "Implement online events and activities for these people", "Convince them to exercise safely more often",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "An issue during a pandemic is how to determine which is more urgent the disease causing the pandemic, or other deadly diseases/illnesses such as cancer, ebola, or a heart attack. What do you do?", "Explain to doctors your point of view on which is more important", "Explain to the citizens that doctors have their ability to see urgency",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "The election is coming up. What do you think is a wise adjustment for it in a time like this?", "Push it off for a year for now", "Hold an online one, the traditional 4 years cannot be broken",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Your country is struggling, but another country asks for help. How do you respond?", "Help them, we should always help a country in need", "Don’t help them, we must fight our own fight before helping others fight theirs",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Online meetings for jobs prove to be ineffective. As the prime minister, what do you recommend businesses and companies to do?", "Continue with online meetings, if meetings are to happen safely, they must be online", "Have a group of people work at work at times. The economy still matters to the state of the country",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Too many people are getting tested for COVID-19, there is not enough equipment to keep up. What do you do?", "Try to get more equipment, everyone that wants a test deserves to get one", "Lessen the people gettings tests based off of chances of them having it based off of symptoms",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "The extreme number of depressed citizens is causing fear amongst the communities. How do you plan on resolving the issue?", "Promote healthy and safe exercise, mental health is important, but being alive is as well", "Ask them to try to entertain themselves while social distancing, exercising is not suitable for everyone, but social distancing must be.",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Health officials recommend spending more money on developing a cure to COVID.", "Okay sure, people need this", "No, the country needs money",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Many people are forced to go out and work in COVID-heavy areas such as TTC drivers, when it is practically useless. How do you plan on dealing with the existence of service workers and their safety?", "Stop most human-needed services, their health is also important", "Keep the services, what if people need it?",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "People are breaking off social ties with others due to social distancing. How do you try to keep the society intact whilst maintaining social distancing?", "Promote the use of online messaging and calling", "Do not worry about it, it will be ok after COVID-19",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Countries would like to trace back the origins of COVID-19 through WHO. What is your stance?", "Support them, the world deserves an answer", "Don’t support them, we must resolve issues and not point fingers right now",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "You learn that other countries are taking a new approach on COVID-19. Do you follow along?", "Yes, it must be right if other countries are doing it", "No, we shall wait and see the results, I wish not let it be the downfall of our country",155, 0));
        PrimeMinisterSelector.add(new Event(new int [] {}, new int [] {}, new int [] {}, new int [] {}, "Shops are opening up because of the lack of business and money. Do you …", "Enforce laws the suppress the behaviour", "Allow them to open up, the economy needs it",155, 0));
    }
    
    
}
