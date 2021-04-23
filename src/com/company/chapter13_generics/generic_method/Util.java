package com.company.chapter13_generics.generic_method;

import com.company.chapter13_generics.generic_type.Box;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
