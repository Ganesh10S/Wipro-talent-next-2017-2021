/******************************************************************************


16 Write a program to print * in Floyds format (using for and while loop)
*
* *
* * *

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n =Integer.parseInt(args[0]);
	    int j=1;
	    while(j<=n)
	    {
	        
    	    for(int i=1;i<=j;i++)
    	    {
		        System.out.print("* ");
    	    }
    	    System.out.println("");
    	    j=j+1;
	    }
	}
}
