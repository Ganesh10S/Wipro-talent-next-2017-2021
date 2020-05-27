/******************************************************************************

5) Design an algorithm to find the least perfect square, which is divisible by each 
of 21, 36 and 66..

*******************************************************************************/
public class Main
{
    static int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        else
            return gcd(b, a % b); 
    } 
    static int LCM(int arr[], int n) 
    { 
    if (n < 1) 
        return 0; 
    int lcm = arr[0];
    for (int i = 1; i < n; i++) 
        lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);
    return lcm; 
    } 
    static int LPS(int arr[], int n) 
    { 
    int lps; 

    int lcm = LCM(arr, n); 
    lps = (int)lcm; 
    int cnt = 0; 
    while (lcm > 1 && lcm % 2 == 0)
    { 
        cnt++; 
        lcm /= 2; 
    } 
    if (cnt % 2 != 0) 
        lps *= 2; 
  
    int i = 3;
    while (lcm > 1) { 
        cnt = 0; 
        while (lcm % i == 0)
        { 
            cnt++; 
            lcm /= i; 
        }
        if (cnt % 2 != 0) 
            lps *= i; 
        i += 2; 
    }
    return lps; 
} 
  
	public static void main(String[] args)
	{
		int arr[] = {21,36,66}; 
        int n = arr.length; 
        System.out.println(LPS(arr, n));
	}
}
