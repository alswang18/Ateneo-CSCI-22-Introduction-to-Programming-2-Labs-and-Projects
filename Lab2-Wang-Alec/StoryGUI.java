/**
 * Story is the class that initiates the GUI and set its pieces. The following functions build out the pieces that make it interactive and usable for the game. Press clear to reset text fields and press create to make your story.
 *
 *
 * @author Alec Wang
 * @version Jan 30 2020
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
import java.util.*;
import java.awt.event.*;

public class StoryGUI
{
	private JFrame frame;
	private String[] wordBag;
	private String username;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JTextField textFields0;
	private JTextField textFields1;
	private JTextField textFields2;
	private JTextField textFields3;
	private JTextField textFields4;
	private JTextField textFields5;
	private JTextField textFields6;
	private JTextField textFields7;
	private JButton clear;
	private JButton create;
	private JTextArea textArea;
	private JPanel s;
	private JPanel w;
	private JPanel c;
	private Container cp;

	public StoryGUI()
	{

		textArea = new JTextArea();
		frame = new JFrame();
		label0 = new JLabel("What is your name?");
		label1 = new JLabel("What is your favorite food?");
		label2 = new JLabel("What is your hobby");
		label3 = new JLabel("What color are you wearing?");
		label4 = new JLabel("What color are your shoes?");
		label5 = new JLabel("Do you like bread?");
		label6 = new JLabel("What is your mom's maiden name?");
		textFields0 = new JTextField();
		textFields1 = new JTextField();
		textFields2 = new JTextField();
		textFields3 = new JTextField();
		textFields4 = new JTextField();
		textFields5 = new JTextField();
		textFields6 = new JTextField();
		wordBag = new String[6];
		clear = new JButton("Clear All");
		create = new JButton("Create Story");

	}
	public void setupGUI()
	{
		w = new JPanel();
		s = new JPanel();
		cp = frame.getContentPane();
		w.setLayout(new GridLayout(14,1));
		s.setLayout(new GridLayout(1,2));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		frame.setSize(800, 600);
		frame.setTitle("Mad Lib Java - 185292 - Wang, Alec");
		cp.setLayout(new BorderLayout());
		cp.add(w, BorderLayout.WEST);
		cp.add(s, BorderLayout.SOUTH);
		cp.add(textArea, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		w.add(label0);
		w.add(textFields0); w.add(label1); w.add(textFields1);
		w.add(label2); w.add(textFields2); w.add(label3);
		w.add(textFields3);	w.add(label4); w.add(textFields4);
		w.add(label5); w.add(textFields5); w.add(label6);
		w.add(textFields6);

		s.add(clear);
		s.add(create);

	}
	public void setUpButtonListeners()
	{
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae){
				Object o = ae.getSource();

				if(o == clear) {
					textFields0.setText("");
					textFields1.setText("");
					textFields2.setText("");
					textFields3.setText("");
					textFields4.setText("");
					textFields5.setText("");
					textFields6.setText("");
					textArea.setText("");
				}else if(o == create){
					username = textFields0.getText();
					wordBag[0] = textFields1.getText();
					wordBag[1] = textFields2.getText();
					wordBag[2] = textFields3.getText();
					wordBag[3] = textFields4.getText();
					wordBag[4] = textFields5.getText();
					wordBag[5] = textFields6.getText();
					CreateAndShowStory();
				}
			}
		};
		clear.addActionListener(buttonListener);
		create.addActionListener(buttonListener);
	}
	public void CreateAndShowStory()
	{
		String text0 = String.format("The Toronto Professor\nBy %s\n\nJordan Peterson is a very interesting fellow.Many %s of course are opposed to %s.", username,wordBag[0], wordBag[1]);
		String text1 = "But this is okay, too, since the human body is just a shell, that it has nothing to do with the conscious mind, that we cannot kill our minds anymore, even if we'd like to.";
		String text2 = String.format("Actions are all really just a reflection of the %s around us.", wordBag[2]);
		String text4 = String.format("On the other hand %s's comment on the matter is less than 24 hours after USA Today reported on Peterson's supporters --the %s owner calls on the %s apologize for using terms similar to those used by Peterson, saying his remarks will cause serious damage to his team's brand, according to a report on Page Six. The report quotes Peterson's attorney, Rusty Hardin, saying: \"she has to apologize for saying those things, but he thinks she should apologize for using those words.\"", wordBag[3], wordBag[4], wordBag[5]);
		String text5 = String.format("Might be playing with fire when it decides what those rights are. The situation in the U.S. is very different from Canada.Because of our fact-based inquiry, our statutory framework, we must base our decisions on sound reason and the facts of the case. When dealing with damn, our judicial system is able to make it great.\n");
		String text6 = String.format("\nThe end.\n");
		String textFinal = text0 + text1 + text2 + text4 + text5 +text6;
		textArea.setText(textFinal);
	}

}
