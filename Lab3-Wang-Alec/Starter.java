/**
 * Description: This is the Starter class. It creates an instance of MenuGen, Uniqueness, LargestIntegers, and GreatestSum and executes them in a main method where they can cooperate.
 * 
 *
 * @author Alec Wang
 * @version Feb 11 2020
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
public class Starter{
	private static MenuGen mengen;

	public static void main(String[] args){
		Operation arr[] = new Operation[3];
		arr[0] = new Uniqueness();
		arr[1] = new LargestIntegers();
		arr[2] = new GreatestSum();
		mengen = new MenuGen(arr);
		mengen.run();
	}
}