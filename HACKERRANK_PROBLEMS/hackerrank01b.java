/******************************************************************************
 PRINT THE BINARY EQUIVALENT TO GIVEN INTEGER AND PRINT NO OF ZERO IN IT

*******************************************************************************/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    String x =Integer.toBinaryString(n);
    System.out.println(x);
    int count=0;
    for(int i=0;i<x.length();i++)
    {
      if(x.charAt(i)=='0')
        count=count+1;
    }
    System.out.println(count);

  }
}

