import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of A: ");
	float a = input.nextFloat();
	System.out.print("Enter the value of B: ");
	float b = input.nextFloat();
	System.out.print("Enter the value of C: ");
	float c = input.nextFloat();
	float Discriminant = (b*b)-(4*a*c);
	if (Discriminant > 0 )
	{ 
		double r1 = (-b + Math.pow(Discriminant, 0.5))/(2*a);
		double r2 = (-b - Math.pow(Discriminant, 0.5))/(2*a);
		System.out.println("The equation has two roots " + r1 +" and " + r2);
	}
		 if (Discriminant == 0 )
    {
    	  float r = -b/(2*a);
    	  System.out.println("The equation has one root " + r);
    	
    }
    	 if (Discriminant < 0 )
    {
    	 System.out.println("The equation has no real roots ");
      }
	}


}
