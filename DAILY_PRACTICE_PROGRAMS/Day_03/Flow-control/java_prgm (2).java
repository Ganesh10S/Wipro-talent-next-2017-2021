/******************************************************************************
3 Write a program to check if the program has received command line arguments or not. 
If the program has not received the values then print "No Values", else print all the 
values in a single line separated by ,(comma).

Eg1) java Example
O/P: No values

Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		if(args.length == 0)
	    	System.out.println("No values");
	    else
	    {
    		for(String st : args)
    		{
    		        
    		        System.out.print(st+",");
    		}
	    }
	}
}
