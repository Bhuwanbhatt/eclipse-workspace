import java.util.Scanner;
public class Assign9 {

	public static void main( String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an American date: ");
	 String s = input.nextLine();
	 int k = s.indexOf(' ');
	
	 String s1 = s.substring(0,k);
	 String s2 = s.substring(k+1);
	 int m = s2.indexOf(',');
     String s3 = s2.substring(0,m);
     String s4 = s2.substring(m+1);
	 String s5 = (s3 + " " + s1 + " " +s4);
	System.out.println("European date is " + s5 ) ;
	
	}
	


}