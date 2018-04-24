/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 7/Dec/2017
  Assignment: #13
  Instructor: Gray Newell
 */

public class User {

	public static void main(String[] args) {
		Rational r1 = new Rational(1, 6);
		System.out.println("Rational r1 : " + r1.toString());
		
		Rational r2 = new Rational(-5, -7); // this will become 5/7
		System.out.println("\nRational r2 : " + r2.toString());
		
		System.out.println("\nr3 before modifying");
		Rational r3 = new Rational(4, 2); // this will become 2/1
		System.out.println("Rational r3 : " +  r3.toString());
		
		Rational r4 = new Rational(3, -2); // this will become -3/2
		System.out.println("\nRational r4 : " + r4.toString());
		
		Rational r5 = r1.plus(r3);
		System.out.println("\nRational r5 : " + r5.toString());
		
		Rational r6 = r5.times(r4);
		System.out.println("\nRational r6 : " + r6.toString());
		
		Rational r7 = r2.minus(r2);
		System.out.println("\nRational r7 : " + r7.toString());
		
		System.out.println("\nr3 after modifying");
		r3 = r4.minus(r3);
		System.out.println("Rational r3 : " + r3.toString());
		
		System.out.println("\n" + r4.comparesTo(r5));
		
		System.out.println("\n" + r1.comparesTo(new Rational(10, 60)));

	}

}
