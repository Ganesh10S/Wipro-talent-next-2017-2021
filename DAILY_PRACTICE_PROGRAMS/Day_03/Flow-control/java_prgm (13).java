/******************************************************************************

13 Write a program to print prime numbers between 10 and 99.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    for(int j=10;j<99;j++)
	    {
	        int flag =1;
    	    for(int i=2;i<j;i++)
    	    {
    	        if(j % i == 0)
    	           flag++;
    	           
    	        
    	    }
    	    if(flag == 1) 
    	        {
    	            System.out.println(j);
    	            
    	        }
    	    
	    }
	}
}
https://www.onlinegdb.com/#tab-stdin