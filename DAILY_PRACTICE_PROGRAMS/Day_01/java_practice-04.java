/******************************************************************************

4)Write a program to accept two numbers and print whether their sum is EVEN or ODD

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = x + y;
    if (a % 2 == 0)
      {
	System.out.println ("The sum of the given numbers is Even");
      }
    else
      {
	System.out.println ("The sum of the given numbers is Odd");
      }
  }
}