import java.util.*;
import java.text.DecimalFormat;
public class payroll {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int n = input.nextInt();
		String[] names = new String[n];
		double [] Salary = new double[n];
        if (n>1) {
        	for(int i= 0;i<n;i++) {
        		System.out.print("Enter name: ");
        		String name = input.next();
        		System.out.print("Enter salary: ");
        		double salary = input.nextInt();
        		employee Employee = new employee(name,salary);
        		
        		names[i] = Employee.getname();
        		
        		Salary[i] =  Employee.computePay();
        		 
        		
        	}
        	System.out.println("Employee\t\t " + " Pay ");
        	for(int i= 0;i<n;i++) {
   		 System.out.println( names[i] +"\t\t"+ "$"+ df.format(Salary[i]));
        	}
        }
        else {
    		System.out.print("Enter name: ");
    		String name = input.next();
    		System.out.print("Enter salary: ");
    		double salary = input.nextInt();
    		employee Employee = new employee(name,salary);
    		System.out.println("Employee\t\t" + " Pay ");
    		System.out.println(Employee.getname() + "\t\t"+ "$" + df.format(Employee.computePay()));
        }
        
        
		
        }
	
	}
	


