import java.util.*;
public class TestTriangle {

	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in); 
		System.out.println("Enter side1: ");
		double side1 = input.nextDouble();
		System.out.println("Enter side2: ");
		double side2 = input.nextDouble();
		System.out.println("Enter side3: ");
		double side3 = input.nextDouble();
		Triangle triangle = new Triangle(side1 , side2, side3);
		System.out.println("A triangle " + triangle.toString());
		System.out.println("the color is " + triangle.getColor());
		System.out.println("The area is: " + triangle.getarea());
		System.out.println("Ther perimeter is: " + triangle .getperimeter());
		
		

	}

}
