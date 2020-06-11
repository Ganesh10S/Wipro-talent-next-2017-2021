import java.util.*;

public class sortnamerom {
	
	public static int number(String str)   // method to convert roman  to number
	{
		int len = str.length();
		str = str + " ";
        int result = 0;
        for (int i = 0; i < len; i++) {
            char ch   = str.charAt(i);
            char next_char = str.charAt(i+1);
            
            if (ch == 'M') 
            {
                result += 1000;
            } 
            else if (ch == 'C') 
            {
                if (next_char == 'M') 
                {
                    result += 900;
                    i++;
                } 
                else if (next_char == 'D') 
                {
                    result += 400;
                    i++;
                } 
                else 
                {
                    result += 100;
                }
            } 
            else if (ch == 'D') 
            {
                result += 500;
            } 
            else if (ch == 'X') 
            {
                if (next_char == 'C') 
                {
                    result += 90;
                    i++;
                } 
                else if (next_char == 'L') 
                {
                    result += 40;
                    i++;
                } 
                else 
                {
                    result += 10;
                }
            } 
            else if (ch == 'L') 
            {
                result += 50;
            } 
            else if (ch == 'I') 
            {
                if (next_char == 'X') 
                {
                    result += 9;
                    i++;
                } 
                else if (next_char == 'V') 
                {
                    result += 4;
                    i++;
                } 
                else 
                {
                    result++;
                }
            } 
            else 
            {  
              if (ch == 'V')
                result += 5;
            }
        }
       
	      return result; // returns number value equivalent to given numerical
		
	}

	
	public static void main(String[] args) 
  {
		String[] input1 = {"luca XII","luca XX","john I","stuart VII","stuart IX"}; // String array
		int w = input1.length;
		List<String> output1 = new ArrayList<>(); // output as list 
		for(String s :input1)
		{
			System.out.println(s);
			String[] words = s.split("\\s");
			String name = words[0];
			String roman = words[1];
			int num = number(roman);
			String ans = name +" "+ num;
		
			output1.add(ans);
			
			
		}
		Collections.sort(output1);
		
		System.out.println(output1);
		for(String s :output1)
			System.out.println(s);
	}

}
