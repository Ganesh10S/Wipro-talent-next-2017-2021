/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String st1 =sc.nextLine();
    String st2 = sc.nextLine();
    String st= st1+st2;
    char[] ch= st.toCharArray();
    int len =ch.length;
 
    TreeSet<Character> vowels = new TreeSet<Character>();
    for (int j = 0; j < len; j++) 
    {  
        vowels.add(ch[j]);
    }
    for(Character s: vowels)
    {
      System.out.print(s);
    }
  }
}
