package Exercise521;

public class PythagoreanTriples {
	public static void main(String[] args) {
		for (int j = 1; j<=500; j++) {
			for(int i = 1; i<=500; i++) {
				for(int m = 1; m<=500; m++) {
					if((j*j)+(i*i)==(m*m)){
						if(j>i) {
						System.out.println(j +"           "+ i +"           "+ m);
						}
					}
					
				}
				
			}
		}
	}

}
