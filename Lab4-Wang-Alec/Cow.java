/**
 * This is the Sun class that contains the drawing of the Sun.
 * The Sun takes in 2 color and is made up of 7 different elements.
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

public class Cow{
	private int size;
	private int x;
	private int y; 
	private Color c1; 
	private Color c2;
	
	public Cow(int s, int xAxis, int yAxis, Color color_1,Color color_2){
		size = s;
		x = xAxis;
		y = yAxis;
		c1 = color_1;
		c2 = color_2;
	}
	public void draw(Graphics2D g2d){
		Rectangle2D.Double o1 = new Rectangle2D.Double(x,y,size+30,size);
		Rectangle2D.Double o2 = new Rectangle2D.Double(x,y+30,size/3,size);
		Rectangle2D.Double o3 = new Rectangle2D.Double(x+97,y+30,size/3,size);
		Rectangle2D.Double o4 = new Rectangle2D.Double(x-30,y-20,size/2,size/1.5);
		Ellipse2D.Double o5 = new Ellipse2D.Double(x+70,y+45,size/4,size/4);
		Ellipse2D.Double o6 = new Ellipse2D.Double(x+90,y+65,size/4,size/4);
		Ellipse2D.Double o7 = new Ellipse2D.Double(x+30,y+25,size/4,size/4);
		g2d.setColor(c1);
		g2d.fill(o1);
		g2d.fill(o2);
		g2d.fill(o3);
		g2d.fill(o4);
		g2d.setColor(c2);
		g2d.fill(o5);
		g2d.fill(o6);
		g2d.fill(o7);
		
	}
}