/******************************************************************************

4 Initialize an integer array with ascii values and print the corresponding 
character values in a single row.
Topics Covered: One dimensional array

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a = {97,98,99,100,101};
	    for(int b =0;b<a.length;b++)
	    {
	    	System.out.println((char)a[b]);
	    }
	}
}
