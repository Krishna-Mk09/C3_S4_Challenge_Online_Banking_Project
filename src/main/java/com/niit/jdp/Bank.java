/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

/**
 * This class is an abstract class that contains the details of a bank account
 */
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

    // A default constructor.
    public Bank() {
    }

    // This is a constructor.
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

    /**
     * This function returns the name of the bank
     *
     * @return The bank name.
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This function sets the bank name
     *
     * @param bankName The name of the bank.
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // This is a getter and setter method.
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    // This is a getter and setter method.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * > This function returns the isfcCode of the object
     *
     * @return The isfcCode variable is being returned.
     */
    public String getIsfcCode() {
        return isfcCode;
    }

    /**
     * > This function sets the isfcCode variable to the value of the isfcCode parameter
     *
     * @param isfcCode The ISFC code of the bank.
     */
    public void setIsfcCode(String isfcCode) {
        this.isfcCode = isfcCode;
    }

    /**
     * This function returns the account opening date
     *
     * @return The accountOpeningDate variable is being returned.
     */
    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    /**
     * This function sets the account opening date of the account
     *
     * @param accountOpeningDate The date the account was opened.
     */
    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    /**
     * This function returns the mode of operation of the vehicle
     *
     * @return The mode of operation of the vehicle.
     */
    public String getModeOfOperation() {
        return modeOfOperation;
    }

    /**
     * This function sets the mode of operation of the class
     *
     * @param modeOfOperation This is the mode of operation of the cipher. It can be either ECB or CBC.
     */
    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    // This is a getter and setter method.
    public boolean isMobileBankingEnabled() {
        return isMobileBankingEnabled;
    }

    public void setMobileBankingEnabled(boolean mobileBankingEnabled) {
        isMobileBankingEnabled = mobileBankingEnabled;
    }

    // This is a getter and setter method.
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // This is a getter and setter method.
    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }

    // This is a getter and setter method.
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // This is a getter and setter method.
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
