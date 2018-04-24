

/*Author: Bhuwan Raj Bhatt
  course :CSC260L 002
  Date: 30/October/2017
  Assignment: #9
  Instructor: Gray Newell
 */
import java.util.*;
public class SortingArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] values = new int[20];
		int number;
		number = getArray(values,input);
		Arrays.sort(values,0,number);
		for (int i = 0 ; i<number; i++)
		System.out.println(values[i] + "  ");
		System.out.println("Stepsize is : " + getstepsize(values,number));
		System.out.println("Median is: " + median(values,number));
		System.out.println("Most occuring value is: " + repeat(values,number));
		
}
	public static int getArray(int[] values, Scanner input) {
		int num = 0;
		System.out.print("enter the first element: ");
		int val = input.nextInt();
		while (val!=0 && num <=20) {
			values[num] = val;
			num++;
			System.out.print("enter the next element or 0 to quit: ");
			val = input.nextInt();
		}
			return num;
	}

	
public static double median(int[] values, int number) {
		int length = values.length;
		int medain = length/2;
		return values[medain];
	}
	
public static double getstepsize(int[] values,int number) {
	double sum = 0;
	double stepSize;
	for ( int i = 0; i < (number -1); i++){
		sum += values[ i + 1] - values[ i ] ;
		
	}
	if (number >= 2){
		stepSize = (double)sum / (number -1);
	}
	else{
		stepSize = 0;
	}
	
	return stepSize;
			
}

public static int repeat(int[] values, int number) {
int currentvalue= values[0];
int currentcount = 1;
int maxcount = 1;
int maxvalue = values[0];
for (int i =1; i<number-1;i++) {
	if (values[i]==currentvalue) {
		currentcount++;
		
		
	}
	else {
		if(currentcount>maxcount) {
			maxcount = currentcount;
			maxvalue= currentvalue;
			
		}
		currentcount =1;
		currentvalue = values[i];
	}

 }
return maxvalue;
}
}

/*
 DATA SET 1
 enter the first element: 153
enter the next element or 0 to quit: 100
enter the next element or 0 to quit: 532
enter the next element or 0 to quit: 100
enter the next element or 0 to quit: 534
enter the next element or 0 to quit: 153
enter the next element or 0 to quit: 100
enter the next element or 0 to quit: 101
enter the next element or 0 to quit: 153
enter the next element or 0 to quit: 155
enter the next element or 0 to quit: 153
enter the next element or 0 to quit: 100
enter the next element or 0 to quit: 193
enter the next element or 0 to quit: 154
enter the next element or 0 to quit: 153
enter the next element or 0 to quit: 0
100  
100  
100  
100  
101  
153  
153  
153  
153  
153  
154  
155  
193  
532  
534  
Stepsize is : 31.0
Median is: 154.0
Most occuring value is: 153
 
 DATA SET 2
 
 enter the first element: 66
enter the next element or 0 to quit: 39
enter the next element or 0 to quit: 38
enter the next element or 0 to quit: 44
enter the next element or 0 to quit: 65
enter the next element or 0 to quit: 66
enter the next element or 0 to quit: 67
enter the next element or 0 to quit: 55
enter the next element or 0 to quit: 44
enter the next element or 0 to quit: 54
enter the next element or 0 to quit: 66
enter the next element or 0 to quit: 38
enter the next element or 0 to quit: 67
enter the next element or 0 to quit: 43
enter the next element or 0 to quit: 66
enter the next element or 0 to quit: 67
enter the next element or 0 to quit: 33
enter the next element or 0 to quit: 66
enter the next element or 0 to quit: 51
enter the next element or 0 to quit: 0
33  
38  
38  
39  
43  
44  
44  
51  
54  
55  
65  
66  
66  
66  
66  
66  
67  
67  
67  
Stepsize is : 1.8888888888888888
Median is: 65.0
Most occuring value is: 66
 
 DATA SET 3:
 
 enter the first element: 10
enter the next element or 0 to quit: 15
enter the next element or 0 to quit: 19
enter the next element or 0 to quit: 3
enter the next element or 0 to quit: 7
enter the next element or 0 to quit: 15
enter the next element or 0 to quit: 4
enter the next element or 0 to quit: 6
enter the next element or 0 to quit: 19
enter the next element or 0 to quit: 6
enter the next element or 0 to quit: 15
enter the next element or 0 to quit: 12
enter the next element or 0 to quit: 9
enter the next element or 0 to quit: 9
enter the next element or 0 to quit: 7
enter the next element or 0 to quit: 15
enter the next element or 0 to quit: 16
enter the next element or 0 to quit: 10
enter the next element or 0 to quit: 11
enter the next element or 0 to quit: 8
enter the next element or 0 to quit: 15
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 20
	at SortingArray.getArray(SortingArray.java:25)
	at SortingArray.main(SortingArray.java:9
 */



