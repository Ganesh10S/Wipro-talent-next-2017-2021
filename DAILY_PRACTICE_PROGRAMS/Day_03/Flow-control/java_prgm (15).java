/******************************************************************************

15
Write a program to add all the values in a given number and print. Ex: 1234->10
Topics Covered: For Loop


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n = Integer.parseInt(args[0]);
	    int sum=0;
	    for(int i=0 ;n>0;i++)
	    {
	        sum = sum +(n%10);
	        n=(int)n/10;
	        
	    }
	        
		System.out.println(sum);
	}
}
