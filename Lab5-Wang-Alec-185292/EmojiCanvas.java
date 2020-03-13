/**
 * This is the EmojiCanvas class. 
 * This class extends JComponent and creates a canvas to draw on. This is where the emoji and g2d objects are. 
 *
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
import javax.swing.*;
import java.awt.geom.*;

public class EmojiCanvas extends JComponent{
	private int width;
	private int height;
	public Color bColor;
	private Emoji e;
	
	public EmojiCanvas(int w, int h, Color c){
		width = w;
		height = h;
		bColor = c;
		setPreferredSize(new Dimension(width, height));
		e = new Emoji(200, Color.CYAN, Color.WHITE, Color.BLACK, Color.RED);
	}
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(rh);
		
		Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
		g2d.setColor(bColor);
		g2d.fill(background);
		e.draw(g2d);
		
	}
	public Emoji getEmoji(){
		return e;
	}
}