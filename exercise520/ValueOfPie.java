package chapter5.exercise520;

public class ValueOfPie {

	public static void main(String[] args) {
		int A = 1;
		int k = -4;
		int c = -1;
		System.out.printf("%s\t%s%n", "S/N", "Value");
		for(int i = 1; i <= 3; i++) {
			for(int a = A; a <= 4; a+=1) {
			double pie = (k / A)*c;
			
			System.out.printf("%d\t%,.5f%n", i, pie);
//			if(pie == 3.14159) {
//				System.out.printf("%s%d", "Pie hit 3.14159 at ", i);
			
			}
			
		}
		
	}

}
