/******************************************************************************

3
Write a Program to accept two integers through the command line argument and 
print the sum of the two numbers
Example:
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30 


*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
	    int num1 = Integer.parseInt(args[0]);
	    int num2 = Integer.parseInt(args[1]);
		System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
	}
}
