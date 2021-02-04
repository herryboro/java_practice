package com.company.IO.consoleIO;

import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemOutExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        for (byte b = 48; b < 58; b++) {
            os.write(b);                    // write(byte[] b) 메서드는 매개변수로 받은 byte값의 아스키 코드를 콘솔에 출력한다.
        }
        os.write(10);                    // 라인피드 (다음행으로)

        for (byte b = 97; b < 123; b++) {
            os.write(b);
        }
        os.write(10);

        String hangul = "가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);
        os.write(10); os.write(10);
        os.flush();

        PrintStream ps = System.out;
        ps.println("안녕하세요.");
        System.out.println("안녕하세요.");
    }
}
