package com.company.IO.FileIO.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "E:/programmig/this_is_java/src/com/company/IO/FileIO/FileInputStream/FileInputStreamExample.java"
            );
            int data;
            while((data = fis.read()) != -1) {
                System.out.write(data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
