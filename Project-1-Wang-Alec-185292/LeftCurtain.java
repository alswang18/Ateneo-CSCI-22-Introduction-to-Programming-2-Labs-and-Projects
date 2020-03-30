import java.awt.*;
import java.awt.geom.Rectangle2D;

public class LeftCurtain implements DrawingObject {

    double xOffset;

    public LeftCurtain(double x) {
        xOffset = x;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(0 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(32 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(40 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(72 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(80 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(112 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(120 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(152 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(160 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(192 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(200 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(232 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(240 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(272 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(280 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(312 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(320 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(352 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(360 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(392 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(400 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(432 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(440 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(472 + xOffset, 0, 8, 768));
        g2d.setColor(new Color(186, 111, 63));
        g2d.fill(new Rectangle2D.Double(480 + xOffset, 0, 32, 768));
        g2d.setColor(new Color(127, 49, 0));
        g2d.fill(new Rectangle2D.Double(512 + xOffset, 0, 8, 768));
    }

    public void adjustX(double distance) {
        xOffset += distance;
    }

    public double getX() {
        return xOffset;
    }
}
