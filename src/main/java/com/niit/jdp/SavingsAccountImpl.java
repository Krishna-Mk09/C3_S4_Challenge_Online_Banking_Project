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
        SavingsAccount savingsAccount = new SavingsAccount("overseas", "hyderabad", "6347/3434/karimnagar", "ioba3322"
                , 131234345
                , "vamshi"
                , 5000.0
                , "active");
    }
}
