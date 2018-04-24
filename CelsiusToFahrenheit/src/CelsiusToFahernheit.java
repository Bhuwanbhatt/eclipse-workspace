import java.util.Scanner;
public class CelsiusToFahernheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
        System.out.print("Enter the temperature in Celsius: ");
        double Celsius = input.nextDouble();
        double fahrenheit = (9.0/5)* Celsius + 32;
        System.out.println("The temperature in fahrenheit is:" + fahrenheit);
	}

}
