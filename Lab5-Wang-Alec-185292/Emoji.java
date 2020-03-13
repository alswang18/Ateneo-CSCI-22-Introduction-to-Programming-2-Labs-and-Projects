/**
 * This is the Emoji class.
 * The Emoji class is where the emoji is drawn.
 *
 * @author Alec Wang
 * @version March 13 2020
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


public class Emoji{
		
	private double x;
	private double y;
	private double size;
	private double scale;
	private double reduction;
	private double xTranslate;
	private double yTranslate;
	private double rotationDegrees;
	private Color lightCover;
	private Color lightAccessory;
	private Color darkCover;
	private Color darkAccessory;
	private Color cover;
	private Color accessory;
	
	public Emoji(double s, Color lc, Color la, Color dc, Color da){
		size = s;
		scale = 1;
		lightCover = lc;
		lightAccessory = la;
		darkCover = dc;
		darkAccessory = da;
		xTranslate = 320;
		yTranslate = 240;
		rotationDegrees = 0;
		cover = lc;
		accessory = la;
		
	}
	public void draw(Graphics2D g2d){
		g2d.translate(xTranslate,yTranslate);
		g2d.scale(scale,scale);
		g2d.rotate(Math.toRadians(rotationDegrees));
		Ellipse2D.Double o1 = new Ellipse2D.Double(-size/2,-size/2,size,size);
		Path2D.Double smile = new Path2D.Double();
		smile.moveTo(-70,50);
		smile.curveTo(-20,70,20,70,70,50);
		Path2D.Double hat1 = new Path2D.Double();
		hat1.moveTo(-25,-100);
		hat1.lineTo(25,-100);
		hat1.lineTo(0,-150);
		hat1.lineTo(-25,-100);
		Path2D.Double hat2 = new Path2D.Double();
		hat2.moveTo(-75,-100);
		hat2.lineTo(-25,-100);
		hat2.lineTo(-50,-150);
		hat2.lineTo(-75,-100);
		Path2D.Double hat3 = new Path2D.Double();
		hat3.moveTo(25,-100);
		hat3.lineTo(50,-150);
		hat3.lineTo(75,-100);
		hat3.lineTo(25,-100);
		Ellipse2D eyeL = new Ellipse2D.Double(-65,-40,30,30);
		Ellipse2D eyeR = new Ellipse2D.Double(35,-40,30,30);
		Rectangle2D nose = new Rectangle2D.Double(-8,5,15,15); 
		g2d.setColor(cover);
		g2d.fill(o1);
		g2d.setColor(accessory);
		g2d.fill(eyeL);
		g2d.fill(eyeR);
		g2d.fill(nose);
		g2d.fill(hat1);
		g2d.fill(hat2);
		g2d.fill(hat3);
		g2d.draw(smile);
	}
	public void verticalTranslate(double n){
		yTranslate+=n;
	}
	public void horizontalTranslate(double n){
		xTranslate+=n;
	}
	public void rotate(double n){
		rotationDegrees+=n;
	}
	public void size(double n){
		scale += n;
	}
	public void dark(){
		cover = darkCover;
		accessory = darkAccessory;
	}
	public void light(){
		cover = lightCover;
		accessory = lightAccessory;
	}
}