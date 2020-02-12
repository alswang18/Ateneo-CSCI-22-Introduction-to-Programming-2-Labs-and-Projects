/**
 * Description: This is the GreatestSum class. gets the largest of 3 consecutive sums. In addition there is also a function that returns the class name as a String.
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
public class GreatestSum implements Operation{
  @Override
  public void operate(Integer[] a) {
	  int biggestSum;
	  if(a.length==0){
			System.out.println("The greatest sum is 0.");
	  }else if(a.length==1){
			biggestSum = a[0];
			System.out.printf("The greatest sum is %d\n.",biggestSum);
	  }else if(a.length==2){
			biggestSum = a[0]+a[1];
			System.out.printf("The greatest sum is %d\n.",biggestSum);
	  }else if(a.length>=3){
			biggestSum = a[0]+a[1]+a[2];
			for(int i = 0; i<a.length-2; i++){
			  if(biggestSum<a[i]+a[i+1]+a[i+2]){
				  biggestSum = a[i]+a[i+1]+a[i+2];
				}
			}
			System.out.printf("The greatest sum is %d\n.",biggestSum);  
		}

	}

  @Override
  public String getOperationName() {
    return " Greatest Sum";
  }

}