/******************************************************************************
11 Write a program to find greatest number in a 3*3 array. The program is 
supposed to receive 9 integer numbers as command line arguments

*******************************************************************************/
public class Main
{
    
	public static void main(String[] args) {
	    
	    
	    
	    if(args.length<9)
	        System.out.println("please enter 9 ");
	    else{
	        
    	    int a=0;
    	    int[][] arr = new int[3][3];
    	    for(int i =0;i<3;i++)
    	    {
    	        for(int j = 0;j<3;j++)
    	        {
    	            arr[i][j]=Integer.parseInt(args[a]);
    	            a++;
    	        }
    	    }
    	    int max =arr[0][0];
    	    for(int i =0;i<3;i++)
    	    {
    	        for(int j = 0;j<3;j++)
    	        {
    	            if(max<arr[i][j])
    	                max =arr[i][j];
    	        }
    	    }
    	    System.out.println("Maximum is  "+max);
	    }
	  }
	  
}