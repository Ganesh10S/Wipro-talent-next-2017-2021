/******************************************************************************

9 Write a program to print month in words, based on input month in numbers
Example1:
C:\>java Sample 12
O/P Expected : December
Example2:
C:\>java Sample
O/P Expected : Please enter the month in numbers
Example3:
C:\>java Sample 15
O/P Expected : Invalid month

*******************************************************************************/
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		String month;
		switch (m) {
            case 1:  
                month = "January";
                break;
            case 2:  
                month = "February";
                break;
            case 3:  
                month = "March";
                break;
            case 4:  
                month = "April";
                break;
            case 5:  
                month = "May";
                break;
            case 6:  
                month = "June";          
                break;
            case 7:  
                month = "July";
                break;
            case 8:  
                month = "August";
                break;
            case 9:  
                month = "September";
                break;
            case 10: 
                month = "October";
                break;
            case 11: 
                month = "November";
                break;
            case 12: 
                month = "December";
                break;
            default: 
                month = "Invalid month";
                break;
        }
	    System.out.println(month);
	}
}
