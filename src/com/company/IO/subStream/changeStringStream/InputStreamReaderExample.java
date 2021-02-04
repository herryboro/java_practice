package com.company.IO.subStream.changeStringStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);

        int readCharNo;
        char[] cbuf = new char[10];
        while ((readCharNo = reader.read(cbuf)) != -1) {
            System.out.println("readCharNo: " + readCharNo);
            String data = new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }
        reader.close();
    }
}
