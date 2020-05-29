/******************************************************************************

5
Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s
a number then print "Digit" and for other characters print "Special Character"
If Statement

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    char ch = sc.next().charAt(0);
	    if(Character.isLetter(ch))
	        System.out.println("Alphabet");
	    else if(Character.isDigit(ch))
            System.out.println("Number");
        else
            System.out.println("Special Character");
	}
}
