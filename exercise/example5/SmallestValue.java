package chapter5.exercise.example5;
import java.util.Scanner;

public class SmallestValue {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value ");
		int value = input.nextInt();
		
		System.out.println("Enter value: ");
		int smallestNumber = input.nextInt();
		
		for(int i = 2; i <= value; i++) {
				System.out.println("Enter value: ");
				int number = input.nextInt();
				if(smallestNumber > number) {
				smallestNumber = number;
				
			}
		}
		System.out.printf("The Smallest number is: %d", smallestNumber);
	}

}
