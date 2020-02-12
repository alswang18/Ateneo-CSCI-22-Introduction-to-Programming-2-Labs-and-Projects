/**
 * StoryStarter is the class that contains the main class that allows the Story class to move. 
 <br>It triggers the story function createAndPrintStory which is a while loop that allows the game to function fully. Note my first day of class due to load rev approval lag was Jan 30.
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

public class StoryStarter
{
	private static Story story;
	public static void main(String[] args){
	story = new Story();
	story.createAndPrintStory();
	}
}