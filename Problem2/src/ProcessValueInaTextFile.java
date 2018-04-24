import java.io.*;
import java.util.*;

public class ProcessValueInaTextFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of input file: ");
		String filename= input.nextLine();
		try {
			FileReader read = new FileReader(filename);
			Scanner input1 = new Scanner(read);
			int numberOfParsableLines = 0;
			double sum = 0;
			int numberOfUnParsableLines = 0;
			while(input1.hasNext()) {
				String thisLine = input1.nextLine();
				try {
					int thisInteger = Integer.parseInt(thisLine);
					numberOfParsableLines++;
					sum+=thisInteger;
					
				}
				catch(NumberFormatException ex) {
					System.out.println("Cannot parse " + thisLine + " as an integer");
					numberOfUnParsableLines++;
				}
			}
				System.out.println("Number of parsable lines: " + numberOfParsableLines);
				System.out.println("Average value: " 
						+ (sum/numberOfParsableLines));
				System.out.println("Number of unparsable lines: " 
						+ numberOfUnParsableLines);
				input1.close();
			
			}
			catch(FileNotFoundException ex){
				System.out.println("Could not find the file: " + filename);
				System.exit(1);
			}
		}
		
	}


