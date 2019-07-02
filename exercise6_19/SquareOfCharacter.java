package exercise6_19;

import java.util.Scanner;

public class SquareOfCharacter {
	public static void isSquare(int side, char fillCharacter) {
		//Scanner input = new Scanner(System.in);
		

		
		for(int i = 1; i <= side; i++) {
			for(int j = 1; j <= side; j++) {
				System.out.print(fillCharacter);
			}
			
			System.out.println();

		}
		//return fillCharacter;

	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the fill character: ");
		char fill = input.next().charAt(0);	
		System.out.println("Enter Number Of Times To Loop: ");
		int n = input.nextInt();
		
		isSquare(n,fill);
	}
	
}