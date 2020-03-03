
/**
 * This is the drawing component that compiles and instatiates all the drawings. 
 * All drawings are in the paintComponent. It is anti aliased.
 *
 * @author Alec Wang
 * @version March 3 2020
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
import java.awt.geom.*;
import javax.swing.*;

public class DrawingComponent extends JComponent{
	private int width;
	private int height;
	
	public DrawingComponent(int w, int h){
		width = w;
		height = h;
	}
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
		g2d.setColor(new Color(142, 191, 237));
		g2d.fill(r);
		
		House house1 = new House(200, 50, 350, Color.RED, new Color(142, 191, 237));
		house1.draw(g2d);
		
		House house2 = new House(200, 600, 350, Color.RED, new Color(142, 191, 237));
		house2.draw(g2d);
		
		Cloud cloud1 = new Cloud(100, 200, 100, Color.WHITE);
		cloud1.draw(g2d);
		
		Cloud cloud2 = new Cloud(100, 400, 50, Color.WHITE);
		cloud2.draw(g2d);
		
		Sun sun1 = new Sun(300, 600, -150, Color.YELLOW);
		sun1.draw(g2d);
		
		Tree tree1 = new Tree(100, 200, 400, Color.GREEN, new Color(110, 54, 4));
		tree1.draw(g2d);
		
		Tree tree2 = new Tree(100, 500, 400, Color.GREEN, new Color(110, 54, 4));
		tree2.draw(g2d);
		
		Car car1 = new Car(100, 350, 450, Color.BLUE, new Color(0, 0, 0),Color.WHITE);
		car1.draw(g2d);
		
		Car car2 = new Car(100, 650, 450, Color.BLUE, new Color(0, 0, 0),Color.WHITE);
		car2.draw(g2d);
		
		Cow cow1 = new Cow(100, 100, 220, new Color(255,248,220),new Color(0, 0, 0));
		cow1.draw(g2d);
		
		Cow cow2 = new Cow(100, 600, 220, new Color(255,248,220),new Color(0, 0, 0));
		cow2.draw(g2d);
		
	}
	
}