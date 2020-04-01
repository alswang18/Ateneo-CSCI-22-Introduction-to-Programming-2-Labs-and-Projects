import java.awt.*;
import java.awt.geom.Line2D;

public class Line implements DrawingObject {
    private double xStart;
    private double yStart;
    private double xEnd;
    private double yEnd;
    private int thickness;
    private Color color;

    public Line(double xStart, double yStart, double xEnd, double yEnd, int thickness, Color color) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(new Line2D.Double(xStart, yStart, xEnd, yEnd));
    }

    @Override
    public void adjustX(double distance) {
        xStart += distance;
        xEnd += distance;
    }

    @Override
    public double getX() {
        return xStart;
    }
}