package chapter5.excersice521;

public class PythagoreanTriple {

	public static void main(String[] args) {
		
		
		
		for(int i = 1; i <= 500; i++) {
			for(int a = 1; a > 0; a++) {
				for(int b = a; b > 0; b++) {
					for(int c = b; c > 0; c++) {
						int a2 = a * a;
						int b2 = b * b;
						
						int a2b2 = a2 + b2;
						
						int c2 = c * c;
												
						if(a2b2 == c2) {
							System.out.printf("%d\t%d\t%s%d\t%s%n", a2, b2, "& ", c2, " are Pythagorean triple.");
						}
					}
						
				}
			}
		}
	}

}
