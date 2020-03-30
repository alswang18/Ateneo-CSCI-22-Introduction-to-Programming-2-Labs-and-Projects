import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square implements DrawingObject {
    private double X;
    private double Y;
    private int size;
    private Color color;

    public Square(double x, double y, int size, Color color) {
        this.X = x;
        this.Y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fill(new Rectangle2D.Double(X, Y, size, size));
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