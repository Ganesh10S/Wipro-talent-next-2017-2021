/******************************************************************************
2) Design an algorithm to accept 10 integer elements for an array and 
then find the number of times the number with the maximum value occurs in the array. 
For Example – If input elements are: 1, 2, 5, 6, 8, 9, 9, 3, 4, and 2 Output must be 2 


*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int flag = 0;
      System.out.println ("enter size of array");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
      System.out.println ("enter array elements");
    for (int i = 0; i < n; i++)
      {
	a[i] = sc.nextInt();
      }
    int max = a[0];
    for (int i = 1; i < n; i++)
      {
	if (a[i] > max)
	  {
	    max = a[i];
	  }

      }
    for (int i = 0; i < n; i++)
      {
	if (max == a[i])
	  {
	    flag = flag + 1;
	  }
      }
    System.out.println(flag+"times");
  }
}
