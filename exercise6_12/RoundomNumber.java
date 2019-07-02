package exercise6_12;
import java.security.SecureRandom;

public class RoundomNumber {
	public static void  main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		
		int n = 1 + randomNumber.nextInt(2);
		System.out.println("number 1 to 2:" + " " +  n);
		
		int game = 1 + randomNumber.nextInt(100);
		System.out.printf("%s%d%nu", "number 1 to 100: ", game);
		
		int toss = 1 + randomNumber.nextInt(9);
		System.out.printf("%s%d%n", "number 0 to 9: ", toss);
		
		int roll = 1000 + randomNumber.nextInt(112);
		System.out.printf("%s%d%n", "number 1000 to 1112: ", roll);
		
		int generate  = -1 + randomNumber.nextInt(1);
		System.out.printf("%s%d%n", "number -1 to 1: ", generate);
		
		int trow = -3 + randomNumber.nextInt(11);
		System.out.printf("%s%d", "number -3 to 11: ", trow);
		
		
	}
}
