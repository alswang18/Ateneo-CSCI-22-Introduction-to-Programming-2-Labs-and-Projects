/**
 * Description (in your own words) of the class goes here. 
 * This is a class wrapper for the java.awt.geom.Line2D class. This adds the functionality described within DrawingObject to the Line2D as well as describing the thickness and color when instantiated.
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
import java.awt.geom.Line2D;

public class Line implements DrawingObject {
    private double xStart;
    private double yStart;
    private double xEnd;
    private double yEnd;
    private int thickness;
    private Color color;

    public Line(double xStart, double yStart, double xEnd, double yEnd, int thickness, Color color) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(new Line2D.Double(xStart, yStart, xEnd, yEnd));
    }

    @Override
    public void adjustX(double distance) {
        xStart += distance;
        xEnd += distance;
    }

    @Override
    public double getX() {
        return xStart;
    }
}