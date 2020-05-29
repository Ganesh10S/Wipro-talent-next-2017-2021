/******************************************************************************

18
Write a Java program to find if the given number is palindrome or not
Example1:
C:\>java Sample 110011
O/P Expected : 110011 is a palindrome

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n = Integer.parseInt(args[0]);
	    int a =n;
	    int rev=0,rem;
	    while(a!=0)
	    {
	        rem = a% 10;
	        rev = rev*10 +rem;
	        a=(int)a/10;
	        
	    }
	    
	    if(rev==n)
		    System.out.println(n+" is  a Palindrome");
		else
            System.out.println(n+" is  not Palindrome");
	}
}
