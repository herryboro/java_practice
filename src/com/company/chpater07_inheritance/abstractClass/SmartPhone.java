package com.company.chpater07_inheritance.abstractClass;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
