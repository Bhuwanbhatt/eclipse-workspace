import java.util.*;
public class Assign18 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[][] m = new double[3][4];
    System.out.println("Enter a matrix of " + m.length +  " by " + m[0].length + " : ");
    for(int i = 0; i<m.length;i++) {
    	for (int j = 0;j<m[i].length;j++) 
    		m[i][j] = input.nextInt();
      }
   for(int i=0;i<m[0].length;i++)
   {
	   double total= sumColumn(m,i);
	   
       System.out.println("the sum of column " + i + " is "+ total);
       
   }
   
    }

	
	public static double sumColumn(double[][] m , int columnIndex) {
			double total = 0;
			for (int row = 0;row < m.length;row++){
			total += m[row][columnIndex];
		}
			return total;
			}
	}




