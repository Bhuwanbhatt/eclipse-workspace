
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab5 {
	public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("$#0.00");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the customer type");
	System.out.print("Enter r for residential customer and c for commercial customer: ");
	char customertype = input.next().toLowerCase().charAt(0);
	System.out.print("Enter the minute talked: ");
	int minute  = input.nextInt();
	double bill = 0;
	if (minute >= 0 && minute<=10080)
	{
		if (customertype == 'r')
		{
			if (minute<=60)
				 bill = 5;
			else
		bill = (double) (5 + (0.1*(minute-60)));
			System.out.println("the bill is: " + df.format(bill));
		}
		else if(customertype == 'c')
		{
			
			if (minute<=300)
				bill = (double) (0.2*minute);
			else
			{
				System.out.print("are minutes 300 or more: ");
				char bonus = input.next().toLowerCase().charAt(0);
				if (bonus == 'y') 
				  bill =(double) ((0.2*300 + 0.15*(minute-300)) - (double) ((0.2*300 + 0.15*(minute-300))*0.3));
			    if (bonus == 'n')
			    	  bill = (double ) (0.2*minute);
			    	
			}
			System.out.println("the bill is: " + df.format(bill));
		}
		else if (customertype =='e')
		{
			bill = 0.18*minute;
			System.out.println("the bill is: " + df.format(bill));
		}
		else if (customertype == 'p')
		{
			if (minute<=500)
				bill = 10 + 0.06*minute;
			else if (minute> 500)
				bill = 10 + 0.06*500 + 0.04*(minute-500);
			System.out.println("the bill is: " + df.format(bill));
		}
		
		else 
		System.out.println("Invalid client type");
		System.exit(0);
		
		
	}
	else
		System.out.println("Invalid number of minutes");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	}
