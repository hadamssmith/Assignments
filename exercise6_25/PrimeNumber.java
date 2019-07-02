package exercise6_25;

public class PrimeNumber {
		
		public static boolean findPrime(int number ) {
			
			int prime = 0, div = 0;
			boolean result = true;
//			 // divide number by 2
//			for(int n = 1; n <= number; n++) {

//				}
					div = number  / 2;
				
				
				for(int f = 2; f <= div; f++) 
				{
					if(number ==2 || number == 3) {
					div = number / 1;
						result = true;
					}
					 prime = number % f;
					 if(prime == 0 ) {
						 result = false;
						 break;
					 }
				}
				if (prime != 0)
//					System.out.print(n + "  ");
					result = true;
				
				return result;
			}	
						

		public static void primeRoot() {
			int range = 100;double root;
			int prime = 0;
			//double divide;
			for(int t = 1; t <= range; t++) {
				
				
				
//				if(t == 3 || t == 2) {
//					root = 4;
//				}
//				else
					root = Math.sqrt(t);
				
				for(int r = 2; r < root; r++) {
//					
//					
//					else 
						prime = t % r;
						
					if(prime == 0) {
						
						break;
					}
					
				}
				if(t == 2) {
					prime = 2;
				}
				if(t == 3) {
					prime = 3;
				}
				
				
				if (prime != 0 && findPrime(t) == true)
					System.out.print(t + " ");
				}
			}
			


		public static void main(String[] args) {

//				findPrime();
				primeRoot();
			
			

		}

	}


