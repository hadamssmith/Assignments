package exercise6_8;
import java.util.Scanner;
public class ParckingCharges {
	

	
	public static double calReceipt() {
		Scanner input = new Scanner(System.in);
		
		int numberOfCustomer;
		
		System.out.println("Input number of customer: ");
		numberOfCustomer = input.nextInt();
		
		double total = 0;
		double hours;
		
		for(int i = 1; i <= numberOfCustomer; i++) {
			System.out.println("Enter Number Of Hours Parked: ");
			hours=input.nextDouble();
			
			total += CalParckingCharges(hours);
			System.out.println(CalParckingCharges(hours));
		}
		return total;
		
	}
				
	public static double  CalParckingCharges(double hours) {
			
	double charge = 0;
		if(hours >= 1 && hours <= 3) {
			charge = 2.0;
		}
		else if(hours > 3 && hours < 19) {
			
			charge= (hours - 3) * 0.5 + 2.0;
		}
		else if (hours >= 19) {
			charge = 10;
		}
		return charge;
		
	
		
	}
	
	public static void main(String[] args) {
		
		System.out.printf("Total reciepts is: %.2f",calReceipt());
	}
		
		
}
	
	


