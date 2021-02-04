package com.company.IO.subStream.changeStringStream;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/a.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환ㅇ";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다.");
    }
}
