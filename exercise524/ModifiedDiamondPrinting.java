package chapter5.exercise524;
import java.util.Scanner;
public class ModifiedDiamondPrinting {

	

		
			public int getDiamond() {
				
				int A = 11;
				int B = 1;
					
			
				Scanner input = new Scanner(System.in);
					int number = input.nextInt();
			
			
				for(int i = 1; i <= number; i++) {
					for(int j = A; j>=1; j--) {
					System.out.print(" ");
				}
				for(int x=1; x<=B; x++) {
					System.out.print("*");
				}
				
				if(i > (number/2)) { 
					A += 1;
					B -= 2;
				}
				else {
					A -= 1;
					B += 2;
				}
				System.out.println();
				
				
				
			}
				return B;
			} 
	
			public static void main(String[] args) {
				ModifiedDiamondPrinting obj = new ModifiedDiamondPrinting();
				obj.getDiamond();
			}

}


