package chapter5.exercise524;
//import java.util.Scanner;
public class Diamond {
	
	public int getDiamond() {
		
		int A = 11;
		int B = 1;
			
		
//		Scanner input = new Scanner(System.in);
//			int number = input.nextInt();
	
	
		for(int i = 1; i <= 9; i++) {
			for(int j = A; j>=1; j--) {
			System.out.print(" ");
		}
		for(int x=1; x<=B; x++) {
			System.out.print("*");
		}
		
		if(i > (9/2)) { 
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
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int A = 5;
//	int B = 5;
//	int C = 5;
//	int D = 10;
//	
//	public void getDiamond() {
//	for(int counter = 1; counter <=5; counter++) {
//		for(int a = A; a > 0; a--) {
//			System.out.print(" ");
//		}
//		for(int i = counter; i <= 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int counter = 1; counter <= 4; counter--) {
//		for(int c = C; c >= 1; c++) {
//			System.out.print(" ");
//		}
//		for(int i = counter; i <= counter; i=-2) {
//			System.out.print("*");
//		}
//	}
		
		
	}



