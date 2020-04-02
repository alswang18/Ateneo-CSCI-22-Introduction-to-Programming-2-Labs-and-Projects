/**
 * Description (in your own words) of the class goes here. 
 * This is a class wrapper for the java.awt.geom.Ellipse2D class. This is a basic class that is exists to draw the Uchiha class composite object.
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
import java.awt.geom.Ellipse2D;

public class Oval implements DrawingObject {
    private double X;
    private double Y;
    private int width;
    private int height;
    private Color color;

    public Oval(double x, double y, int width, int height, Color color) {
        this.X = x;
        this.Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(X, Y, width, height));

    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}