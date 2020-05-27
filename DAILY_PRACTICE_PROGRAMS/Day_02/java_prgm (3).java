/******************************************************************************

    3) Design an algorithm to calculate the factorial of a number N. 
    The value of N is provided as an input by the user.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		
		while(n>0)
		{
		    fact = fact*(n);
		    n = n - 1;
		   
		}
		System.out.println("factorial = "+fact);
	}
}
