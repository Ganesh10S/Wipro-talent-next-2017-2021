/******************************************************************************
7 Write a program to convert from upper case to lower case and vice versa of 
an alphabet and print the old character and new character as shown in 
example (Ex: a->A, M->m).
		    
*******************************************************************************/
import java.lang.String;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Word");
		Scanner sc = new Scanner(System.in);
		String st =sc.next();
		char[] ch = st.toCharArray();
		for(int i=0 ;i<ch.length;i++)
		{
    		if(ch[i]>64 && ch[i]<91)
    		    System.out.print(Character.toLowerCase(ch[i]));
    		else
    		    System.out.print(Character.toUpperCase(ch[i]));
		}
    		    
		
	}
}

