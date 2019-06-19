package chapter5.exercise518;
import java.util.Scanner;
public class ModifyCompoundInterest {
			
		public void getCompoundInterest() {
			
			

			double rate = 1.05;
			int principal = 1000;
			int numberOfYears = 10;
			double pow = 1;
					
			double compoundInterest;
			

			
			for (int x = 1; x <= 1; x++) {
					
			for(int i = 1; i <= numberOfYears; i++) {
				pow = pow * rate;
		
			compoundInterest = principal * pow;
			System.out.printf("%,.2f%n", compoundInterest);
				if(i == numberOfYears)
					pow = 1;
			}
//			System.out.println();
//			rate += 0.01;
			}
		
			 
		 }

	



}

