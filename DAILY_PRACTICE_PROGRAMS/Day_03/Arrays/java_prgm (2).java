/******************************************************************************

2 Write a program to initialize an integer array and find the maximum and minimum 
value of an array.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {1,2,3,4,5};
	    int min = a[0];
	    int max = a[0];
	    
	    for(Integer b :a)
	    {
	        if(max<b)
	            max = b;
	        if(min>b)
	            min =b;
	    }
	        
	    
		System.out.println("Maximum ="+max+"\nMinimum = "+min);
	}
}
