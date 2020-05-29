/******************************************************************************

17
Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
	    int rev=0,rem;
	    while(n!=0)
	    {
	        rem = n% 10;
	        rev = rev*10 +rem;
	        n=(int)n/10;
	        
	    }
		System.out.println(rev);
	}
}
