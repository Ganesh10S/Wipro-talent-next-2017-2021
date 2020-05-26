/******************************************************************************

8) Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i=100;
		while(i>=0)
		{
		    System.out.print(i+" ");
		    i=i-1;
		}
	}
}