/**
 * Description (in your own words) of the class goes here. 
 * This is the SceneCanvas class where all the visual elements are instantiated and put into an ArrayList to be managed by a for Loop whenever the repaint method is called by the SceneFrame.
 *
 * @author Alec Wang
 * @version Aoril 1 2020
 */

/*
I have not discussed the Java language code 
in my program with anyone other than my instructor 
or the teaching assistants assigned to this course.

I have not used Java language code obtained 
from another student, or any other unauthorized 
source, either modified or unmodified.

If any Java language code or documentation 
used in my program was obtained from another source, 
such as a text book or webpage, those have been 
clearly noted with a proper citation in the comments 
of my code.
*/
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
        drawings.add(new NinjaStar(-120, -480, Color.WHITE)); // 5
        drawings.add(new NinjaStar(-530, -480, Color.WHITE)); // 6
        drawings.add(new NinjaStar(-120, -320, Color.WHITE)); // 7
        drawings.add(new NinjaStar(-530, -320, Color.WHITE)); // 8
        drawings.add(new NinjaStar(-530, -180, Color.WHITE)); // 9
        drawings.add(new NinjaStar(-120, -180, Color.WHITE)); // 10
        drawings.add(new Sharingan(620, 370, Color.WHITE));
        drawings.add(new Uchiha(0, 0, Color.RED));
        drawings.add(new Uchiha(-300, 0, Color.RED));
        drawings.add(new Uchiha(300, 0, Color.RED));
        drawings.add(new Line(112, 600, 912, 600, 6, Color.WHITE));
        drawings.add(new San(0, Color.WHITE));
        drawings.add(new Ge(0, Color.WHITE));
        drawings.add(new Circle(790, 664, 20, Color.LIGHT_GRAY));
        drawings.add(new Circle(815, 644, 20, Color.LIGHT_GRAY));
        drawings.add(new Circle(840, 664, 20, Color.LIGHT_GRAY));
        drawings.add(new Ri(0, 0, Color.WHITE));
        drawings.add(new Ben(0, 0, Color.WHITE));
        drawings.add(new LeftCurtain(0));
        drawings.add(new RightCurtain(0));

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