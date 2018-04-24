/*
Author			: Bhuwan Bhatt
Class			: CSC 360
Date			    : 8th April, 2017
Instructor 		: Dr.Khan
*/

package assign5;
import java.util.Scanner;
public class Powersbhattb1 {
	private static int multiplications;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double base = in.nextDouble();
		System.out.print("Enter a non-negative integer exponent: ");
		int n = in.nextInt();
		in.close();
		
		System.out.println("\nComputing " + base + " to the power " + n + ":");
		System.out.println("Math.pow(" + base + ", " + n + ") = " + Math.pow(base, n));
		
		multiplications = 0;
		System.out.println("\npower1 (" + base + ", " + n + ") = " + power1(base, n));
		System.out.println("Multiplications = " + multiplications);
		
		multiplications = 0;
		System.out.println("\npower2 (" + base + ", " + n + ") = " + power2(base, n));
		System.out.println("Multiplications = " + multiplications);
		
		multiplications = 0;
		System.out.println("\npower3 (" + base + ", " + n + ") = " + power3(base, n));
		System.out.println("Multiplications = " + multiplications);
		
		multiplications = 0;
		System.out.println("\npower4 (" + base + ", " + n + ") = " + power4(base, n));
		System.out.println("Multiplications = " + multiplications);
		
		multiplications = 0;
		System.out.println("\npower5 (" + base + ", " + n + ") = " + power5(base, n));
		System.out.println("Multiplications = " + multiplications);
	}
	
	public static double power1(double base, int n){	//Uses a normal for loop to iterate through
		double b = 1.0;									//the powers and multiplies the base and collects in b
		for(int i = 0; i < n; i++){
			b = b * base;
			multiplications ++;
		}
		return b;
	}
	
	public static double power2(double base, int n){	//Uses a simple recursive method where the base is multiplied
		if(n == 0)										// to the method that calls itself and when base case is met 
			return 1;									
		else											
			multiplications ++;
			return base * power2(base, n-1);
		

	}
	
	public static double power3(double base, int n){	// Uses an effective recursive method where the method calls itself 
		if(n <= 0)										
			return 1;									
		else{

			if((n % 2 == 0)){
				multiplications ++;
				double holder = power3(base, n/2);
				return holder * holder;
			}
			else{
				multiplications ++;
				double holder = power3(base, n/2);
				multiplications ++;
				return base * holder * holder;
			}	
		}
	}
	
	public static double power4(double base, int n){	// Uses the above method with a helper method where unlike above method
		return multPow(1, base, n);						// the result is accumulated in a variable a and when the base case is met
	}													// it returns the accumulated results without returning to the previous caller.
	
	public static double multPow(double a, double b, int n){
		if(n <= 0)
			return a;
		else{
			if(n % 2 == 0){
				multiplications ++;
				return multPow(a, b*b, n/2);
			}
			else{
				multiplications ++;
				multiplications ++;
				return multPow(a*b, b*b, n/2);
			}
		}
			
	}
	public static double power5(double base, int n){		//Conversion of above method into an effective loop where
		double a = 1;										// powers is halved and multiplied to itself reducing the effort
		while (n > 0){										// to call itself twice.
			if(n % 2 == 0){
				base = base * base;
				multiplications ++;
			}
			else{
				a = a * base;
				multiplications ++;
				base = base * base;
				multiplications ++;
				
			}
			n = n / 2;
		}
		return a;
	}


}
