
public class Assign10 {

	public static void main(String[] args) {
		long celsius  = 0;
		System.out.println("Celsius" + "\tFahrenheit");
		while(celsius<=30)
		{
		long Faherenheit = Math.round(1.8*celsius + 32);
		System.out.println(celsius + "\t" + Faherenheit);
		celsius = celsius + 5;
		}
		

	}

}
