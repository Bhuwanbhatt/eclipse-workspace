
public class employee {
private  String name;
private  double salary;



public employee(String name, double salary) {
	this.name = name;
	this.salary = salary;
}


public String getname() {
	return name;
	
}
public  double computePay() {
	double pay = (salary/26) - (0.3*salary/26);
	return pay;	
}
}
