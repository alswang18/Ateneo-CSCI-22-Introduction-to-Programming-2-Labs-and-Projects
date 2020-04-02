/**
 * Description (in your own words) of the class goes here. 
 * This is the java class that contains the Sharingan class. This class draws the three tomoe of the basic fully awakened Sharingan, and allows us to rotate it as per the normal demon windmill pattern that is activated when one falls for the Sharingan Genjutsus.
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

public class Sharingan implements DrawingObject {
    private double X;
    private double Y;
    private int degrees;
    private Color color;

    public Sharingan(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
        degrees = 45;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(400, 270, 230, 230));
        g2d.rotate(Math.toRadians(degrees), 512, 384);
        Circle c1 = new Circle(X, Y, 30, color);
        c1.draw(g2d);
        Path2D p = new Path2D.Double();
        p.moveTo(629, 392);
        p.lineTo(599, 422);
        p.lineTo(649, 392);
        p.lineTo(629, 392);
        g2d.fill(p);
        g2d.rotate(Math.toRadians(-degrees), 512, 384);
        g2d.rotate(Math.toRadians(degrees + 120), 512, 384);
        Circle c2 = new Circle(X, Y, 30, color);
        c2.draw(g2d);
        Path2D p1 = new Path2D.Double();
        p1.moveTo(629, 392);
        p1.lineTo(599, 422);
        p1.lineTo(649, 392);
        p1.lineTo(629, 392);
        g2d.fill(p1);
        g2d.rotate(Math.toRadians(-degrees + -120), 512, 384);
        g2d.rotate(Math.toRadians(degrees + 240), 512, 384);
        Circle c3 = new Circle(X, Y, 30, color);
        c3.draw(g2d);
        Path2D p2 = new Path2D.Double();
        p2.moveTo(629, 392);
        p2.lineTo(599, 422);
        p2.lineTo(649, 392);
        p2.lineTo(629, 392);
        g2d.fill(p2);
        g2d.rotate(Math.toRadians(-degrees + -240), 512, 384);
        g2d.setStroke(new BasicStroke(1));

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

    public void setColor(Color color) {
        this.color = color;
    }
}