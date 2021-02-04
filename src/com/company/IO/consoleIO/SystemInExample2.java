package com.company.IO.consoleIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {
    public static void main(String[] args) throws Exception {

        InputStream is = System.in;
        byte[] datas = new byte[100];

        System.out.print("이름: ");
        int nameBytes = is.read(datas);
        System.out.println("저장된 nameBytes 갯수: " + nameBytes);
        String name = new String(datas,0, nameBytes-1);

        System.out.print("하고 싶은말: ");
        int commentBytes = is.read(datas);
        System.out.println("저장된 commentBytes 갯수: " + commentBytes);
        String comment = new String(datas,0, nameBytes-1);

        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 하고싶은 말: " + comment);

        /*InputStream io = new FileInputStream("C:/c.txt");
        int readBytes;
        while ((readBytes=io.read()) != -1) {
            System.out.println((readBytes));
        }
        System.out.println(readBytes);*/

    }
}
