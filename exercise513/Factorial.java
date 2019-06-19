package chapter5.exercise513;
import java.util.Scanner;

public class Factorial {
	
	public void calcFactorial(){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	long number = input.nextLong();
	
	System.out.printf("%s\t%s\n", "Count", "Factorial");

	
	long result = 1;
	
	for(long count = 1; count <= number; count++) {
		result = result * count;
		System.out.printf("%d\t%d\n",count, result);		
	}
	
	}

}
