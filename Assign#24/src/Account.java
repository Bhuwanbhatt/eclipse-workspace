import java.util.*;
public class Account {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = 100;
		int[] Account = new int[10];
		for(int i= 0;i<10;i++) {
			Account[i] = balance;	
		}
	int i = 0;
    	while(i>=0) {
     System.out.print("Enter an id: ");
     int AccountId = input.nextInt();
     if(AccountId<=9 && AccountId>=0) {
    	int j = 0;
    	while(j<=0) {
    		
    	 System.out.println("Main menu");
    	 System.out.println("1: check balance");
    	 System.out.println("2: withdraw");
    	 System.out.println("3: deposit");
    	 System.out.println("4: exit");
    	 System.out.print("Enter a choice: ");
    	 int choice = input.nextInt();
    	 switch (choice) {
    	 case 1:
    		 System.out.println("The balance is " + balance);
    		 break;
    	 case 2:
    			 System.out.print("Enter an amount to withdraw: ");
    			 int withdraw = input.nextInt();
    			 balance = balance - withdraw;
    			 break;
    	 case 3: 
    		 System.out.print("Enter an amount to deposit: ");
    		 int deposit = input.nextInt();
    		 balance = balance + deposit;
    		 break;
    	 case 4:
    		 break;
     }
    	
      if(choice == 4) {
      break;
      }
    	}
       j++; 
     }
     else
    	 System.out.println("Enter the correct Account id");
     i++;
     balance = 100;
    	}
    
     
	}
		

}
