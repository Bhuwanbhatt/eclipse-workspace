/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 27/September/2018
  Assignment: #6
  Instructor: Gray Newell
 */
import java.util.Scanner;
public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the target numbet: ");
		int targetnumber = input.nextInt();
		System.out.print("Enter an integer value (0 to quit): ");
		int value = input.nextInt();
		int max = Integer.MIN_VALUE;
		int oddcount =0;
		int sum1 = 0;
		float average = 0;
		int sum = 0;
		int count = 0;
		int targetcount = 0;
		while (value != 0) {
			if (value > max)
				max = value;
			if (targetnumber == value)
				targetcount++;
		   sum += value;
		   System.out.print("Enter next value (0 to quit): ");
		   
		   if (value>=0)
		   {   
		     sum1 = sum1 + value; 
			   count++;
		   }
		   if (value%2 == 1 || value%2 == -1)
			   oddcount++;
		   value = input.nextInt(); 
		}
		System.out.println("The sum of the entered values is " + sum);
        if(count>=1)
        {
        	  average = (float) sum1/count;
          System.out.printf("the averae is $%.2f\n ",average);
        }
        if (count==0)
         	System.out.println("average is undefined");
		    System.out.println("the number of the non-zero values: "+ count);
		    System.out.println("the number of odd values intered is: "+ oddcount);
		    System.out.println("the value " + targetnumber + " was input " + targetcount + " times");
	        System.out.println("the maximum value entered was " + max);
	}

}
