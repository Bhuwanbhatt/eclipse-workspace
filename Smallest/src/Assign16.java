import java.util.Scanner;
public class Assign16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[ ] list = new double [10];
		System.out.print("Enter the number: ");
		for(int i = 0 ; i < 10 ;i++) {
		   list[i] = input.nextDouble();
		   }
		double smallest = min(list);
		System.out.println("Smallest number is: " + smallest);
	} 
		public static double min(double[] list) {
			double smallest = list[0];
        for(int i = 0 ; i < 10; i++)
        {
        	  if (smallest>list[i])
		   smallest = list[i];
        	 
         }
        return (smallest);
}
		}