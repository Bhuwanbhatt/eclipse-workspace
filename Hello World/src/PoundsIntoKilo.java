import java.util.Scanner;
public class PoundsIntoKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the weight in pounds: ");
       double Pounds = input.nextDouble();
       final double Constant = 0.454;
       System.out.println("the weight in kilogram is " + Pounds * Constant );
        
	}

}
