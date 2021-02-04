package com.company.Exception;

import java.io.FileInputStream;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            // AutoCloseable 인터페이스를 구현한 FileInputStrem 클래스의 read() 메서드를 실행하면
            // read() 동작 후 자동으로 override된 close 메서드가 실행된다.
            fis.read();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        } finally {
            System.out.println("OK");
        }
    }
}
