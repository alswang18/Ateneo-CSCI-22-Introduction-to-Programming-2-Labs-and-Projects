import java.awt.*;
import java.awt.geom.*;

public class Ben implements DrawingObject {
    private int X;
    private int Y;
    private Color color;

    public Ben(int x, int y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Square s1 = new Square(487, 690, 50, Color.GREEN);
        s1.draw(g2d);
        Line l1 = new Line(512 + X, 697 + Y, 512 + X, 732 + Y, 3, color);
        l1.draw(g2d);
        Line l2 = new Line(492 + X, 710 + Y, 532 + X, 710 + Y, 3, color);
        l2.draw(g2d);
        Line l3 = new Line(507 + X, 728 + Y, 517 + X, 728 + Y, 3, color);
        l3.draw(g2d);
        Line l4 = new Line(512 + X, 715 + Y, 530 + X, 728 + Y, 3, color);
        l4.draw(g2d);
        Line l5 = new Line(494 + X, 728 + Y, 512 + X, 715 + Y, 3, color);
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