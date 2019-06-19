package exercise6_9;
import java.util.Scanner;

public class RoundingNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x;
		System.out.println("Enter X value: ");
		x = input.nextDouble();
		
		double y = 0;
		
		y = Math.floor(x + 0.5);
		
		System.out.print(y);
		
	}

}
