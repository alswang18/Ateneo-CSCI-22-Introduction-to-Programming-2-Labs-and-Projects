import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    private double X;
    private double Y;
    private Color color;

    public Triangle(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        Path2D p = new Path2D.Double();
        g2d.rotate(Math.toRadians(30));
        p.moveTo(815, 710);
        p.lineTo(835, 710);
        p.lineTo(825, 680);
        p.lineTo(815, 710);
        g2d.fill(p);
        g2d.rotate(Math.toRadians(-30));

    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

    public void adjustY(double distance) {
        Y += distance;
    }

    public double getY() {
        return Y;
    }
}