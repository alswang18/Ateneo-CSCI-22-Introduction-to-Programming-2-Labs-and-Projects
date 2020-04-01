import java.awt.*;
import java.awt.geom.*;

public class Sharingan implements DrawingObject {
    private double X;
    private double Y;
    private int degrees;
    private Color color;

    public Sharingan(double x, double y, Color color) {
        this.X = x;
        this.Y = y;
        this.color = color;
        degrees = 45;

    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(400, 270, 230, 230));
        g2d.rotate(Math.toRadians(degrees), 512, 384);
        g2d.fill(new Ellipse2D.Double(X, Y, 30, 30));
        Path2D p = new Path2D.Double();
        p.moveTo(629, 392);
        p.lineTo(599, 422);
        p.lineTo(649, 392);
        p.lineTo(629, 392);
        g2d.fill(p);
        g2d.rotate(Math.toRadians(-degrees), 512, 384);
        g2d.rotate(Math.toRadians(degrees + 120), 512, 384);
        g2d.fill(new Ellipse2D.Double(X, Y, 30, 30));
        Path2D p1 = new Path2D.Double();
        p1.moveTo(629, 392);
        p1.lineTo(599, 422);
        p1.lineTo(649, 392);
        p1.lineTo(629, 392);
        g2d.fill(p1);
        g2d.rotate(Math.toRadians(-degrees + -120), 512, 384);
        g2d.rotate(Math.toRadians(degrees + 240), 512, 384);
        g2d.fill(new Ellipse2D.Double(X, Y, 30, 30));
        Path2D p2 = new Path2D.Double();
        p2.moveTo(629, 392);
        p2.lineTo(599, 422);
        p2.lineTo(649, 392);
        p2.lineTo(629, 392);
        g2d.fill(p2);
        g2d.rotate(Math.toRadians(-degrees + -240), 512, 384);
        g2d.setStroke(new BasicStroke(1));

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