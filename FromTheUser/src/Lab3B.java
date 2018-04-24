/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 6/September/2018
  Assignment: #3
  Instructor: Gray Newell
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab3B {
     public static void main(String[] args) {
   DecimalFormat df = new DecimalFormat("#.#");
  Scanner input = new Scanner(System.in);
  System.out.print( "Enter your name: ");
  String Fullname = input.next();
  System.out.print("Enter the price per gallon: ");
  String pricePerGallon = input.next();
  double gallonPrice = Double.parseDouble(pricePerGallon);
  System.out.print("The total price for the fill-up: ");
  double TotalPrice = input.nextDouble();
  System.out.print("Enter the intial odometer value: ");
  int IntialDistance = input.nextInt();
  System.out.print("Enter the final odometer value: ");
  int FinalDistance = input.nextInt();
  double  GasUsed =  TotalPrice/gallonPrice;
  int totalmiles = FinalDistance-IntialDistance;
  double Milespergallon = totalmiles/GasUsed;
  
  
System.out.println(Fullname + " you drove " + totalmiles + " miles "+" using "+ df.format(GasUsed) + " gallons " + " with the mpg of " + df.format(Milespergallon));


}
}
/*Enter your name: bhuwan
Enter the price per gallon: 2.84
The total price for the fill-up: 20.25
Enter the intial odometer value: 6144
Enter the final odometer value: 6279
bhuwan you drove 135 miles  using 7.1 gallons  with the mpg of 18.9*/

/*Enter your name: Frank 
Enter the price per gallon: 1.72
The total price for the fill-up: 31.40
Enter the intial odometer value: 21975
Enter the final odometer value: 22496
Frank you drove 521 miles  using 18.3 gallons  with the mpg of 28.5*/

/*Enter your name: Ruth
Enter the price per gallon: 3.75
The total price for the fill-up: 22.87
Enter the intial odometer value: 89108
Enter the final odometer value: 89183
Ruth you drove 75 miles  using 6.1 gallons  with the mpg of 12.3 */

/*Enter your name: Gail
Enter the price per gallon: 2.05
The total price for the fill-up: 20.50
Enter the intial odometer value: 65380
Enter the final odometer value: 65691
Gail you drove 311 miles  using 10 gallons  with the mpg of 31.1*/
