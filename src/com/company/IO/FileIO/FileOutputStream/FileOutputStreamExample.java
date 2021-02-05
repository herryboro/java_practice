package com.company.IO.FileIO.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String originalFileName = "C:/owner/20201020191346댕댕2.PNG";
        String targetFileName = "C:/Temp/house.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[10000];

        while ((readByteNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes,0, readByteNo);
        }
        System.out.println(readByteNo);
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("복사가 잘 되었습니다.");
    }
}
