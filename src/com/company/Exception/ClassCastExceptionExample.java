package com.company.Exception;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        // Cat 객체를 Dog로 형변환 할 수 없으므로 ClassCastException 에러 발생
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            System.out.println(animal + " 객체 형변환 성공");
        }
    }
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}