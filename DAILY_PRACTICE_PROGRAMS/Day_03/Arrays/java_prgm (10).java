/******************************************************************************


10 Write a program to reverse the elements of a given 2*2 array. 
Four integer numbers needs to be passed as Command Line arguments.
Example1:
C:\>java Sample 1 2 3
O/P Expected : Please enter 4 integer numbers
Example2:
C:\>java Sample 1 2 3 4
O/P Expected :
The given array is :
1 2
3 4
The reverse of the array is :
4 3
2 1

*******************************************************************************/
public class Main
{
    
	public static void main(String[] args) {
	    
	    
	    
	    if(args.length<4)
	        System.out.println("please enter 4 ");
	    else{
    	    int a=0;
    	    int[][] arr = new int[2][2];
    	    for(int i =0;i<2;i++)
    	    {
    	        for(int j = 0;j<2;j++)
    	        {
    	            arr[i][j]=Integer.parseInt(args[a]);
    	            a++;
    	        }
    	    }
    	    System.out.println("Givern array");
    	    for(int i =0;i<2;i++)
    	    {
    	        for(int j = 0;j<2;j++)
    	        {
    	            System.out.print(arr[i][j]+" ");
    	        }
    	        System.out.println("");
    	    }
    	    System.out.println("reversed array");
    	    for(int i =0;i<2;i++)
    	    {
    	        for(int j = 0;j<2;j++)
    	        {
    	            System.out.print(arr[1-i][1-j]+" ");
    	        }
    	        System.out.println("");
    	    }
    	    
	    }
		
	}
}
