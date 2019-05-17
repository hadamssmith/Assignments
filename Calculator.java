//calculator

import java.util.Scanner;
public class Calculator{
    public static void main(String... args){
         int num1;
         int num2;
         String operation;
        Scanner s = new Scanner(System.in);   
        System.out.println("Enter first number");
         num1 = s.nextInt();
        System.out.println("Enter second number");
        num2 = s.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter the operation");
        operation = op.next();

    
if( operation.equals ("+")){
    System.out.println("The Total is "+(num1+num2));

}
else
if(operation.equals ("-")){
    System.out.println("The Total is "+(num1-num2));
}
else if (operation.equals ("*")){
    System.out.println("The Total is "+(num1*num2));
}
else if (operation.equals("/")){
    System.out.println("The Total is "+(num1/num2));    
}
else if (operation.equals("%")){
    System.out.println("The Total is "+(num1%num2));
}

      
    
    

    


    


    }
   
}

