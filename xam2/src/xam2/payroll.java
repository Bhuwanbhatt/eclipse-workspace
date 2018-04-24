
package xam2;
import java.util.*;
public class payroll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rate: ");
		double rate = input.nextDouble();
		System.out.print("\nEnter hours: ");
		double hours = input.nextDouble();
		pay p1 = new pay();
		System.out.printf("pay=$%.2f", p1.computepay(hours, rate));

	}

}
