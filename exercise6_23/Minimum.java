package exercise6_23;

public class Minimum {
	
	public static int getMinimum(int num1, int num2, int num3 ) {
		int result ;
		result= Math.min(num1, Math.min(num2, num3));
	
		return result;
	}
	
	

}
