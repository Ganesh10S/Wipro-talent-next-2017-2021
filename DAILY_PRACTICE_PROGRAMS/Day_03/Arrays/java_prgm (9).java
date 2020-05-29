/******************************************************************************

9 Write a program to print the sum of the elements of the array with the given 
below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 
and the numbers between them for the calculation of sum.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] n = {1,6,9,8,7,4,3,2};
        int sum = 0;
        outer:
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 6) {
                for (int j = i + 1; j < n.length; j++) {
                    if (n[j] == 7) {
                        i = j;
                        continue outer;
                    }
                }
            }
            sum += n[i];
        }
        
        System.out.println(sum);
        	        
        	    
        		
	}
	
}
