package chapter5.exercise524;

public class TobiDiamond {

	public static void main(String[] args) {
		
		int spaces = 9;
		int star = 1;
		int divisor = 9 / 2;
		
		for (int counter = 1; counter <= 9; counter++) {
			for(int i = spaces; i > 0; i--) {
				System.out.print(" ");
			}
			for(int s = star; s > 0; s--) {
				System.out.print("*");
			}
			System.out.println();
			
			if(counter > divisor) {
				spaces++;
				star-=2;		
			}
			else {
				star+=2;
				spaces--;
			}
			
			
			
			
			
			
			
			
//			star+=2;
//			spaces--;
		}
	}

}
