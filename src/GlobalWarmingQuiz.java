package exercise531;

import java.util.Scanner;

public class GlobalWarmingQuiz {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int quiz = 1;
		int pass = 0;
		Scanner input = new Scanner(System.in);
		
		while(counter < 5) {
			switch(quiz) {
			case 1: 
				System.out.println("Question 1: Which of the following human activities does NOT release carbon dioxide into the atmosphere?\r\n" + 
						"1. burning fossil fuels\r\n" + 
						"2. fishing \r\n" + 
						"3. deforestation\r\n" + 
						"4. driving");
				System.out.println("Enter answer1: ");
				int answer1 = input.nextInt();
				if(answer1==2) {
					pass++;
				}
				counter++;
				
			case 2:
				System.out.println("Question 2: As air pollution continues to be released into the atmosphere, what becomes more depleted, resulting in an increase of ultraviolet radiation on earth?\r\n" + 
						"1. oceans\r\n" + 
						"2. rainforests\r\n" + 
						"3. ozone layer \r\n" + 
						"4. carbon dioxide");
				System.out.println("Enter answer2: ");
				int answer2 = input.nextInt();
				if(answer2==3) {
					pass++;
				}
				counter++;
				
			case 3:
				System.out.println("As carbon dioxide emissions increase, the ocean's ability to absorb carbon dioxide declines, resulting in a more acidic ocean. What species is the most at risk in acidic water?\r\n" + 
						"1. coral \r\n" + 
						"2. plankton\r\n" + 
						"3. fish\r\n" + 
						"4. whale");
				System.out.println("Enter answer3: ");
				int answer3 = input.nextInt();
				if(answer3==1) {
					pass++;
				}
				counter++;
				
			case 4:
				System.out.println("What percentage of carbon dioxide that is emitted into the atmosphere is absorbed by the ocean?\r\n" + 
						"40\r\n" + 
						"35\r\n" + 
						"70\r\n" + 
						"50");
				System.out.println("Enter answer4: ");
				int answer4 = input.nextInt();
				if(answer4==4) {
					pass++;
				}
				counter++;
				
			case 5:
				System.out.println("Question 5: Which of the following is a greenhouse gas that is released by human activities and speeds up global warming?\r\n" + 
						"1. petroleum\r\n" + 
						"2. natural gas\r\n" + 
						"3. carbon dioxide\r\n" + 
						"4. nuclear power\r\n" + 
						"");
				System.out.println("Enter answer5: ");
				int answer5 = input.nextInt();
				if(answer5==3) {
					pass++;
				}
				counter++;
				break;
			}
			System.out.println("Your score is: " + pass);
			if(pass==5) {
				System.out.println("Excellent");
			}
				else
					if(pass==4) {
						System.out.println("Very Good");
					}
					else
						System.out.println("Time to brush up on your knowledge of global warming,");
			
		}
		System.out.println("");
	}

}
