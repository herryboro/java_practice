package com.company.Exception.userDefinitionException;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        //예금하기
        account.deposit(10000);
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance() + "원");

        //출금하기
        try{
            account.withdraw(20001);
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
