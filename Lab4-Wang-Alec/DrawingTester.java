/**
 * Main class for the entire drawing. 
 * Creates JFrame that add DrawingComponent onto it.
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

import javax.swing.*;

public class DrawingTester{
	public static void main(String[] args){
		int w = 800;
		int h = 600;
		JFrame f = new JFrame();
		DrawingComponent dc = new DrawingComponent(w,h);
		f.setSize(w,h);
		f.setTitle("Wang,Alec-185292-Java Drawing");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(dc);
		f.setVisible(true);
	}
}