import java.util.Scanner;
public class Srijana {
public  static void main(String[] args) {
	System.out.print("Enter a URL: " );
	String URLString = new Scanner (System.in).next();
	try {
		java.net.URL url = new java.net.URL(URLString);
		Scanner input = new Scanner(url.openStream());
		String  count;
		while (input.hasNext()) {
			String line = input.nextLine();
			while (line =="Password" ) {
				count = line;
				System.out.println(count);
			}
		}
		
	}
	catch (java.net.MalformedURLException ex) {
		System.out.print("invalid url");
	}
   catch (java.io.IOException ex) {
	   System.out.print("I/O errors: nos such file");
   }
}
}
