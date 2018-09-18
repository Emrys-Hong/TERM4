package com.example.libfibo;

public class CheckingAccount extends Account {

    public void withdraw(double money) {
        if (this.getBalance() < -5000) {
            System.out.print("over limit");
        } else {
            this.setBalance(this.getBalance()-money);
        }
    }
}
