/*
 * Author Name : M.Krishna.
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class Bank {
    private String bankName;
    private String branchName;
    private String address;
    private String isfcCode;

    public Bank() {
    }

    public Bank(String bankName, String branchName, String address, String isfcCode) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.address = address;
        this.isfcCode = isfcCode;
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
}
