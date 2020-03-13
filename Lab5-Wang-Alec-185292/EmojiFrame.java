/**
 * This is the EmojiFrame class.This sets up the GUI and makes it interactive.
 * This is where the JFrame and buttons are. This is also where the action events are set-up.
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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmojiFrame{
	private JFrame frame;
	private EmojiCanvas canvas;
	private JButton upButton;
	private	JButton downButton;
	private	JButton leftButton;
	private	JButton rightButton;
	private	JButton growButton;
	private	JButton shrinkButton;
	private	JButton ccwButton;
	private	JButton cwButton;	
	private	JButton lightButton;
	private	JButton darkButton;
	private JPanel panel;
	
	public EmojiFrame(){
		frame = new JFrame();
		canvas = new EmojiCanvas(640,480, Color.LIGHT_GRAY);
		upButton = new JButton("UP");
		downButton = new JButton("DOWN");
		leftButton = new JButton("LEFT");
		rightButton = new JButton("RIGHT");
		growButton = new JButton("GROW");
		shrinkButton = new JButton("SHRINK");
		ccwButton = new JButton("CCW");
		cwButton = new JButton("CW");
		lightButton = new JButton("LIGHT");
		darkButton = new JButton("DARK");
		panel = new JPanel();
	}
	public void setUpGUI(){
		Container cp = frame.getContentPane();
		frame.setTitle("Emoji Animation - Wang,Alec - 185292");
		cp.add(canvas, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3,4));
		panel.add(upButton);
		panel.add(downButton);
		panel.add(leftButton);
		panel.add(rightButton);
		panel.add(growButton);
		panel.add(shrinkButton);
		panel.add(ccwButton);
		panel.add(cwButton);
		panel.add(lightButton);
		panel.add(new JLabel());
		panel.add(new JLabel());
		panel.add(darkButton);
		cp.add(panel, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public void setUpButtonListener(){
		ActionListener bl = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Object o = e.getSource();
				if(o == upButton){
					canvas.getEmoji().verticalTranslate(-10);
					canvas.repaint();
				}else if(o == downButton){
					canvas.getEmoji().verticalTranslate(10);
					canvas.repaint();
				}else if(o == leftButton){
					canvas.getEmoji().horizontalTranslate(-10);
					canvas.repaint();
				}else if(o == rightButton){
					canvas.getEmoji().horizontalTranslate(10);
					canvas.repaint();
				}else if(o == growButton){
					canvas.getEmoji().size(0.02);
					canvas.repaint();
				}else if(o == shrinkButton){
					canvas.getEmoji().size(-0.02);
					canvas.repaint();
				}else if(o == ccwButton){
					canvas.getEmoji().rotate(-10);
					canvas.repaint();
				}else if(o == cwButton){
					canvas.getEmoji().rotate(10);
					canvas.repaint();
				}else if(o == lightButton){
					canvas.bColor = Color.LIGHT_GRAY;
					canvas.getEmoji().light();
					canvas.repaint();
				}else if(o == darkButton){
					canvas.bColor = new Color(128,0,32);
					canvas.getEmoji().dark();
					canvas.repaint();
				}
			}
		};
		upButton.addActionListener(bl);
		downButton.addActionListener(bl);
		leftButton.addActionListener(bl);
		rightButton.addActionListener(bl);
		growButton.addActionListener(bl);
		shrinkButton.addActionListener(bl);
		ccwButton.addActionListener(bl);
		cwButton.addActionListener(bl);
		lightButton.addActionListener(bl);
		darkButton.addActionListener(bl);
	}
	
}