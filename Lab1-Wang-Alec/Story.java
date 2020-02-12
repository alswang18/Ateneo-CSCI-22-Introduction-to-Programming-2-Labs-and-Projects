/**
 * Story is the class that lets you play a mad lib game. It stores strings in an array to use in the story called "The Toronto Professor"<br>
 using the createAndPrintStory function. Note my first day of class due to load rev approval lag was Jan 30.
 * 
 *
 * @author Alec Wang
 * @version Jan 30 2020
 */

/*
I have not discussed the Java language code 
in my program with anyone other than my instructor 
or the teaching assistants assigned to this course.

I have not used Java language code obtained 
from another student, or any other unauthorized 
source, either modified or unmodified.

If any Java language code or documentation 
used in my program was obtained from another source, 
such as a text book or webpage, those have been 
clearly noted with a proper citation in the comments 
of my code.
*/

import java.util.*;

public class Story
{
	private Scanner scan;
	private String[] wordBag;
	private String username;
	public Story(){
		scan = new Scanner(System.in);
		System.out.println("Welcome to Mad Lib Java!");
		System.out.println("What is your name?");
		username = scan.nextLine();	
		wordBag = new String[8];
	}
	
	public void createAndPrintStory(){
		boolean isY = true;
		boolean isFirst = true;
		while(isY){	
			if(isFirst){
				System.out.println("\n\nBefore we can complete the story, you'll need to give us some words\n");
			}else{
				System.out.println("\n\nWelcome back! More words please!\n");
			}
			isFirst = false;
			System.out.println("\nWhat is your favorite food?");
			wordBag[0] = scan.nextLine();
			System.out.println("\n\nA word that you would use to describe a soda?");
			wordBag[1] = scan.nextLine();
			System.out.println("\n\nA word that you would use to describe a wolverine?");
			wordBag[2] = scan.nextLine();
			System.out.println("\n\nWhat is your favorite credit card brand?");
			wordBag[3] = scan.nextLine();
			System.out.println("\n\nWhat numbers would you use to describe your credit card?");
			wordBag[4] = scan.nextLine();
			System.out.println("\n\nWhen is the expiration of your credit card number?");
			wordBag[5] = scan.nextLine();
			System.out.println("\n\nWhat are the three digits on the back of your credit card");
			wordBag[6] = scan.nextLine();
			System.out.println("\n\nWhat is your passport number?");
			wordBag[7] = scan.nextLine();
			System.out.println("\n\nWhat word would you use to describe your credit score");
			String throwaway = scan.nextLine();
			System.out.println("\n\nThe Toronto Professor");
			System.out.printf("By %s \n", username);
			System.out.printf("\n\nJordan Peterson is a very interesting fellow."); 
			System.out.printf("Many %s of course are opposed to %s. ",wordBag[0], wordBag[1]);
			System.out.printf("But this is okay, too, since the human body is just a shell, that it has nothing to do with the conscious mind, that we cannot kill our minds anymore, even if we'd like to.");
			System.out.printf("Actions are all really just a reflection of the %s around us.", wordBag[2]);
			System.out.printf("On the other hand %s's comment on the matter is less than 24 hours after USA Today reported on Peterson's supporters --the %s owner calls on the %s apologize for using terms similar to those used by Peterson, saying his remarks will cause serious damage to his team's brand, according to a report on Page Six. The report quotes Peterson's attorney, Rusty Hardin, saying: \"she has to apologize for saying those things, but he thinks she should apologize for using those words.\"", wordBag[3], wordBag[4], wordBag[5]);
			System.out.printf("Might be playing with fire when it decides what those rights are. The situation in the U.S. is very different from Canada.Because of our fact-based inquiry, our statutory framework, we must base our decisions on sound reason and the facts of the case. When dealing with %s, our judicial system is able to make %s.\n", wordBag[6], wordBag[7]);
			System.out.printf("\n\nThe end.\n");
			System.out.println("\n\nWould you like to play again? Type Y to make another story. Type any other character to exit.");
			String answer = scan.nextLine();
			if(answer.toUpperCase().equals("Y")){
				continue;
			}
			isY = false;
			System.out.println("\nGoodbye! Thank you for playing!");
		}
	}
}


