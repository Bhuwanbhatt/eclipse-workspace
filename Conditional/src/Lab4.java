/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 19/September/2018
  Assignment: #4
  Instructor: Gray Newell
 */
mport java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the age of the customer's age: ");
      long age = input.nextLong();
      if (age<=0)
      {
    	  System.out.println("Sorry but this is not a recognized age!");
    	  System.exit(0);
      }
      double ticketPrice = 40;
      if (age <= 5)
      {
      ticketPrice = 0;
    	  System.out.println("Ticket price is $" + ticketPrice);
      }
      else
      {
    	  System.out.print("Please enter the customer's county: ");
      String county = input.next();
      if (age>=65)
    
         {
           ticketPrice = 40/2;
 
         }
         
         if (county.equalsIgnoreCase("Warren") && age>=65)
          {
    	    	     ticketPrice = 15;
          }
          if (age<=65 &&county.equalsIgnoreCase("warren"))
         {
        	     ticketPrice = 30;
             
         }
          if (age<= 14 && county.equalsIgnoreCase("clermont"))
        	    ticketPrice = 0.18*ticketPrice;
          if (age >=65 && county.equalsIgnoreCase("Campbell"))
          {
        	     ticketPrice = 40/2;
              ticketPrice = 0.75*ticketPrice;
          }
    	      System.out.println("Ticket price is $" + ticketPrice);
    }
}}



