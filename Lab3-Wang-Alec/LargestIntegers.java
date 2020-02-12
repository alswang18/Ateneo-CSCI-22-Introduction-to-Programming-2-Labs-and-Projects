/**
 * Description: This is Largest Integers class. It gets an array of integers and tells which 3 are the largest.
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
public class LargestIntegers implements Operation{
	private int biggest1Pos;
	private int biggest2Pos;
	private int biggest3pos;
	
	@Override
	public void operate(Integer[] a){
    int biggest1 = 0;
	int biggest2 = 0;
	int biggest3 = 0;
	if(a.length==0){
		System.out.println("There are no integers");
	}else if(a.length==1){
		System.out.printf("The largest integer is %d.\n",a[0]);
	}else if(a.length==2){
		if(a[0]>=a[1]){
			biggest1=a[0];
			biggest2=a[1];
		}else{
			biggest1=a[1];
			biggest2=a[0]; 
		}
		System.out.printf("The largest integers are %d and %d.\n",biggest2,biggest1);
	}else if(a.length>=3){
		biggest1Pos = 0;
		biggest1 = a[0];
		for(int i = 1; i<a.length; i++){
			if(biggest1<a[i]){
				biggest1=a[i];
				biggest1Pos=i;
			}
		}
		if(biggest1Pos==0){
			biggest2=a[1];
			biggest2Pos = 1;
		}else{
			biggest2=a[0];
			biggest2Pos = 0;
		}
		for(int i = 0; i<a.length;i++){
			if(biggest1Pos == i || biggest2Pos == i){
				continue;
			}
			if(biggest2<a[i]){
				biggest2Pos = i;
				biggest2 = a[i];
			}
		}
		if(biggest1Pos==0 || biggest2Pos==0){
			if(biggest1Pos==1 || biggest2Pos==1){
			biggest3=a[2];
			biggest3pos = 2;	
			}else{
			biggest3=a[1];
			biggest3pos = 1;
			}
			
		}else if(biggest1Pos==1 || biggest2Pos==1){
			if(biggest1Pos==0 || biggest2Pos==0){
			biggest3=a[2];
			biggest3pos = 2;	
			}else{
			biggest3=a[0];
			biggest3pos = 0;
			}
		}else{
			biggest3=a[0];
			biggest3pos = 0;
		}
		for(int i = 0; i<a.length;i++){
			if(biggest1Pos == i || biggest2Pos == i || biggest3pos ==i){
				continue;
			}
			if(biggest3<a[i]){
				biggest3pos = i;
				biggest3 = a[i];
			}
		}
		System.out.printf("The largest integers are %d,%d, and %d.\n",biggest3,biggest2,biggest1);
	}
  }

  @Override
  public String getOperationName() {
    return " Largest Integers";
  }
}