/******************************************************************************

7)Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i=0;
		while(i<=100)
		{
		    System.out.print(i+" ");
		    i=i+2;
		}
	}
}