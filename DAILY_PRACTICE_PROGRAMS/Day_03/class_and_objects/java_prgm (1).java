/******************************************************************************

1 Create a class Box that uses a parameterized method to initialize the 
dimensions of a box.(dimensions are width, height, depth of double type). 
The class should have a method that can return volume. 
Obtain an object and print the corresponding volume in main() function

*******************************************************************************/
public class box
{
    double h,w,d;
    box(double w, double h ,double d)
    {
        d =d;
        h =h;
        w =w;
    }
    double voulume()
    {
        return l*h*w;
    }
	public static void main(String[] args) {
	    box b = new box(12,6,2);
	    
		System.out.println(b.voulme());
	}
}
