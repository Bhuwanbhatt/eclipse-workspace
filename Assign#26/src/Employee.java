
public class Employee extends Person{
private String hours;
private String office;
private String salary;

public Employee(String hours,String office, String salary, String name,String address, String phone, String email) {
	super(name, address,phone,email);
	this.hours = hours;
	this.office = office;
	this.salary = salary;
	
	
}
public String toString(){
	return super.getName() + " in Employee";
}
}