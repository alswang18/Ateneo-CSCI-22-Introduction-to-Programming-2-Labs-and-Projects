import java.awt.Graphics2D;

public interface DrawingObject {
    void draw(Graphics2D g2d);

    void adjustX(double distance);

    double getX();

}