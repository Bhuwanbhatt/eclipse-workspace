

/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 30/August/2018
  Assignment: #2
  Instructor: Gray Newell
 */


import java.text.DecimalFormat;
import java.util.Date;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("$#,####.00");
		Date currentDate = new Date();
		String clientName = "Frank Zappa";
        
		int length = 300, width = 200 , nStories = 3;
        int baseCost = 250000 ,TotalCost = 2000000;
        double squareFootCost1 = (double)(TotalCost-baseCost)/(width*length*nStories);
        
        System.out.println("Date of estimate: " + currentDate + " For " + clientName);
        System.out.println("The cost per square foot of floor space for a " + length  + " by " + width +" building");
        System.out.println(" of "+ nStories + " storeis with base cost of "+ baseCost + " and total cost of " + TotalCost +" is " +df.format( squareFootCost1) + "." );
        
        
        
        int length1 = 722, width1 = 510 , nStories1 = 9;
        int baseCost1 = 950000 ,TotalCost1 = 169583110;
        double squareFootCost2 = (double)(TotalCost1-baseCost1)/(width1*length1*nStories1);
        
        
        
        System.out.println("Date of estimate: " + currentDate + " For " + clientName);
        System.out.println("The cost per square foot of floor space for a " + length1  + " by " + width1 +" building");
        System.out.println(" of "+ nStories1 + " storeis with base cost of "+ baseCost1 + " and total cost of " + TotalCost1 +" is " +df.format( squareFootCost2) + "." );
        
        double average = (squareFootCost1 +squareFootCost2)/2;
        System.out.println("\n\n The average cost of the two building is $" + df.format(average));
	}

}
