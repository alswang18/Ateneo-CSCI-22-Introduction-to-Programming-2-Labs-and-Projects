import java.awt.*;
import java.awt.geom.*;

public class Ri implements DrawingObject {
    private int X;
    private int Y;
    private Color color;

    public Ri(int x, int y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(color);
        g2d.draw(new Line2D.Double(492 + X, 637 + Y, 492 + X, 672 + Y));
        g2d.draw(new Line2D.Double(532 + X, 637 + Y, 532 + X, 672 + Y));
        g2d.draw(new Line2D.Double(492 + X, 672 + Y, 532 + X, 672 + Y));
        g2d.draw(new Line2D.Double(492 + X, 637 + Y, 532 + X, 637 + Y));
        g2d.draw(new Line2D.Double(492 + X, 655 + Y, 532 + X, 655 + Y));
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