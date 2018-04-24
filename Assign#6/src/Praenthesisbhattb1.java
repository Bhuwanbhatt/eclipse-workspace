/*
 Name:- Bhuwan Bhatt
 Course Name:- CSC 360
 Date:-April 15 2018
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Praenthesisbhattb1 {
	public static void main(String[] args) throws FileNotFoundException { 	//defines the main method

																			
																		
		File file = new File("input.txt");										//gets the file that need to be obtained from the computer
		Scanner input = new Scanner(file);
		while(input.hasNext()){													//while loops runs until the file has next line
			String thisLine = input.nextLine();									// takes the single line as a string and stores it into thisLine
			System.out.println(isparenthesis(thisLine));						//calls isparenthesis method to check whether the parenthesis match or not.
		}
	
	}

	private static boolean isparenthesis(String thisLine) {				//isparenthsis method takes a single line as string thisLine
		Stack<Character> parenthesis = new Stack<>();					//new stack is created of type character
		for(int i=0;i<thisLine.length();i++) {							// runs through all the character in the string
			char C = thisLine.charAt(i);									// takes a character at current position of i
		//Checks the whether the parenthesis is matching or not
			if(C =='(') {												
				parenthesis.push(C);
			}
			else if(C==')') {
				if(parenthesis.isEmpty())
					return false;
				else if(parenthesis.peek()=='(')
					parenthesis.pop();
				else
					return false;
			
		}
		}
			if(parenthesis.isEmpty())
				return true;
			else
				return false;
		
		
		
	}
}
	

