package com.company.chpater07_inheritance.abstractClass;

public abstract class Animal {
    public String kind;

    public void breath() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();   // 추상 메서드는 추상 클래스에서만 선언할 수 있다.
                                    // 이 경우 자식 클래스에서는 반드시 메서드 오버라이딩을 해야 된다.( 안하면 컴파일 에러 발생 )
}
