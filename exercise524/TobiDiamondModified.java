package chapter5.exercise524;

import java.util.Scanner;

public class TobiDiamondModified {


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("input odd number");
			int tobi = input.nextInt();
			
			if(tobi%2 == 0) {
				
				System.out.print("This is not an odd number, try again");
			}
			
			int spaces = tobi;
			int star = 1;
			int divisor = tobi / 2;
			
			for (int counter = 1; counter <= tobi; counter++) {
				for(int i = spaces; i > 0; i--) {
					System.out.print(" ");
				}
				for(int s = star; s > 0; s--) {
					System.out.print("*");
				}
				System.out.println();
				
				if(counter > divisor) {
					spaces++;
					star-=2;		
				}
				else {
					star+=2;
					spaces--;
				}
				
				
				
				
				
				
				
				
//				star+=2;
//				spaces--;
			}
		}

	}


