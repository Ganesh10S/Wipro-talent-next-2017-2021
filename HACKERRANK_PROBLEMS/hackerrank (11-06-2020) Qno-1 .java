/****************************************************************************************************************
                      to check string is a panagram
*****************************************************************************************************************/


import java.util.*;
public class panagram 
{

	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		  List<String> input = new ArrayList<>(); // to get input from user
		  int n = sc.nextInt();
		  for(int i = 0;i<n;i++)
		  {
		  	String sent = sc.nextLine();
		  	input.add(sent);
		  }
		  
		 */
		List<String> input = new ArrayList<>();
		input.add("aBcdefghijkl mnopq rstuVw xyzabc"); //contains All letter of alpha with spaces cps
		input.add("mnopqrstuvwxyzabcabcdefghijkl"); // contains All letter of alpha
		input.add("NONO"); 
		String s = "";
		TreeSet<Character> tree = new TreeSet<>();
		for(String line : input)
		{
			
			line =line.toLowerCase();
			char[] ch = line.toCharArray();
			
			int m = ch.length;
			for(Character w : ch )
			{
				if(Character.isLetter(w))
					tree.add(w);
			}
			if(tree.size() == 26)
				s = s + "1";
			else
				s = s + "0";
			tree.clear();
				
		}
		System.out.println(s);

	}

}
