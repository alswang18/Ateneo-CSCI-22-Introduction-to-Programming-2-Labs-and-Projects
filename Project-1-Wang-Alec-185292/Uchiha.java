/**
 * Description (in your own words) of the class goes here. 
 * This is the composite class that contains various Circle class, one Oval class, and one Rectangle class, to draw the Uchiha class logo. This class contains just the basic functions that make it eligible as a DrawingObject.
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

public class Uchiha implements DrawingObject {
    private double X;
    private double Y;
    private Color color;

    public Uchiha(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        Circle c1 = new Circle(512 - 50 + X, 35 + Y, 100, Color.WHITE);
        c1.draw(g2d);
        Circle c2 = new Circle(512 - 50 + X, 35 + Y, 100, color);
        c2.draw(g2d);
        Oval o1 = new Oval(512 - 50 + X, 80 + Y, 100, 70, new Color(135, 206, 235));
        o1.draw(g2d);
        Oval o2 = new Oval(512 - 42.5 + X, 83 + Y, 85, 48, Color.WHITE);
        o2.draw(g2d);
        Rectangle r1 = new Rectangle(497 + X, 95 + Y, 30, 50, Color.WHITE);
        r1.draw(g2d);

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