package exercise6_22;
import java.util.Scanner;

public class TempratureTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 To convert Fahrenheit, Enter 2 to convert Celcius");
		int number = input.nextInt();
		
		System.out.println("Enter 1 To convert Fahrenheit, Enter 2 to convert Celcius");
		int correct = input.nextInt();
		System.out.println(TempratureConversion.displayTemp(number,correct));
		
	}

}
