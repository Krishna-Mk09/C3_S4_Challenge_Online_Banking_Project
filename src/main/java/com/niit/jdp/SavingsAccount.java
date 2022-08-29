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
}
