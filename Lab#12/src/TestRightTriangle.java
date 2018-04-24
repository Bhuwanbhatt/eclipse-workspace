/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 7/Dec/2017
  Assignment: #12
  Instructor: Gray Newell
 */
public class TestRightTriangle {

	public static void main(String[] args) {
		RightTriangle t1= new RightTriangle(5,20);
		RightTriangle t2= new RightTriangle(3,4);
		RightTriangle t3= new RightTriangle();
		RightTriangle t4= new RightTriangle(16.3,4.889);
		System.out.printf("Perimeter of triangle 1 is : %.2f\n", t1.getPerimeter());
		System.out.printf("Angle A of triangle 1 is : %.2f\n", t1.getangleA());
		System.out.printf("Area of triangle 2 is : %.2f\n", t2.getArea());
		t3.setSideA(10.1);
		t3.setSideB(12.4);
		System.out.printf("Angle A of triangle 3 is :  %.2f\n", t3.getangleA());
		System.out.printf("Angle B of triangle 1 is : %.2f\n",  t3.getangleB());
		System.out.println("Triangle 4: " +  t4.toString());
		t4.setSideA(-6);
		System.out.println("Triangle 4: " + t4.toString());
	    t2.setSideA(5.0);
	    System.out.println("Triangle 2: " + t2.toString());
	
	
	}
	

}
