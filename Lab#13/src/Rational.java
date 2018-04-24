/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 7/Dec/2017
  Assignment: #13
  Instructor: Gray Newell
 */
public class Rational {
	private int den, num;
	int divisor;
	
	Rational(int numerator, int denominator){
		if (denominator < 0){
			num = (-1) * numerator;
			den = Math.abs(denominator);
		}
		else if (denominator == 0){
			num = 0;
			den = 1;
		}
		else{
			num = numerator;
			den = denominator;
		}
		reduce();
		toString();
	}	
	
	//Printing out the rational number
	public String toString(){
		return num + "/" + den;
	}
	
	//Comparing the rational numbers
	public int comparesTo(Rational other){
		int p1 = num * other.den;
		int p2 = den * other.num;
		if (p1 - p2 > 0){
			return 1;
		}
		else if (p1 - p2 < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	//Addition method
	public Rational plus(Rational other){
		int n = num * other.den + other.num * den;
		int d = den * other.den;
		return new Rational(n, d);
	}
	
	//Subtraction method
	public Rational minus(Rational other){
		int n = num * other.den - other.num* den;
		int d = den * other.den;
		return new Rational(n, d);
	}
	
	//Multiplication method
	public Rational times(Rational other){
		int n = num * other.num;
		int d = den * other.den;
		return new Rational(n, d);
		
	}
	
	//division method
	public Rational over(Rational other){
		int n = num * other.den;
		int d = den * other.num;
		return new Rational(n , d);
		
	}
	
	//reduce to the nearest fraction
	private void reduce(){
		if (num == 0){
			den = 1;
		}
		else {
			divisor = 2;
			while (divisor <= Math.abs(num) && divisor <= den){
				if (num % divisor == 0 && den % divisor == 0){
					num = num / divisor;
					den = den / divisor;}
				else {
					divisor++;
				}
			}
		}
	}
	
}
