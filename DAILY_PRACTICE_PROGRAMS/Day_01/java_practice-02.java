/******************************************************************************

2)Write a program to accept two numbers and print the greater value of the two

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
		    System.out.println("Greatest of the two value is "+a);
		}
		else
		{
		    System.out.println("Greatest of the two value is "+b);
		}
	}
}
