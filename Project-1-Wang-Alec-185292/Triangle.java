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