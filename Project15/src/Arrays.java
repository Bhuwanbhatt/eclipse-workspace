import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] myList = new int[100];
		System.out.print("Enter age: ");
		 int value = input.nextInt();
		  while(value>=0) {   
		for ( int i = 0; i < myList.length; i++){
			  myList[i] = value;  
			  System.out.print("Enter age: ");
		      myList[i+1] = input.nextInt();
		}
		}
		
				
		for (int i = 1; i < myList.length; i++){
			System.out.println( myList[i]);
			}
		}	
		
	}


