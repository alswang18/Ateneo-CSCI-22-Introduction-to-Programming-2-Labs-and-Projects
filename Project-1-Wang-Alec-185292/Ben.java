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
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(color);
        g2d.draw(new Line2D.Double(512 + X, 697 + Y, 512 + X, 732 + Y));
        g2d.draw(new Line2D.Double(492 + X, 710 + Y, 532 + X, 710 + Y));
        g2d.draw(new Line2D.Double(507 + X, 728 + Y, 517 + X, 728 + Y));
        g2d.draw(new Line2D.Double(512 + X, 715 + Y, 530 + X, 728 + Y));
        g2d.draw(new Line2D.Double(494 + X, 728 + Y, 512 + X, 715 + Y));
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