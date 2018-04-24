
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		boolean continueInput1 = true;
		
	
		
		do {
			try {

				
			
				System.out.print("Enter the first integer: ");
			    int	number1 = input.nextInt();
			     boolean  FirstInput = true;
					do {
						try {
							System.out.print("Enter the second integer: ");
							int	number2 = input.nextInt();
							int sum = number1+number2;
							System.out.println("the sum is: " + sum);
							FirstInput = false;
						}
					catch (InputMismatchException ex) {
						System.out.println("Try again.(" + "Incorrect input: an integer is required");
						input.nextLine();
					
					}
					}
					
			    while(FirstInput);
			    continueInput= false;
				
					
			
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again.(" + "Incorrect input: an integer is required");
				input.nextLine();
			
			}
			
			
		}while(continueInput);
		
			
		}

	}


