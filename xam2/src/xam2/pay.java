package xam2;

public class pay {
private double hours;
private double rate;
pay(double h, double r){
	hours=h;
	rate =r;
}
public static double computepay(double hours,double rate) {
	double amount =0;
	if (hours>40)
	{
		   amount = (hours-40)*(1.5*rate)+ (40*rate);
	}
	else {
	  amount = hours * rate; 
	}
	return amount;
}

}
