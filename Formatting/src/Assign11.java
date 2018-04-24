import java.util.Scanner;
public class Assign11 {

	public static void main(String[] args) {
		System.out.print(" Enter bill or income(0 to quit):");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double income = 0;
		double bills = 0;
		while (amount != 0)
		{
			if (amount>=0)
			income+=amount;
			else
				bills+=amount*(-1);
	     System.out.print(" Enter bill or income(0 to quit):");
	     amount = input.nextDouble();
			
		}
		
		System.out.printf("total income: $%.2f\n ", income);
		
		System.out.printf("total bills: $%.2f", bills);
		
	}
}
