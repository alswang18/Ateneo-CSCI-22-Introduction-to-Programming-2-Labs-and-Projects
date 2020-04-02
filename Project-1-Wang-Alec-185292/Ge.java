/**
 * Description (in your own words) of the class goes here. 
 * This is class draws the second half of the Kanji for three pieces, the Ge character. This is a composite Shape that combines my Square class with several instances of my line class. 
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
import java.awt.*;

public class Ge implements DrawingObject {
    private int X;
    private Color color;

    public Ge(int x, Color color) {
        this.X = x;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Square s1 = new Square(570, 630, 200, Color.GREEN);
        s1.draw(g2d);
        Line l1 = new Line(580, 685, 670, 635, 4, color);
        Line l2 = new Line(760, 685, 670, 635, 4, color);
        Line l3 = new Line(670, 755, 670, 645, 4, color);
        l1.draw(g2d);
        l2.draw(g2d);
        l3.draw(g2d);
    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

}