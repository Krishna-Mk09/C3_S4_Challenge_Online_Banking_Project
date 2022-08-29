/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccount extends Bank {
    private long accountNumber;
    private String accountHoldersName;
    private double accountBalance;
    private String accountStatus;

    public SavingsAccount() {
    }

    public SavingsAccount(String bankName, String branchName, String address, String isfcCode, long accountNumber, String accountHoldersName, double accountBalance, String accountStatus) {
        super(bankName, branchName, address, isfcCode);
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;

    }

    public double creditCash(double cash) {

        double credit;
        return credit = accountBalance + cash;
    }

    public double debitCash(double cash) {

        double debit;
        return debit = accountBalance - cash;
    }

    public double retrieveBalance(double cash) {

        return accountBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHoldersName='" + accountHoldersName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}

