package exercise6_18;
import java.util.Scanner;

public class SquareOfAsterisk {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number Of Times To Loop: ");
		int side = input.nextInt();
		
		for(int i = 0; i <= side; i++) {
			for(int j = 0; j <= side; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
	}

}
