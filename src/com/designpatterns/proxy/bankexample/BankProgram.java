package com.designpatterns.proxy.bankexample;

public class BankProgram {
    public static void main (String[] args) {
        String username = "cypriotperson";
        String password = "1234";

        IBank bank = new ProxyBank(username, password);
        bank.pay(100);
    }
}
