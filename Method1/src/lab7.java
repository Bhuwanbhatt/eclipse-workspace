/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 18/October/2018
  Assignment: #7
  Instructor: Gray Newell
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class lab7 {
public static void main(String[] args) {
    	 
Scanner input = new Scanner(System.in);
DecimalFormat decimal = new DecimalFormat("$##.00");
int getHeight = getSize("height", input);
int getWidth = getSize("width", input);
int getLength = getSize("length", input);

String getColor = color(input);

int getNumberofCans = cans(getHeight, getWidth, getLength);

double getCost = cost(getNumberofCans, getColor);
 output(getHeight, getWidth, getLength, getColor, getNumberofCans, getCost, decimal);

}
public static int getSize(String caption, Scanner input){		//Dimension method
System.out.print("Enter the " + caption + " of the room: ");
int value = input.nextInt();
return value;		
}

public static String color(Scanner input){						//Color method
System.out.print("Enter the color: ");
String colorValue = input.next().toUpperCase();
return colorValue;
}

public static int cans(int H, int W, int L){					//Number of Cans method
int totalArea = 2*H*W + 2*H*L + W*L;
double noOfCans = Math.ceil((double)totalArea/365);
return (int)noOfCans;
}

public static double cost(int numberOfCans, String color){		//Total Cost method
double costValue;
if (color.equals("GREEN")){
	costValue = 3.68*numberOfCans;
}
else if (color.equals("ORANGE")){
	costValue = 4.25*numberOfCans;
}
else if (color.equals("MAUVE")){
	costValue = 3.69*numberOfCans;
}
else if (color.equals("EGGSHELL")){
	costValue = 4.25*numberOfCans;
}
else if (color.equals("WHITE")){
	costValue = 3.25*numberOfCans;
}
else {
	costValue = 6*numberOfCans;
}

if (numberOfCans > 10){
	costValue = costValue - (0.1*costValue);
}
else if (numberOfCans > 5 && numberOfCans <= 10 ){ 
	if (color.equals("EGGSHELL") || color.equals("WHITE")){
		costValue = costValue - (0.06*costValue);
	}
	else{
		costValue = costValue - (0.04*costValue);
	}	
}
else{
	costValue = costValue;
}
return costValue;	
}
public static void output(int H, int W, int L, String C, int cans, double cost, DecimalFormat df){		//Output Method
System.out.println("\nHeight: " + H + "\nWidth: " + W + "\nLength: " + L + "\nColor: " + C + "\nNumber of Cans: " + cans + "\nTotal Cost: " + df.format(cost));	
}
}
