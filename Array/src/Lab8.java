/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 18/October/2018
  Assignment: #8
  Instructor: Gray Newell
 */


import java.util.Scanner;
public class Lab8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Number of items: ");
		int x = input.nextInt();
		if (x < 1 || x > 100){
			System.out.println("Invalid/ Large inputs!! ");
		}
		else{
		int [] array = getarray(input, x);
		System.out.println("Output:");
		 
		
		/*for (int i = 0; i < x; i++ ){
			System.out.print(array[i] + " ");
		}
		*/
		double average = getAverage( array, x );
		System.out.printf( "Average:\t\t%1.2f", average);
		double standDev = getStdDev( array, average, x);
		if (standDev == 1){
			System.out.print("\nStd Dev:\t\tcannot compute standard deviation!!");
		}
		else{
			System.out.printf( "\nStd Dev:\t\t%1.2f", standDev);
		}
		int lessThanAvg = getLessThanAvg( array, average, x);
		System.out.println( "\nLess than Avg:\t\t" + lessThanAvg);
		boolean order = getorder(array, x);
		if (order == true){
			System.out.println( "Array is sorted in order. " );
		}
		else{
			System.out.println( "Array is not sorted in order. " );
		}
		}
		
		
	}
	public static int [] getarray (Scanner input, int num){
		int [] myList = new int[num];
		System.out.print("Items: ");
		for (int i = 0; i < num; i++){
			myList[i] = input.nextInt();
		}
		return myList;		
	}
	public static double getAverage( int [] array, int size){
			int sum = 0;
			for (int i = 0; i < size; i++){
				sum = sum + array[i];
			}
			double average = (double) sum/size;
			return average;
	}
	public static double getStdDev( int [] array, double average, int x){
		double sumNum =0, standDev;
		if (x < 2){
			double noStd = 1;
			return noStd;
		}
		for (int i = 0; i < x; i++){
			sumNum = sumNum + Math.pow((array[i] - average), 2);
		}
		standDev = Math.sqrt(sumNum / (x-1));
		return standDev;	
	}
	public static int getLessThanAvg( int [] array, double average, int x){
		int count = 0;
		for ( int i = 0; i < x; i++ ){
			if (array[i] < average){
				count ++;
			}
			
		}
		return count;
		
	}
	public static boolean getorder( int [] array, int x){
		for (int i = 0; i < x-2; i++){
			if ( array[i] > array[i+1]){
				return false;
			}
			
		}
		return true;
		
	}
	
}

	


