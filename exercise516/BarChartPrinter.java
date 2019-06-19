package chapter5.exercise516;

import java.util.Scanner;

public class BarChartPrinter {
	
	int dami;
	int segun;
	int olu;
	int ade;
	int ola;
	int num;
	
	public void barChart() {
			for(int count = 1; count <= 5; count++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number");
			int collect = input.nextInt();
			
			num = collect;
			
			if(num > 30) {
				System.out.println("Invalid number! Try something on or below 30.");
			}
			for(int i = 1; i <= num; i++) {
				for(int x = i; x >= 0; x--) {
					System.out.print("*");
				}
			}
		}
		//return num;
	}
	//System.out.print(num);
	

	public static void main(String[] args) {
		BarChartPrinter obj = new BarChartPrinter();
		obj.barChart();		
		
		
		
		
	}

}
