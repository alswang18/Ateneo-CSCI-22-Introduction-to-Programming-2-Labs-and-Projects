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

    public void adjustY(double distance) {
        Y += distance;
    }

    public double getY() {
        return Y;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}