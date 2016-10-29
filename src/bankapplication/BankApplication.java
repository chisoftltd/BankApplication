/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class BankApplication {

    private static double cash;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account1;
        account1 = new Account(1000.00, "Account01");

        Account account2;
        account2 = new Account("Scarlett");

        //account2 = account1;
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        double amount = 200.0;
        account1.transfer(amount, account2);

        cash = account2.close();

        account2 = null;

        Account account3 = new Account(cash, "Eva");

        System.out.println(account3.toString());

        System.out.println("Enter amount to withdraw");
        amount = new Scanner(System.in).nextDouble();

        if (account3.hasSufficientFunds(amount)) {
            System.out.println("You can make a withdraw");
            account3.withdraw(amount);
            System.out.println("Your balnce is : " + account3.getBalance());
        } else {
            System.out.println("Sorry not funded!");
            System.out.println("Your balnce is : " + account3.getBalance());
        }
    }

}
