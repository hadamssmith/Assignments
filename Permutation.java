/**
 * 
 * permutation
 */

 import java.util.Scanner;

 public class Permutation{

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter first number");
        int firstInput = input.nextInt();

        System.out.println("Enter second number");
        int secondInput = input.nextInt();

        int number1 = firstInput;
        int number2 = secondInput;
        int perm;


        int fact = number1;
        for(int i = 1; i < number1; i++) {
            int c = number1 - i;
            fact *=c;

        }
        
        int number3 = number1 -number2;
        perm = number3;
        for(int b = 1; b < number3; b++){
            int f =number3 - b;
            perm *= f;
        }

        int result = fact/perm;

        System.out.println("The permutation of"+number1+" and "+number2+" = "+ result);

        //input close
        

    }
 }