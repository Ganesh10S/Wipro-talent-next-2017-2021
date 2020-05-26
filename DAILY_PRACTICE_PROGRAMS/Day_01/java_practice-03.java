/******************************************************************************

3)Write a program to accept a number N and print whether the number is EVEN or ODD

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    if (a % 2 == 0)
      {
	System.out.println ("The given number is Even");
      }
    else
      {
	System.out.println ("The given number is Odd");
      }
  }
}
