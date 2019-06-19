package Exercise517;

import java.util.Scanner;
public class Sales {
	
	public static void main(String[] args) {
		
		double total =0;
		double qty = 0;
		int productNumber;
		int Sentinal = -1;
		double product1 = 2.98;
		double product2 = 4.50;
		double product3 = 9.98;
		double product4 = 4.49;
		double product5 = 6.87;		
		Scanner input = new Scanner (System.in);
		
		while (qty != -1) {
			
		System.out.print("Enter Product NO");
		  productNumber = input.nextInt();
		  
		System.out.print("Enter Qty NO");
		  qty = input.nextDouble();
		
		  
		  
		  double item1 =0;
		  double item2 =0;
		  double item3 =0;
		  double item4 =0;
		  double item5 =0;
		 	
		switch (productNumber) {
		
		case 1: 
				
			 item1 = product1 * qty + item1;
			 total = total +item1;
			 break;
		case 2:
			
			item2 = product2 * qty + item2;
			total = total +item2;
			break;
		case 3:
			
			item3 = product3 * qty + item3;
			total = total +item3;
			break;
		case 4:
			
			item4 = product4 * qty + item4;
			total = total +item4;
			break;
		case 5:
			
			item5 = product5 * qty + item5;
			total = total +item5;
			break;
		default:
			break;		
		
					
		}
		
	
		
		
		System.out.printf("%f ",total );
		 
		
		
	}


	}
	

		
	
}