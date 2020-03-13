/**
 * This is the EmojiStarter class.
 * This is contains the main method. It sets up the GUI and button listeners.
 *
 * @author Alec Wang
 * @version March 13 2020
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
public class EmojiStarter{
	public static void main(String args[]){
		EmojiFrame emojiFrame = new EmojiFrame();
		emojiFrame.setUpGUI();
		emojiFrame.setUpButtonListener();
	}
}