import java.awt.*;
import java.awt.geom.*;

public class Uchiha implements DrawingObject {
    private double X;
    private double Y;
    private int degrees;
    private Color color;

    public Uchiha(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
        degrees = 45;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        g2d.fill(new Ellipse2D.Double(512 - 50 + X, 35 + Y, 100, 100));
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(512 - 50 + X, 35 + Y, 100, 100));
        g2d.setColor(new Color(135, 206, 235));
        g2d.fill(new Ellipse2D.Double(512 - 50 + X, 80 + Y, 100, 70));
        g2d.setColor(Color.WHITE);
        g2d.fill(new Ellipse2D.Double(512 - 42.5 + X, 83 + Y, 85, 48));
        g2d.fill(new Rectangle2D.Double(497 + X, 95 + Y, 30, 50));

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