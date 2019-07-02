package exercise6_21;
import java.util.Scanner;
public class SeparatingTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int r = input.nextInt();
		
	
		System.out.println(SeparatingDigit.displayDigit(r));
	}
}
