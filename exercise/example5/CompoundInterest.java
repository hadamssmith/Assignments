package chapter5.exercise.example5;
import java.util.Scanner;

public class CompoundInterest {

	
	public void getCompoundInterest() {
		

		double rate = 1.05;
		int principal = 1000;
		int numberOfYears = 10;
		double pow = 1.0;
				
		double compoundInterest;
		

		
		for (int x = 1; x <= 6; x++) {
				
		for(int i = 1; i <= numberOfYears; i++) {
			pow = pow * rate;
	
		compoundInterest = principal * pow;
		System.out.printf("%,.2f%n",compoundInterest);
			if(i == numberOfYears)
				pow = 1.0;
		}
		System.out.println();
		rate += 0.01;
		}
	
		 
	 }

}
