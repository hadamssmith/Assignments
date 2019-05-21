// Name:Ajetunmobi Adam
// personal Trainig

import java.util.Scanner;

public class Addition{

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        int number1; // First number to Add
        int number2; //second number to add
        int sum; // sum of number1 and number2

        System.out.print("Enter the first number");//prompt
        number1= input.nextInt();

        System.out.print("Enter the second number");//prompt
        number2=input.nextInt();

        sum= number1 + number2; // add numbers

        System.out.printf("Sum is %d%n", sum);


    }// end method main
}//end class addition
