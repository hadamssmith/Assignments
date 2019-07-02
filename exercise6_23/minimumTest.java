package exercise6_23;
import java.util.Scanner;

public class minimumTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers to find min number:");
		int num1 = input.nextInt();
		System.out.println("Enter numbers to find min number:");
		int num2 = input.nextInt();
		System.out.println("Enter numbers to find min number:");
		int num3 = input.nextInt();
		
		System.out.println(Minimum.getMinimum(num1, num2, num3));
	}

}
