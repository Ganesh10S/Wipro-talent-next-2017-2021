/******************************************************************************

8 Write a program to print the color name, based on color code. 
If color code in not valid then print"Invalid Code".
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

*******************************************************************************/
import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter code");
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		switch(ch)
		{
		    case "R":
		        System.out.println("RED");
		        break;
		    case "B":
		        System.out.println("Blue");
		        break;
		    case "G":
		        System.out.println("GREEN");
		        break;
		    case "Y":
		        System.out.println("YELLOW");
		        break;
		    case "W":
		        System.out.println("WHITE");
		        break;
		    case "O":
		        System.out.println("ORANGE");
		        break;
		    default:
		        System.out.println("Invalid Code");
		        break;
		    
		    
		    
		}
	}
}
