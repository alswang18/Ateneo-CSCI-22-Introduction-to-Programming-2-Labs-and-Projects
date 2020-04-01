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

    public void adjustRotation(int d) {
        degrees += d;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}