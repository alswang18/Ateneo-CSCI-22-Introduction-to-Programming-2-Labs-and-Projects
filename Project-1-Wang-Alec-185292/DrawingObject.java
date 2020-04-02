/**
 * Description (in your own words) of the class goes here. 
 * This is the DrawingObject interface. All visual objects within the SceneCanvas implement this interface.
 *
 * @author Alec Wang
 * @version Aoril 1 2020
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
import java.awt.Graphics2D;

public interface DrawingObject {
    void draw(Graphics2D g2d);

    void adjustX(double distance);

    double getX();
}