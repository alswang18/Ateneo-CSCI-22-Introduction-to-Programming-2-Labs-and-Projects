/**
 * Description (in your own words) of the class goes here. 
 * This is a class wrapper for the java.awt.geom.Path2D class. This is a basic class that draws a Triangle using the Path2D class and adds functionality stated within the DrawingObjects.java interface file.
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
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    private double X;
    private double Y;
    private int degrees;
    private Color color;

    public Triangle(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
        degrees = 45;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        Path2D p = new Path2D.Double();
        g2d.rotate(Math.toRadians(-degrees), 825 + X, 695 + Y);
        p.moveTo(815 + X, 710 + Y);
        p.lineTo(835 + X, 710 + Y);
        p.lineTo(825 + X, 680 + Y);
        p.lineTo(815 + X, 710 + Y);
        g2d.fill(p);
        g2d.rotate(Math.toRadians(degrees), 825 + X, 695 + Y);

    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

    public void adjustRotation(int d) {
        degrees += d;
    }

    public int getRotation() {
        return degrees;
    }
}