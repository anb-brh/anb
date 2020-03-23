import java.util.Scanner;

public class Qu2 {
	private static Scanner sc;

	public static void main(String args[]) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the radius of a Sphere : ");
		double radius=sc.nextDouble();  
	    double pie=3.14285714286;  
	    double volume=(4.0/3.0)*pie*(radius*radius*radius);  
	    System.out.format("Volume of the sphere= %.2f", volume);  
	}
	
}
