package com.designpatterns.proxy.bankexample;

public class Bank implements IBank {
    @Override
    public boolean pay(Integer amount) {
        if (amount < 100) {
            System.out.println(String.format("Amount can not be lower than 100. %s amount needed.", (100 - amount)));
        } else if (amount > 100) {
            System.out.println(String.format("Amount can not be more than 100. %s amount needed.", (amount - 100)));
        } else {
            System.out.println("Payment is Succesful.💸");
            return true;
        }
        return false;
    }
}
