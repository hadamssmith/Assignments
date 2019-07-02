package exercise6_21;

//import java.util.Scanner;
public class SeparatingDigit {
	
	public static int getInteger(int num1, int num2){
		int result;
		
		result = (num1/num2);
		
		
		return result;
	}
	
	public static int calRemainder(int num1,int num2) {
		int result;
		
		result = (num1 % num2);
		
		return result;
	}
	
	public static String displayDigit( int number ) {
		
		String space = "  ";
		int digit = 0;
		
		while(number != 0) {
			digit = calRemainder(number,10);
			space = digit + "  " + space;
			//getInteger(number, 10);
			number /= 10;
			
			
			
		}
		return space;
		
	}

}
