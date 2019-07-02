package exercise6_26;

import java.util.Scanner;
public class ReversingDigit {
	
	public  static int reverseDigit() {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Input The Reverse Number");
		int num = input.nextInt();
		
		int reverse = 0;
		int digit = 0;
		
		while(num != 0) {
			digit = num % 10;
			reverse = (reverse * 10) + digit;
			
			num = num/10;
			
		}
		//System.out.print(reverse);
		return reverse;
	}
	
	public static void main(String[] args) {
		
		int check = reverseDigit();
		System.out.println((check));
	}

}
