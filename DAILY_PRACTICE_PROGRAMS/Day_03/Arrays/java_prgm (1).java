/******************************************************************************

1
Write a program to initialize an integer array and print the sum and average of the array.
Topics Covered: One dimensional Array


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {1,2,3,4,5};
	    int sum =0;
	    
	    for(Integer b :a)
	        sum = sum + b;
	    int avg = sum/(a.length);
		System.out.println("sum ="+sum+"\nAverage = "+avg);
	}
}
