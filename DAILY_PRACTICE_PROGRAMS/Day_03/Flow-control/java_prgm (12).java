/******************************************************************************

12 Write a program to check if a given number is prime or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
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

