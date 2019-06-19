package chapter5.exercise517;

import java.util.Scanner;

public class SalesCalculator {

	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	double total = 0;
	int sentinel = -1;
	double product1 = 2.98;
	double product2 = 4.50;
	double product3 = 9.98;
	double product4 = 4.49;
	double product5 = 6.87;
	
	int productNumber = 0;
	int quantity = 0;
		
	double item1 = 0.0;
	double item2 = 0.0;
	double item3 = 0.0;
	double item4 = 0.0;
	double item5 = 0.0;
	
	System.out.println("Type '-1' to end the streak");
	
	while(quantity != sentinel) {
		
		System.out.print("Enter product number:");
		productNumber = input.nextInt();
		
		System.out.print("Enter quantity:");
		quantity = input.nextInt();
		
	switch(productNumber) {
		case 1:
			item1 = product1 * quantity + item1;
			break;
		case 2:
			item2 = product2 * quantity + item2;
			break;
		case 3:
			item3 = product3 * quantity + item3;
			break;
		case 4:
			item4 = product4 * quantity + item4;
			break;
		case 5:
			item5 = product5 * quantity + item5;
			break;
	}
	//System.out.print("Enter sentinel: ");
	//sentinel = input.nextInt();
	
	}
	total = item1 + item2 + item3 + item4 + item5;
	
	System.out.print(total);
		
	
	
}
}
