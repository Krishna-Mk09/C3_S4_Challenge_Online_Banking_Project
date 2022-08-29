/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public abstract class Bank {
    private String bankName;
    private String branchName;
    private String address;
    private String isfcCode;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean isMobileBankingEnabled;
    private long accountNumber;
    private String accountHoldersName;
    private double accountBalance;
    private String accountStatus;

    public Bank() {
    }

    public Bank(String bankName, String branchName, String address, String isfcCode, String accountOpeningDate, String modeOfOperation, boolean isMobileBankingEnabled, long accountNumber, String accountHoldersName, double accountBalance, String accountStatus) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.address = address;
        this.isfcCode = isfcCode;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.isMobileBankingEnabled = isMobileBankingEnabled;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsfcCode() {
        return isfcCode;
    }

    public void setIsfcCode(String isfcCode) {
        this.isfcCode = isfcCode;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isMobileBankingEnabled() {
        return isMobileBankingEnabled;
    }

    public void setMobileBankingEnabled(boolean mobileBankingEnabled) {
        isMobileBankingEnabled = mobileBankingEnabled;
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
}
