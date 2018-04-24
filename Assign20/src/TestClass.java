import java.util.*;
public class TestClass {

	public static void main(String[] args) {
	System.out.printf("The average account balance is: = $%.2f", Account.averageBalance());
    Account A = new Account();
    	System.out.printf("\nDefault account: \n%11d $%,10.2f %5.2f%% %29s", A.getId(),A.getBalance(),A.getAnnualIntrestRate(),A.getDateCreated());
	Account A1 = new Account(1122,20000,4.5 );
	System.out.printf("\nModified account: \n%11d $%,10.2f %5.2f%% %29s", A1.getId(),A1.getBalance(),A1.getAnnualIntrestRate(),A.getDateCreated());
	A1.withdraw(2500);
	A1.deposit(3000);
	System.out.printf("\nAfter withdraw and deposit: \n%11d $%,10.2f %5.2f%% %29s", A1.getId(),A1.getBalance(),A1.getAnnualIntrestRate(),A.getDateCreated());
	for(int i=0;i<6;i++) {
	A1.deposit(A1.awardMonthlyInterest());
	}
	System.out.printf("\nAfter six months of interest: \n%11d $%,10.2f %5.2f%% %29s\n", A1.getId(),A1.getBalance(),A1.getAnnualIntrestRate(),A.getDateCreated());
	A1.closeAccount();
	System.out.printf("\nThe average account balance is: = $%10.2f\n", Account.averageBalance());
	
	
	Account[] accountsarray = new Account[5];
	int j= 11;
	for(int i= 0;i<accountsarray.length;i++)
	{
		
		int balance = (int) (Math.random()*150000+50000);
		 accountsarray[i] = new Account(j,balance,3.0) ;
			j=j+1;
	
	}
	System.out.printf("\nArray of five accounts with random balances: ");
	for(int i=0;i<accountsarray.length;i++) {
		System.out.printf("\n%11d $%,10.2f %5.2f%% %29s", accountsarray[i].getId(),accountsarray[i].getBalance(),accountsarray[i].getAnnualIntrestRate(),A.getDateCreated());
	}
	
	System.out.printf("\nThe average account balance is: = $%10.2f\n", Account.averageBalance());
	
	for(int i=0;i<accountsarray.length;i++) {
		accountsarray[i].deposit(accountsarray[i].awardMonthlyInterest());
	}
	System.out.printf("\nArray after awarding 6 month of interest: ");
	for(int i =0;i<accountsarray.length;i++) {
	System.out.printf("\n%11d $%,10.2f %5.2f%% %29s", accountsarray[i].getId(),accountsarray[i].getBalance(),accountsarray[i].getAnnualIntrestRate(),A.getDateCreated());
	
	}
	System.out.printf("\nThe average account balance is: = $%10.2f\n", Account.averageBalance());
	}
}
