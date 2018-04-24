
import java.util.Scanner;
import java.util.ArrayList;
public class List {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers : ");
		int value;
		
		for (int i = 0; i < 10; i++){
			value = input.nextInt();
			list.add(value);

		}
		for (int i = 0; i < list.size(); i++){
			int a = list.indexOf(list.get(i));
			int b = list.lastIndexOf(list.get(i));
			while (a != b){
				list.remove(b);
				b=list.lastIndexOf(list.get(i));}
		}
			
		for (int j = 0; j < list.size(); j++){
			System.out.print(list.get(j) + "\t");

	}

	}
}
