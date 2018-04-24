import java.util.Scanner;
public class Assign8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		char grade = input.next().toUpperCase().charAt(0);
		int point = 0;
		switch(grade) {
		case 'A':
		    point = 4;
		    System.out.println("The numeric value for " + grade  + " is " + point);
		break;
		case 'B' : 
			point = 3;
			System.out.println("The numeric value for " + grade  + " is " + point);
		break;
		case 'C' :
			point = 2;
			System.out.println("The numeric value for " + grade  + " is " + point);
		break;
		case 'D' : 
			point = 1;
			System.out.println("The numeric value for " + grade  + " is " + point);
		break;
		case 'F':
		    point = 0;
		    System.out.println("The numeric value for " + grade  + " is " + point);
		 break;
		default:
			 System.out.println(grade + " is an invalid grade");
		break;
		}
	
	}
	
}



