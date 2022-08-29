/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccount extends Bank {


    public SavingsAccount() {
    }

    // This is a constructor.
    public SavingsAccount(String bankName, String branchName, String address, String isfcCode, String accountOpeningDate, String modeOfOperation, boolean isMobileBankingEnabled, long accountNumber, String accountHoldersName, double accountBalance, String accountStatus) {
        super(bankName, branchName, address, isfcCode, accountOpeningDate, modeOfOperation, isMobileBankingEnabled, accountNumber, accountHoldersName, accountBalance, accountStatus);
    }

    // The above code is a class called BankAccount. It is a subclass of the Account class. It has three methods:
    // creditCash, debitCash, and retrieveBalance.
    public double creditCash(double cash) {

        double credit;
        return credit = super.getAccountBalance() + cash;
    }

    public double debitCash(double cash) {

        double debit;
        return debit = super.getAccountBalance() - cash;
    }

    public double retrieveBalance(double cash) {

        return super.getAccountBalance();
    }

    // Overriding the toString() method of the Object class.
    @Override
    public String toString() {
        return "SavingsAccount{}";
    }
}

