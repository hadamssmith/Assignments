package exercise6_15;
import java.util.Scanner;

public class Hypothenus {
	
	
	public static double hypothenus() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Side 1: ");
		double side1 = input.nextDouble();
		
		System.out.println("Enter Side 2: ");
		double side2 = input.nextDouble();
		
		double c;
		
		c = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
		
		
		return c;
	} 
	
	public static void main(String[] args) {
		
		double cal = hypothenus();
		System.out.printf("%s%f", "The Hypothenus Value Is: ", (cal));
	}
	
	

}
