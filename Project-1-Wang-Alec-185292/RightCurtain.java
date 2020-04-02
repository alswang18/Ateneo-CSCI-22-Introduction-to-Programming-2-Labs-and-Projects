/**
 * Description (in your own words) of the class goes here. 
 * This is the class that contains the RightCurtain that opens when the GUI starts. This class contains a bunch of Rectangles that make-up the bamboo sliding door pattern.
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
import java.awt.geom.Rectangle2D;

public class RightCurtain implements DrawingObject {

    double xOffset;

    public RightCurtain(double x) {
        xOffset = x;
    }

    @Override
    public void draw(Graphics2D g2d) {

        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(1024 - 40 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 80 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 120 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 160 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 200 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 240 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 280 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 320 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 360 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 400 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 440 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 480 + xOffset, 0, 8, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 512 + xOffset, 0, 8, 768));

        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(1024 - 32 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 72 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 112 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 152 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 192 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 232 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 272 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 312 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 352 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 392 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 432 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 472 + xOffset, 0, 32, 768));
        g2d.fill(new Rectangle2D.Double(1024 - 512 + xOffset, 0, 32, 768));
    }

    public void adjustX(double distance) {
        xOffset += distance;
    }

    public double getX() {
        return xOffset;
    }
}
