public class GameOfDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random1, random2;
		random1 = (int)(Math.random()*7);
	
		random2 = (int)(Math.random()*7);
		
		int result = sum(random1, random2);
		
		
		if (result == 2 || result == 3 || result == 12){
			System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2) + "\nYou Lose" );
		}
		else if (result == 7 || result == 11){
			System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2) + "\nYou Win" );
		}
		else {
			System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2)+ "\nYou point is " + result);
			int point = result;
			run(point);	
		}
	}
	public static int sum(int random1, int random2){
		
		return random1 + random2;

		}	
	public static void run(int point){
		String status = "continue";
		while (status.equals("continue")){
			int random1 = (int)(Math.random()*7);
			
			int random2 = (int)(Math.random()*7);
			//System.out.println(random2);
			sum(random1, random2);
			if (sum(random1, random2) == point){
				System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2) + "\nYou Win" );
				status = "win";
			}
			else if (sum(random1, random2) == 7){
				System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2) + "\nYou Lose" );
				status = "lose";
			}
			else{
				System.out.println("You rolled " + random1 + " + " + random2 + " = " + sum(random1, random2));
			}
			
		}
		
	}
}