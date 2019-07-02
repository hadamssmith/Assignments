package exercise6_30;
import java.security.SecureRandom;
import java.util.Scanner; 



public class GuessTheNumber {
	private static enum Guess{Cont, High, Low, Right};
	
	
	static Scanner input = new Scanner(System.in);
	
	public static void guessNumber() {
		for(int i = 1; i <= 10; i++) {
			System.out.print("Enter NUmber To Guess");
			int num = input.nextInt();

		//int count = 0;
		int check;
		int sentinel =1;
		
		while(num == 1) {
			
			Guess prob = Guess.Cont;
			guess();
			
			
		}
		
		
		
			
		}
		
	}
	
	public static int guess() {
		SecureRandom random = new SecureRandom();
		
		int check = random.nextInt(1000);
		return check;
		
		}
			
			
			
			
			
	

}