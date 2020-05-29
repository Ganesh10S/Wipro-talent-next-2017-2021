/******************************************************************************

3 Write a program to initialize an integer array with values and check 
if a given number is present in the array or not. If the number is not found, 
it will print -1 else it will print the index value of thegiven number in the array

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] a = {1,2,3,4,5};
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter element to be searched");
	    int num = sc.nextInt();
	    int flag = 0;
	    for(Integer b :a)
	    {
	        if(b == num)
	            flag=1;
	        
	    }
	    if(flag == 1)
	        System.out.println("Number is present");
	    else
	            System.out.println("Number is not present");
	}
}
