/**
 * Description: This is Uniqueness class. It tells whether an array passed into it has unique integers or not.
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
public class Uniqueness implements Operation{
  @Override
  public void operate(Integer[] a){
	boolean empty = false;
	if(a.length == 0){
		System.out.println("There are no elements");
		empty = true;
	}
    boolean uniqueness = true;

    for(int i = 0; i < a.length; i++){
      for(int j=i+1; j <a.length; j++){
		  if(a[i]==a[j]){
			  uniqueness = false;
			}
		} 
	}
	if(uniqueness&&(!empty)){
		System.out.println("ALL the elements are unique.");
	}else if((!uniqueness)&&(!empty)){
		System.out.println("NOT all the elements are unique.");
	}
  }

  @Override
  public String getOperationName() {
    return " Uniqueness";
  }
}