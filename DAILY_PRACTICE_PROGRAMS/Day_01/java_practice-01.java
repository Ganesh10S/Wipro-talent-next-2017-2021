/******************************************************************************


1)Write a program to accept a number N and print whether it is positive, negative or zero


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==0)
		{
		    System.out.println("Zero");
		}
		else if(number>0)
		{
		    System.out.println("Positive");
		}
		else
		{
		    System.out.println("Negative");
		}
	}
}