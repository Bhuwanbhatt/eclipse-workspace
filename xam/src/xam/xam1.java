package xam;

import java.util.Scanner;

public class xam1 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		System.out.print("enter amount:");
		float amount = input.nextFloat();
		  double average = 0;
		  int count = 0;
		  int k = 0;
		  while (amount!=0) {
			average = amount/count;
			if (amount>50);
			   k++;
			   count++;
			     System.out.print("enter amount:");
				 amount = input.nextFloat();
		  } 
		System.out.println("sales average $%.2f" + average);
		System.out.println("amount more than $50 = " + k);
		
		
		
		
		
	}
}
