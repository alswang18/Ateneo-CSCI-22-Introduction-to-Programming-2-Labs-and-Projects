/**
 * Description (in your own words) of the class goes here. 
 * This is the class that draws the first half of the Kanji for Japan, the Ri character. This is a composite Shape that combines my Square class with several instances of my line class. 
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

public class Ri implements DrawingObject {
    private int X;
    private int Y;
    private Color color;

    public Ri(int x, int y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Square s1 = new Square(487, 630, 50, Color.GREEN);
        s1.draw(g2d);
        Line l1 = new Line(492 + X, 637 + Y, 492 + X, 672 + Y, 3, color);
        l1.draw(g2d);
        Line l2 = new Line(532 + X, 637 + Y, 532 + X, 672 + Y, 3, color);
        l2.draw(g2d);
        Line l3 = new Line(492 + X, 672 + Y, 532 + X, 672 + Y, 3, color);
        l3.draw(g2d);
        Line l4 = new Line(492 + X, 637 + Y, 532 + X, 637 + Y, 3, color);
        l4.draw(g2d);
        Line l5 = new Line(492 + X, 655 + Y, 532 + X, 655 + Y, 3, color);
        l5.draw(g2d);
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