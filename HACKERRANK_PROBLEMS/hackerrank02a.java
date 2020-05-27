import java.util.Scanner;
import java.util.TreeSet;
public class hackerrank02a
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String st =sc.nextLine();
    int flag=0;
    char[] ch= st.toCharArray();
    int len =ch.length;
 
    TreeSet<Character> vowels = new TreeSet<Character>();
    for (int j = 0; j < len; j++) 
    {  
      if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
      {
        flag=1;
        vowels.add(ch[j]);
      }
    }
    if(flag==0)
    {
        System.out.print("Thank You");
    }
    else{
        for(Character s: vowels)
        {
          System.out.print(s);
        }
    }
  }
}
