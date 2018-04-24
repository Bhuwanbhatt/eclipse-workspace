/*
 Name:- Bhuwan Bhatt
 Course Name:- CSC 360
 Date:-April 15 2018
 */




import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import java.util.Map;

public class MapCountBhattb1 {

	public static void main(String[] args) throws IOException { 	
		File file = new File("Integers.txt");			
	try {
		Scanner input = new Scanner(file);
		Map<Integer,Integer> map = new TreeMap<>();				
			while(input.hasNextLine()){													
			String thisLine = input.nextLine();	
			
			try {										
				Integer 	n = new Integer(thisLine);
	
					if(!map.containsKey(n)) {
						map.put(n, 1);
					}
					else {
						int value = map.get(n);
						value++;
						map.put(n, value);
					}
				}
			
				catch(NumberFormatException ex) {
					System.out.println("Warning - unable to parse string as integer: " + thisLine);
					
				}
			
		
			}
			
			
	       input.close();
					Collection<Integer> collect = map.values();	
				 int maxCount = Collections.max(collect);
				 
				 System.out.println("\nMost frequently occuring values: ");
				for (Map.Entry <Integer,Integer>entry :map.entrySet()) {
					if(entry.getValue()==maxCount) {
						System.out.println("Value:\t" + entry.getKey() + "\tNumber of occurences:\t" + entry.getValue());
					}
				}
				System.out.println("\nProcess completed.");
			
		}
		
	    catch(Exception ex){
	    		System.out.println("File Not Found...");
	       }
		}
	}