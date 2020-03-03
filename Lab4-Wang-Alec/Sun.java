/**
 * This is the Sun class that contains the drawing of the Sun.
 * The Sun takes in 1 color and is made up of 1 element.
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

public class Sun{
	private int size;
	private int x;
	private int y; 
	private Color c1; 
	
	public Sun(int s, int xAxis, int yAxis, Color color_1){
		size = s;
		x = xAxis;
		y = yAxis;
		c1 = color_1;
	}
	public void draw(Graphics2D g2d){
		Ellipse2D.Double o1 = new Ellipse2D.Double(x,y,size,size);
		g2d.setColor(c1);
		g2d.fill(o1);
		
	}
}