/******************************************************************************

5 Write a program to find the largest 2 numbers and the smallest 2 numbers in 
the given array
Topics Covered: One dimensional Array

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {8,9,87,5,1,3};
	    int temp;
	    int n =a.length;
	    for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
	    
		System.out.println("largest  2 no's "+a[n-1]+" "+a[n-2]);
		System.out.println("Smallest  2 no's "+a[0]+" "+a[1]);
	}
}
