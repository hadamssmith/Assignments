package chapter5.excersice521;

public class Pythagorean {

	public static void main(String[] args) {
		
		double pii = 4;
		double k = -1;
		
		for(double i = 1; i <= 200; i++) {
			
			pii = pii + Math.pow(k, i) *( 4/((2*i) + 1));
			System.out.printf("%.1f \t %f%n",i, pii);
		}
	}

}
