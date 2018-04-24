import java.util.*;
public class TestBMI {

	public static void main(String[] args) {
		 System.out.print("Enter your weight in pounds: ");
		 Scanner in = new Scanner(System.in);
		 double weight = in.nextDouble();
		 System.out.print("Enter you height in inches: ");
         double height = in.nextDouble();
        
	     BMI bmi1 = new BMI();
	      System.out.printf("BMI is: %.2f ", bmi1.getBMI(weight,height));
	      System.out.println("\nMaximum ideal weight is: " + bmi1.getMaxWeight(height));
	      System.out.print("what is the goal for your weight? ");
	      int goalweight = in.nextInt();
	      bmi1.setWeight(160);
	      System.out.printf("Your BMI will be: %.2f", bmi1.getBMI(goalweight, height));
	}

}
