package com.company.chapter06.javaClass.practice.prac19;

public class Account {
    private int balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0 && balance <= 1000000) {
            this.balance = balance;
        } else if(balance < 0) {
            System.out.println("금액을 잘못 입력하셨습니다.");
        } else {
            System.out.println("100만원 이상 입금하실수 없습니다.");
        }
    }
}
