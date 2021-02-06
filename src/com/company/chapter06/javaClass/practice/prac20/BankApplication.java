package com.company.chapter06.javaClass.practice.prac20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }


    // 계좌 생성하기
    private static void createAccount() {
        System.out.print("만드실 계좌번호: ");
        String ano = scanner.next();
        System.out.print("성함: ");
        String name = scanner.next();
        System.out.print("입금금액: ");
        int balance = scanner.nextInt();

        Account account = new Account(ano, name, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                break;
            }
        }

        // 작성위치
        System.out.println("-----------");
        System.out.println("계좌생성");
        System.out.println("-----------");
        System.out.println("계좌번호: " + account.getAno());
        System.out.println("계좌주: " + account.getOwner());
        System.out.println("초기 입금액: " + account.getBalance());
        System.out.println(account.getOwner() + " 님의 계좌가 생성되었습니다.");
        System.out.println();System.out.println();
    }

    // 계좌 목록보기
    private static void accountList() {
        // 작성위치
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");

        for (int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                System.out.println(accountArray[i].getAno() + "\t\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
            } else {
                break;
            }
        }
        System.out.println();
    }

    // 예금하기
    private static void deposit() {
        // 작성위치
        System.out.print("본인의 계좌번호를 입력해주세요: ");
        String myAno = scanner.next();
        System.out.print("입금 원하는 금액을 입력해주세요: ");
        int money = scanner.nextInt();

        Account myAccount = findAccount(myAno);

        if(myAccount != null) {
            myAccount.setBalance(money);
            System.out.println("결과: 예금이 성공하였습니다.");
        } else {
            System.out.println("계좌가 없습니다.");
        }
    }

    // 출금하기
    private static void withdraw() {
        // 작성위치
        System.out.print("본인의 계좌번호를 입력해주세요: ");
        String myAno = scanner.next();
        System.out.print("출금 원하는 금액을 입력해주세요: ");
        int money = scanner.nextInt();
        Account myAccount = findAccount(myAno);
        if (myAccount != null) {
            if(myAccount.getBalance() >= money) {
                System.out.println(money + "원이 출금되었습니다.");
                myAccount.setBalance(-money);
            } else if(myAccount.getBalance() < money) {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌가 없습니다.");
        }

    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {
        // 작성위치
        Account returnArray = null;
        for (int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)) {
                    returnArray = accountArray[i];
                    break;
                }
            }
        }
        return returnArray;
    }
}
