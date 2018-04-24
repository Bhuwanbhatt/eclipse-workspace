import java.util.Scanner;
public class Assign12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double CD = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double rate = input.nextDouble();
		System.out.println("Month\tCD value");
		for(int month=1;month<19;month++)
		{
			CD = CD + CD * rate/1200;
			System.out.printf("%3d    %.2f\n", month,CD);
			
		}
		

	}

}
