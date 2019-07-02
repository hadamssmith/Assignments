package exercise6_29;
import java.security.SecureRandom;

public class CoinTossing {
	
	private static enum Coin{Head,Tail };
	static SecureRandom random = new SecureRandom();
	
	public static void tossCoin(int numOfFlip) {
		int coin;
		int tail = 1;
		int head = 1;
		
		
		for(int i = 1; i<= numOfFlip; i++) {
			
			coin = random.nextInt(2);
			if(coin == 0) {
				tail++;
			}
			else
				if(coin == 1) {
					head++;
				}
		}
		System.out.printf("Head:%s%d Tail: %d, Flip: %s",head,tail,coinFlip());
	}
	
	public static Coin coinFlip() {
		int spin;
		
		Coin roll = Coin.Head;
		
		spin = random.nextInt(2);
		if(spin == 0) {
			
			roll = Coin.Head;
			
		}
		else
			if(spin == 1) {
				 roll = Coin.Tail;
			}
		return roll;
		
		
	}

	
}
