
public class assig9 {

	public static void main(String[] args) {
		System.out.println("Celsius\tFahrenheit");
		for (int c=0; c<=30;c=c+5)
		{
			double f = celsius(c);
			System.out.printf("%2d %10.1f\n" ,c,f );
		}
	
			

	}

	private static double celsius(int c) {
     double f =  (9.0/5)* c + 32;
		return f;
	}

}
