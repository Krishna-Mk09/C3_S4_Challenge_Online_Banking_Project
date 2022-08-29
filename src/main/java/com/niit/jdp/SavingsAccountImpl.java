/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        Bank bank = new Bank("indian OverSeas Bank", "karimnagar", "253/633/hyderabad", "ioba332255");
        SavingsAccount savingsAccount = new SavingsAccount("overseas", "hyderabad", "6347/3434/karimnagar", "ioba3322", 131234345, "vamshi", 5000.0, "active");
        System.out.println(savingsAccount);
        System.out.println(bank.getBankName());
        System.out.println(bank.getAddress());
        System.out.println(bank.getBranchName());
        System.out.println(bank.getIsfcCode());
        System.out.println(savingsAccount.getAccountBalance());
        System.out.println(savingsAccount.getAccountNumber());
        System.out.println(savingsAccount.getAccountHoldersName());
        System.out.println("balance after debit : " + savingsAccount.debitCash(500.0));
        System.out.println("balance after credited : " + savingsAccount.creditCash(1000.0));
        System.out.println("your balance is : " + savingsAccount.retrieveBalance(savingsAccount.getAccountBalance()));
    }

}
