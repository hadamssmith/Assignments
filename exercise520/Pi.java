package Exercise520;
import java.util.Scanner;

public class Pi {
	
	public void calPi() {
		
		Scanner input = new Scanner(System.in);
		int j =  -1;
		double store = 0.0;
		int number =0;
		
		System.out.print("Enter Number of times to iterate: ");
		number = input.nextInt();
		
		for(double i =1; i <= number; i+=2) {
			j*=-1;
			store+=(4/i)*j;
			
			System.out.println( store);
			if(store == 3.14259) {
				System.out.print(i);
			}
		}
		input.close();
	}
	
	public static void main(String[] args) {
		Pi obj = new Pi();
		obj.calPi();
		
	
	}
	
	
}
