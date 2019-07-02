package exercise6_27;
import java.util.Scanner;

public class GcdTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter First Digit");
		int num1 = input.nextInt();
		System.out.println("Enter Second Digit");
		int num2 = input.nextInt();
		
		System.out.printf("The Greatest Common Divisor between %d and %d is : %d", num1, num2,
				GreatestCommonDivisor.gcd(num1, num2) );
		
		
	}

}
