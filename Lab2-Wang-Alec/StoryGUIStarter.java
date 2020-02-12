/**
 * This is the main method for the StoryGUI class. This class setups the GUI and also sets up the button listeners.
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
public class StoryGUIStarter
{
  private static StoryGUI sgui;
  public static void main(String[] args)
  {
    sgui = new StoryGUI();
    sgui.setupGUI();
    sgui.setUpButtonListeners();
  }
}
