import java.util.Scanner;
public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
  System.out.print("Enter the exchange rate from dollars to RMB: ");
  float rate = input.nextFloat();
  System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
   int number = input.nextInt();  
   if(number == 0)
		   {
	   System.out.print("Enter the dollar amount: ");
	   float dollar = input.nextFloat();
	   float RMB = dollar * rate;
	   System.out.println("$" + dollar + " is " + RMB +" yuan");
	   
		   }
   if (number == 1)
   {
	   System.out.print("Enter the RMB amout: ");
	   float RMB = input.nextFloat();
	   float dollar = RMB * (1/rate);
	   System.out.println(RMB + " yaun is " + "$"+ dollar);
   }   
   else
	   System.out.println("Incorrect Input");
	}

}
