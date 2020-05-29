/******************************************************************************

7 Write a program to remove the duplicate elements in an array and print
Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89
Topics Covered: One dimensional Array

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {8,9,8,5,9,3,5,3};
	    
	    int n =arr.length;
	    int[] temp = new int[n];  
        int j = 0; 
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];      
          
        
        for(Integer b : temp)
            System.out.println(b);

		
	}
}
