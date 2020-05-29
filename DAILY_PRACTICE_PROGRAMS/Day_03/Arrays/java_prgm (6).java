/******************************************************************************


6 Write a program to initialize an array and print them in a sorted fashion
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
        for(Integer b : a)
		    System.out.println(b);
	}
}
