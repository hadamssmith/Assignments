package exercise6_27;

public class GreatestCommonDivisor{
	
	public static int gcd(int num1, int num2) {
	
		int result = 1 ;
		if(num1 > num2) {
			result=num1 % num2;
		}
		
		else 
			if(num2 > num1){
				result = num2 % num1;
			}
		while(result > 0) {
			num1 =num2;
			num2 = result;
			result = num1 % num2;
			
			
		}
		return num2;
	}

}
