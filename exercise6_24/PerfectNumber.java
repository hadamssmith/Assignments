package exercise6_24;
//import java.util.Scanner;

public class PerfectNumber {
	
	public static boolean isPerfect(int num) {
		//Scanner input =  new Scanner(System.in);

		
		int result = 0;
		int mod = 1;
		boolean det = true;
		String store = "";
		
		for(int i = 1; i <= num; i++ ) {
			
			mod = num % i;
			if(mod == 0) {
				
				
				result += i;
				store = store + " " + i;
				
				//System.out.println(result);
			}
		}
			if(result == num) {
				det = true;
				System.out.printf("%s = %d%n",store,result);
				System.out.println();
			}else {
				det = false;
			}
			return det;
		}
		
	public static void displayPerfect() {
		for(int i = 1; i<= 1000; i++) {
			
			isPerfect(i);

		}
	}
	
	public static void main(String[] args) {
//		boolean check = isPerfect();
//		System.out.println((check));
		
		displayPerfect();
		
	} 

}
