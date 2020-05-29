/******************************************************************************

1) Write a Program that accepts two Strings as command line arguments and generate the output 
in a specific way as given below.
Example:
If the two command line arguments are Wipro and Bangalore then the output generated should
be Wipro Technologies Bangalore.

If the command line arguments are ABC and Mumbai then the output generated should be ABC
Technologies Mumbai 


*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	   for (String val:args) 
	    {
	        if(val.equals("and"))
	            System.out.print("Technologies"+" ");
	       
	        
	        else
	            System.out.print(val+" ");
	    }
	    
	
	}
}
