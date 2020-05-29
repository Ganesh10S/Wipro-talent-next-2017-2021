/******************************************************************************

14 Write a Java program to find if the given number is prime or not.
Example1:
C:\>java Sample
O/P Expected : Please enter an integer number
Example2:
C:\>java Sample 1
O/P Expected : 1 is neither prime nor composite
Example3:
C:\>java Sample 0
O/P Expected : 0 is neither prime nor composite
Example4:
C:\>java Sample 10
O/P Expected : 10 is not a prime number
Example5:
C:\>java Sample 7
O/P Expected : 7 is a prime number

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n = Integer.parseInt(args[0]);
		int flag=1;
	    for(int i=2;i<n;i++)
	    {
	        if(n % i == 0)
	            flag=0;
  
	    }
	    if(flag==0)
	        System.out.println("Not a prime number");
	    else
		        System.out.println("prime number");
	}
}
