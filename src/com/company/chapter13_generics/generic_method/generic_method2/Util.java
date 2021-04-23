package com.company.chapter13_generics.generic_method.generic_method2;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        System.out.println("compare p1.getKey; " + p1.getKey());
        System.out.println("compare p2.getKey; " + p2.getKey());
        System.out.println("compare p1.getValue; " + p1.getValue());
        System.out.println("compare p2.getValue; " + p2.getValue());
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare && valueCompare;
    }
}
