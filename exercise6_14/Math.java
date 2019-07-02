package exercise6_14;
import java.util.Scanner;

public class Math {
	
	int base;
	int exponent;
	
	
	public static int integerPower() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter The Base Number");
		int base = input.nextInt();
		
		System.out.println("Enter The Exponent Number");
		int exponent = input.nextInt();
		
		int power = 1;
		for(int n = 1; n <= exponent; n++) {
			
			power*=base;
		}
		return power;		
		 
	}
	public static void main(String[] args) {
		
	
		int c = integerPower();
		
		System.out.printf("%s%d", "The Exponential is: ",(c));
		
		
	}
	
} 
