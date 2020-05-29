/******************************************************************************

2
Write a Program to accept a String as a Command line argument and the program should print a
Welcome message.
Example :
C:\> java Sample John

O/P Expected : Welcome John 

*******************************************************************************/
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
	   for(String s :args)
		    System.out.println("Welcome "+s);
	}
}
