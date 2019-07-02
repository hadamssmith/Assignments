package exercise6_17;
import java.util.Scanner;
public class Even {
	 static boolean isEven() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number Of Times To Loop: ");
		int number = input.nextInt();
		
		boolean result = true;
		for(int i = 1; i<=number; i++) {
			
			System.out.println("Enter Number To Check: ");
			int evenNumber  = input.nextInt();
			
			
			if(evenNumber % 2 == 0) {
				result = true;
				
				System.out.println("Then it is an Even number");
	
				
			}
			else {
				result = false;
				System.out.println("Not Even number");
			}
			
		}
		return result;
		
	 }
	 
	public static void main(String[] args) {
		boolean check = isEven();
		System.out.println((check));
		
		
		
	}
		
				

}
