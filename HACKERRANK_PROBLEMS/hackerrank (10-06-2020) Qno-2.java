import java.util.*;
public class cutbamboo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		List<Integer> lengths = new ArrayList<>(); // get a list of bamboo piece size
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of bamboo pieces ");
		int len = sc.nextInt();
		System.out.println("enter "+len10+" values");
		for(int i = 0;i<len;i++)
		{
			int a = sc.nextInt();
			lengths.add(a);
		}
		List<Integer> list1 = new ArrayList<>();
	      int n = lengths.size();
	      int s = n;
	      list1.add(n);
	      int[] arr = new int[1000];
	      Collections.sort(lengths);
	      for(int i = 0; i< s;i++)
	      {
	        arr[lengths.get(i)]++;
	      }
	      while(!lengths.isEmpty())
	      {
	        if(arr[lengths.get(0)] == 1)
	        {
	          lengths.remove(lengths.get(0));
	          int m = lengths.size();
	          list1.add(m);
	        }
	        else
	        {
	          int count = arr[lengths.get(0)];
	          for(int j = 0 ;j< count;j++)
	          {
	            lengths.remove(lengths.get(0));
	          }
	          int m = lengths.size();
	          list1.add(m);
	        }     
	      }
	      int index = list1.size()-1;
	      list1.remove(index);
	      for(Integer t : list1)
	    	  System.out.println(t);

	 }
}
