package com.company.IO.subStream.increasePerform;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;

        FileInputStream fis1 = new FileInputStream("C:/owner/20201020191346댕댕2.PNG");
        start = System.currentTimeMillis();
        while (fis1.read() != -1) {}
        end = System.currentTimeMillis();
        System.out.println("사용하지 않았을때: " + (end - start) + "ms");
        fis1.close();

        FileInputStream fis2 = new FileInputStream("C:/owner/20201020191346댕댕2.PNG");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while (bis.read() != -1) {}
        end = System.currentTimeMillis();
        System.out.println("사용했을때: " + (end - start) + "ms");
        bis.close();
        fis2.close();
    }
}
