/******************************************************************************
 PRINT t 0R f BASED ON BOOL VALUE

*******************************************************************************/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n =sc.nextInt();
    Boolean [][]a=new Boolean[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j] = sc.nextBoolean();
      }
    }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i][j])
        {
            System.out.print("t"+" ");
        }
        else{
            System.out.print("f"+" ");
            
        }
      }
      System.out.println(" ");
    }

  }
}

