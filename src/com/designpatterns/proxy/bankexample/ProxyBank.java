package com.designpatterns.proxy.bankexample;

public class ProxyBank implements IBank{
    private Bank bank;
    boolean isLoginValid;
    String username, password;

    public ProxyBank(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean logIn(){

        if (username == "cypriotperson" && password == "1234"){
            bank = new Bank();
            System.out.println("Logged in to your account.");
            return true;
        } else {
            System.out.println("Please enter your credentials with caution. They are not correct.");
            return false;
        }
    }

    @Override
    public boolean pay(Integer amount) {
        isLoginValid = logIn();

        if (!isLoginValid){
            System.out.println("Sorry to proceed your process. Cause there is a problem with your username and password.");
            return false;
        }

        bank.pay(amount);
        return true;
    }
}
