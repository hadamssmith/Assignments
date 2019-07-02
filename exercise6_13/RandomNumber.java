package exercise6_13;

import java.security.SecureRandom;

public class RandomNumber {
	public static void main(String[] args) {
		SecureRandom roundom = new SecureRandom();
		
		int game = 2 + 2 * roundom.nextInt(5);
		System.out.printf("%s%d%n", "The Even  Number: ", game);
		
		int show = 3 + 2 * roundom.nextInt(5);
		System.out.printf("%s%d%n", "The Even  Number: ", show);
		
		int display = 6 + 4 * roundom.nextInt(5);
		System.out.printf("%s%d%n", "The Even  Number: ", display);
		
		
	}

}
