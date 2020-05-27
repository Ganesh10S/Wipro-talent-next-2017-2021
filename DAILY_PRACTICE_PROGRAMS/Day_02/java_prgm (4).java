/******************************************************************************

4) Design an algorithm to accept a given string from the user. 
The algorithm must then remove characters from the string which appear more than once. 
For Example – If input string is – Malayalam
 The output must be – maly

*******************************************************************************/
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		char[] set;
		int n= st.length();
	    int l = (n/2)+1;
	    
	    ArrayList<Character> list= new ArrayList<Character>();
	    for(int i=0;i<l;i++)
	    {
	        if(!list.contains(ch[i]))
	        {
       
	            list.add(ch[i]);
	        }
	    }
	   
	    
	    for(char c : list)
	    {
	        System.out.print(c);
	    }
		
		
	}
}
