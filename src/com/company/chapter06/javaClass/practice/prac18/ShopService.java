package com.company.chapter06.javaClass.practice.prac18;

class ShopService {
    private static ShopService singleton = new ShopService();

    public static ShopService getInstance() {
        return singleton;
    }
}
