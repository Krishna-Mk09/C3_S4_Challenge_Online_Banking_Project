/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccountImpl {
    /**
     * The above function is the main function which is used to create an object of the class SavingsAccount and to call
     * the methods of the class SavingsAccount.
     */
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("indianOverSeas", "karimnagar", "234/235/kmr", "ioba332201", "23/08/2022", "ofline", true, 1234455566, "M vamshi krishna", 50000.0, "Active");
        System.out.println(savingsAccount.getBankName());
        System.out.println(savingsAccount.getBranchName());
        System.out.println(savingsAccount.getAddress());
        savingsAccount.getIsfcCode();
        savingsAccount.getAccountOpeningDate();
        System.out.println(savingsAccount.getModeOfOperation());
        System.out.println(savingsAccount.getAccountNumber());
        System.out.println(savingsAccount.getAccountHoldersName());
        savingsAccount.getAccountBalance();
        System.out.println(savingsAccount.getAccountStatus());
        System.out.println("balance after debit : " + savingsAccount.debitCash(500.0));
        System.out.println("balance after credited : " + savingsAccount.creditCash(1000.0));
        System.out.println("your balance is : " + savingsAccount.retrieveBalance(savingsAccount.getAccountBalance()));
    }

}
