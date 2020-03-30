import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class SceneCanvas extends JComponent {
    private Color bColor;
    private ArrayList<DrawingObject> drawings;

    public SceneCanvas(Color c) {
        bColor = c;
        setPreferredSize(new Dimension(1024, 768));
        drawings = new ArrayList<DrawingObject>();
        drawings.add(new Rectangle(112, 164, 800, 450, Color.GRAY));
        drawings.add(new Rectangle(137, 184, 750, 400, Color.WHITE));
        drawings.add(new Rectangle(0, 614, 1024, 500, new Color(80, 80, 80)));
        drawings.add(new Circle(512 - 37.5, 384 - 37.5, 75, Color.RED));
        drawings.add(new Triangle(0, 0, Color.RED));
        drawings.add(new Square(487, 630, 50, Color.BLACK));
        drawings.add(new Square(487, 690, 50, Color.BLACK));
        drawings.add(new Ri(0, 0, Color.WHITE));
        drawings.add(new Ben(0, 0, Color.WHITE));
        drawings.add(new LeftCurtain(0)); // 4
        drawings.add(new RightCurtain(0)); // 5

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 1024, 768);
        g2d.setColor(bColor);
        g2d.fill(background);
        for (int i = 0; i < drawings.size(); i++) {
            drawings.get(i).draw(g2d);
        }

    }

    public ArrayList<DrawingObject> getDrawings() {
        return drawings;
    }
}