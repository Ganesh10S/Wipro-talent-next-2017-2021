/******************************************************************************
    1)Write a Java Program to accept 25 integer elements for an array 
    then find the maximum number in the set and display it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
		   a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=1;i<n;i++)
		{
		    if(a[i]>max)
		    {
		        max = a[i];
		    }
		}
		System.out.println(max);
	}
}
