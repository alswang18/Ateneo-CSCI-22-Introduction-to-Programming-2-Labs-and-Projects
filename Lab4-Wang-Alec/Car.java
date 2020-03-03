/**
 * This is the Car class that contains the drawing of the Car.
 * The Car takes in 3 colors and is made up of 8 different elements.
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

public class Car{
	private int size;
	private int x;
	private int y; 
	private Color c1; 
	private Color c2;
	private Color c3;
	
	public Car(int s, int xAxis, int yAxis, Color color_1, Color color_2, Color color_3){
		size = s;
		x = xAxis;
		y = yAxis;
		c1 = color_1;
		c2 = color_2;
		c3 = color_3;
	}
	public void draw(Graphics2D g2d){
		Rectangle2D.Double o1 = new Rectangle2D.Double(x,y,size*1.8,size);
		Ellipse2D.Double o2 = new Ellipse2D.Double(x+30,y-40,size,size*1.2);
		Ellipse2D.Double o3 = new Ellipse2D.Double(x+100,y+60,size/2,size/2);
		Ellipse2D.Double o4 = new Ellipse2D.Double(x+10,y+60,size/2,size/2);
		Rectangle2D.Double o5 = new Rectangle2D.Double(x+30,y+50,size/10,size/10);
		Rectangle2D.Double o6 = new Rectangle2D.Double(x+55,y+50,size/10,size/10);
		Rectangle2D.Double o7 = new Rectangle2D.Double(x+30,y+25,size/10,size/10);
		Rectangle2D.Double o8 = new Rectangle2D.Double(x+55,y+25,size/10,size/10);
		g2d.setColor(c3);
		g2d.fill(o2);	
		g2d.setColor(c2);		
		g2d.fill(o3);
		g2d.fill(o4);	
		g2d.setColor(c3);
		g2d.fill(o5);
		g2d.fill(o6);
		g2d.fill(o7);
		g2d.fill(o8);
		g2d.setColor(c1);
		g2d.fill(o1);
	}
}