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
        Square s1 = new Square(487, 630, 50, Color.GREEN);
        s1.draw(g2d);
        Line l1 = new Line(492 + X, 637 + Y, 492 + X, 672 + Y, 3, color);
        l1.draw(g2d);
        Line l2 = new Line(532 + X, 637 + Y, 532 + X, 672 + Y, 3, color);
        l2.draw(g2d);
        Line l3 = new Line(492 + X, 672 + Y, 532 + X, 672 + Y, 3, color);
        l3.draw(g2d);
        Line l4 = new Line(492 + X, 637 + Y, 532 + X, 637 + Y, 3, color);
        l4.draw(g2d);
        Line l5 = new Line(492 + X, 655 + Y, 532 + X, 655 + Y, 3, color);
        l5.draw(g2d);
    }

    @Override
    public void adjustX(double distance) {
        X += distance;
    }

    @Override
    public double getX() {
        return X;
    }

}