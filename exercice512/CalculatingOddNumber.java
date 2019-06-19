package chapter5.exercice512;
import java.util.Scanner;

public class CalculatingOddNumber {
	

	public void getOddProduct() {
	Scanner input = new Scanner(System.in);
	
	int counter = 8;
	int oddNumber = 1;	
	
	for (int i = 1; i != 9; i++) {
		System.out.print("Type odd number: ");
		int temp_odd = input.nextInt();
		if (temp_odd > 15) {
			System.out.println("Invalid input! Try odd numbers from 1 to 15.");
		}
		if (temp_odd % 2 != 1) {
			System.out.print("This is not an odd number, try again. ");
		}
		else {
			oddNumber *= temp_odd;
		}
	}
	System.out.printf("The product of all odd numbers from 1 to 15 is: %d%n", oddNumber);
}
}

