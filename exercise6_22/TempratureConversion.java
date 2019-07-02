package exercise6_22;
import java.util.Scanner;
public class TempratureConversion {
	static Scanner input = new Scanner(System.in);
	public static int getCelcius(int fahrenheit) {
		double celcius;
		
		
		celcius = 5.0/9.0 * (fahrenheit - 32);
		
		return (int) celcius;
	}
	public static int getFahrenheit(int celcius) {
		
		double fahrenheit;
		
		fahrenheit = 9.0 / 5.0 * celcius + 32;
		
		return (int) fahrenheit;
	}
	
	public static int displayTemp( int value, int correct) {
		
		int result = 0;
		// value = 0 ;
		
		if(correct == 1) {
			result = getCelcius(value);
			
		} if(correct == 2) {
			result = getFahrenheit(value);
		}
		return result;
	}

}
