/******************************************************************************

9) Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers 
i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i=100;
		while(i>=0)
		{
		    System.out.print(i+" ");
		    i=i-3;
		}
	}
}