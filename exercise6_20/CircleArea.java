package exercise6_20;
import java.util.Scanner;

public class CircleArea {
	
	public static double isArea(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius value");
		int r = input.nextInt();
		double A ;
		
		 A =  Math.PI* Math.pow(r, 2.0);
		 
		 return A;
	}

	public static void main(String[] args) {
		double check = isArea();
		System.out.println((check));
		
		
	}
	

}
