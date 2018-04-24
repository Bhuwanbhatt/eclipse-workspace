
public class Account {
		private int id = Integer.MAX_VALUE;
		private double balance = 0.0;
		private double annualInterestRate = 0.0;
		private   java.util.Date dateCreated;
		private static int numberOfAccounts;
		private static double totalValueOfAccounts;
	
		public Account(){
			dateCreated = new java.util.Date();
		}
	    public Account(int myid, double mybalance, double myannualIntrestRate) {
	    		id  = myid;
	    		balance = mybalance;
	    		annualInterestRate = myannualIntrestRate;
	    }
		public int getId() {
			return id;
		}
		public double getBalance() {
			return balance;
		}
		public double getAnnualIntrestRate() {
			return annualInterestRate;
		}
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		public void setId(int myid) {
		     id = myid;
		}
		public void setBalance(double mybalance) {
		     balance = mybalance;
		}
		public void setAnnualInterestRate(double myannualInterestRate) {
		    annualInterestRate = myannualInterestRate;
		}
		public void withdraw(double amount) {
			balance -= amount;
		}
		public void deposit(double amount) {
			balance += amount;
		}
		public double getMonthlyInterestRate() {
		     return (annualInterestRate / 100) / 12;
		 }
		public double awardMonthlyInterest() {
		     return balance * getMonthlyInterestRate();
		 }
		public void closeAccount() {
			System.out.print("Closing account" + id);
			numberOfAccounts++;
			totalValueOfAccounts += balance;
		}
		public static double averageBalance() {
			if (numberOfAccounts == 0)
				return 0;
			else
			return totalValueOfAccounts/numberOfAccounts;
			
		}
				
}
	

