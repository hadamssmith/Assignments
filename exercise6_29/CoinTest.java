package exercise6_29;
import java.util.Scanner;

public class CoinTest {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
	//System.out.println("Input The Number Of Times The Coin Shouls Roll: " );
	
		System.out.println("Input Number Of Times");
		int num = input.nextInt();
		
		CoinTossing.tossCoin(num);
	}

}
