/******************************************************************************

8 Write a program to print the element of an array that has occurred the highest 
number of times

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr ={10,90,10,19,90,10,19};
	    Arrays.sort(arr); 
       
        int max = 1, res = arr[0]; 
        int count = 1; 
        int n= arr.length;
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                count++; 
            else 
            { 
                if (count > max) 
                { 
                    max = count; 
                    res = arr[i - 1]; 
                } 
                count = 1; 
            } 
        } 
        if (count > max) 
        { 
            max = count; 
            res = arr[n - 1]; 
        } 
      
        
		System.out.println(res);
	}
}
