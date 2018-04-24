import java.util.Scanner;
public class SortanArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double []list = new double[10];
		System.out.print("Enter any ten numbers: ");
				for(int i= 0;i<=list.length-1;i++) {	
				
					list[i]= input.nextInt();
				}
				System.out.print("Your Array is: ");
				for(int i =0;i<=list.length-1;i++)
				{
				System.out.print(list[i]+"  ");
				}
				System.out.print("\n");
		selectionsort(list);
		
	}

	

	public static void selectionsort(double[] list) {
		for(int i = list.length-1; i>0; i--)
		{
			double currentMax = list[i];
			int currentMaxIndex = i;
			
		for (int j = i-1;j>=0;j--)
		{
			if(currentMax<list[j]) {
				currentMax = list[j];
				currentMaxIndex = j;
			}
		}
		
	if (currentMaxIndex!=i)
	{
		list[currentMaxIndex] = list[i];
		list[i] = currentMax;
		
	}
	
		}
		System.out.print("Shorted array is: ");
		for(int i= 0; i<list.length;i++) {
			System.out.print( list[i] + "  ");
		}
	}
	
}
