package com.company.IO.subStream.increasePerform;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = 0;
        long start = 0;
        long end = 0;

        fis = new FileInputStream("C:/owner/20201020191346댕댕2.PNG");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Temp/dog.jpg");
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            System.out.println("반복문 안: " + data);
            fos.write(data);
        }
        System.out.println("반복문 밖: " + data);
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("사용하지 않았을때: " + (end - start) + "ms");

        fis = new FileInputStream("C:/owner/20201020191346댕댕2.PNG");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Temp/dog2.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close(); fos.close(); bis.close(); fis.close();
        System.out.println("사용했을때 : " + (end - start) + "ms");
    }
}
