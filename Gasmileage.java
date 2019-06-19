package chapter4.exercise417;

import java.util.Scanner;

public class Gasmileage {
	public double calculateGasMileage() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers of trip");
		int trip = input.nextInt();
		
		int miles = 0;
		int gallon = 0;
		double milesPerGallon = 0;
		double total = 0;
		double average = 0.0;
		int counter = 1;
		while(counter < trip) {
			System.out.println("Enter miles");
			 miles = input.nextInt();
			System.out.println("Enter gallon used");
			 gallon = input.nextInt();
			milesPerGallon= miles/gallon;
			System.out.println("trip" + counter + "=" + milesPerGallon);
			counter++; 
		}
				
				
		if (trip != 0){
		    //double average = (double) total / trip;
			average =  total/trip;
			//return average;
	

		    System.out.printf("%n Total of %d grade entered is %d%n", 
		       trip, total);
		    System.out.printf("Class average is %.2f%n", average);
		        }
		        else
		        System.out.println("No grade were entered");

		
	
	}
	
	
		
		

}
