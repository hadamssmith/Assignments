package exercise6_19;
import java.util.Scanner;
public class RoundNum {
	public static void main(String[] args) {
		
		double x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value of X: ");
		x = input.nextDouble();
		
		double y = 0;
		y = Math.floor(x * 10 + 0.5);
		System.out.println(y);
		
		y = Math.floor(x * 10 + 0.5) / 10;
		System.out.println(y);
		
		y = Math.floor(x * 100+ 0.5) / 100;
		System.out.println(y);
		
		y = Math.floor(x * 1000 + 0.5) / 1000;
		System.out.println(y);
		
		
	}

}
