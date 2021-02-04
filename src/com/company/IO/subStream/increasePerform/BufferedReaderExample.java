package com.company.IO.subStream.increasePerform;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        System.out.print("입력: ");
        String lineString = br.readLine();
        System.out.println("출력: " + lineString);
    }
}
