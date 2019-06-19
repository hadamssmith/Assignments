package chapter5.exercise515;


	public class TrianglePrinter {
		
		public static void main(String[] args) {
		
		
			for(int counter = 1; counter <10; counter++) {
				
				for(int i = counter; i > 0; i--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println();			
		
			for(int counter = 10; counter >=1; counter--) {
				
				for(int i = counter; i > 0; i--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
			
			
			for(int counter = 10; counter >=1; counter--) {
				for (int x = counter - 8; x <= 1; x++) {
					System.out.print(' ');
					}
				for(int i = counter; i > 0; i--) {						
				
				System.out.print("*");
			}
				System.out.println();
			}
			System.out.println();
			
			
			for(int counter = 1; counter <= 10; counter++) {
				for (int x = 10 - counter; x >= 1; x--) {
				System.out.print(' ');
					}
				for(int i = counter; i > 0; i--) {						
				System.out.print("*");
				}
				System.out.println();
			}
	//			}
		}
	}
	