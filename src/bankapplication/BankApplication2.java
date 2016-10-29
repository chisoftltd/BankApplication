/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class BankApplication2 {
    
    private static double balance;
    private static String acctName;
    private static int answer;
    private static int amtWithdraw;
    private static int amtDeposit;
    
    public static void main(String[] args) {
        
        balance = Double.parseDouble(JOptionPane.showInputDialog("Enter the initial balance of the account in pounds: "));
        acctName = JOptionPane.showInputDialog("Enetr account holder");
        
        Account account = new Account(balance, acctName);
        
        do {
            answer = Integer.parseInt(JOptionPane.showInputDialog("Your current balance"
                    + "is " + account.getBalance() + "\n" + "Please choose one of the following options:\n"
                    + "1 - Deposit\n2 - Withdraw\n3 - Display Balance\n0 - Quit"));
            
            switch (answer) {
                case 1:
                    amtDeposit = Integer.parseInt(JOptionPane.showInputDialog("DEPOSIT\nEnter amount: "));
                    account.deposit(amtDeposit);
                    JOptionPane.showMessageDialog(null, "Account held by "+account.getName()+ " has balance" + account.getBalance());
                    break;
                
                case 2:
                    amtWithdraw = Integer.parseInt(JOptionPane.showInputDialog("WITHDRAWAL\nEnter amount: "));
                    account.withdraw(amtWithdraw);
                    JOptionPane.showMessageDialog(null, "Account held by "+account.getName()+ " has balance" + account.getBalance());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Account held by "+account.getName()+ " has balance" + account.getBalance());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Bye", "Thanks for using my appilcation\n BENJAMIN", JOptionPane.CLOSED_OPTION);
            }
        } while (answer != 0);
        
    }
}
