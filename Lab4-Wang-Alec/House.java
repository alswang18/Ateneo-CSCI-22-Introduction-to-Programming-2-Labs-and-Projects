/**
 * This is the House class that contains the drawing of the House.
 * The House takes in 2 colors and is made up of 6 different elements.
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

public class House{
	private int size;
	private int x;
	private int y; 
	private Color c1; 
	private Color c2;
	
	public House(int s, int xAxis, int yAxis, Color color_1,Color color_2){
		size = s;
		x = xAxis;
		y = yAxis;
		c1 = color_1;
		c2 = color_2;
	}
	public void draw(Graphics2D g2d){
		Rectangle2D.Double o1 = new Rectangle2D.Double(x,y,size,size);
		Rectangle2D.Double o2 = new Rectangle2D.Double(x+30,y+50,size/10,size/10);
		Rectangle2D.Double o3 = new Rectangle2D.Double(x+55,y+50,size/10,size/10);
		Rectangle2D.Double o4 = new Rectangle2D.Double(x+30,y+25,size/10,size/10);
		Rectangle2D.Double o5 = new Rectangle2D.Double(x+55,y+25,size/10,size/10);
		Rectangle2D.Double o6 = new Rectangle2D.Double(x+110,y+100,size/4,size/2);
		g2d.setColor(c1);
		g2d.fill(o1);
		g2d.setColor(c2);
		g2d.fill(o2);
		g2d.fill(o3);
		g2d.fill(o4);
		g2d.fill(o5);
		g2d.fill(o6);		
		
	}
}