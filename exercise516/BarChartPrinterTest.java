package chapter5.exercise516;

	import java.util.Scanner;

	public class BarChartPrinterTest {
		
		int num;
		
		public void barChart() {
				for(int count = 1; count <= 5; count++) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter number");
				num = input.nextInt();				
				
				if(num <= 1 || num >= 30) {
					System.out.println("Invalid number! Try something on else between 1 and 30.");
					}
									
					for(int counter = 1; counter <= num; counter++) {
						System.out.print("*");								
					} System.out.println();
				
				}
							
		}
		
		public static void main(String[] args) {
			BarChartPrinterTest obj = new BarChartPrinterTest();
			obj.barChart();		
			
			
			
			
		}

	
	

	}
