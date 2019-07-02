package exercise6_16;
import java.util.Scanner;

public class Multiple {
	
	public static boolean isMultiple() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number:" );
		int firstNumber = input.nextInt();
		
		System.out.println("Enter Second Number:" );
		int secondNumber = input.nextInt();
		
		boolean result = true;
		
		if(firstNumber % secondNumber == 0) {
			result = true;  
		}
		else {
			result = false;
		}
		
		return result;	
				
	}
	
	public static void main(String[] args) {
		
		boolean check = isMultiple();
		System.out.println((check));
		
		
	}

}
