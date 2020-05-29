/******************************************************************************
20 Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After
performing the operation, the program should ask the user if he wants to continue. If the user
presses y or Y, then the program should continue displaying the menu else the program should
terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
Topics Covered: Do While
*******************************************************************************/
import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
	    char ch;
	    Scanner sc = new Scanner(System.in);
	    do
	    {
	        System.out.println("choose a option");
	        System.out.println("1.ADD");
	        System.out.println("2.SUB");
	        int c = sc.nextInt();
	        int a =sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("enter 3 values");
	        if(c==1)
	           System.out.println("Sum = "+(a+b));
	        else if(c==2)
	            System.out.println("Difference = "+(a-b));
	        
	        
	        System.out.println("do you want to continue\n");
	        
	        ch = sc.next().charAt(0);
	   }while(ch == 'y' || ch =='Y');
	}
}
