//NAme:Ajetunmobi Adam

import java.util.Scanner;

public class AccountTest{

    public static void main(String... agrs){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",account1.getnNme(), account1.getBalance());

        System.out.printf("%s balanc:  $%.2f%n%n", account2.getName, account2.getBalance());

        Scanner input = new Scanner(System.in);

    }
}