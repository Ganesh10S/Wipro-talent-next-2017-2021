/******************************************************************************

1 Write a program to check if a given number is Positive, Negative, or Zero.


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);;
		if(num == 0)
		    System.out.println("Zero");
		else if(num > 0)
		    System.out.println("Positive");
		else
		    System.out.println("Negative");
		
		    
	}
}
