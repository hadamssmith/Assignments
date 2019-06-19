package chapter5.exercise518;
import java.util.Scanner;

public class CompoundInterestDollarCent {
			
		public void getCompoundInterest() {
			
			double rate = 1.05;
			int principal = 1000 * 100;
			int numberOfYears = 10;
			double pow = 1.0;
					
			double compoundInterest;
						
			for (int x = 1; x <= 1; x++) {
					
			for(int i = 1; i <= numberOfYears; i++) {
				pow = pow * rate;
		
			compoundInterest = principal * pow;
			int dollar = (int)compoundInterest / 100;
			int cents = (int)compoundInterest % 100;
			System.out.printf("%,d.%d%n", dollar, cents);
				if(i == numberOfYears)
					pow = 1;
			}
//			System.out.println();
//			rate += 0.01;
			}
		
			 
		 }

	

}

