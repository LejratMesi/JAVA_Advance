package com.sda.lesson.three;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("studentet.txt");
        FileWriter out = new FileWriter("studentet_output.txt");
            //out.write('A');

        int nextChar;
        while ((nextChar = in.read()) != -1) {
            System.out.println("Charakteri i pare qe eshte lexuar eshte " + (char) nextChar);
            out.append((char) nextChar);
            System.out.println("pas shkrimit" +
                    "   ");
        }
        out.flush();
        out.close();
    }
}
