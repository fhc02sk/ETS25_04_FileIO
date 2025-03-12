package org.campus02.filereaderdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoApp {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\Temp\\ETS25\\dokumente\\er hörte leise.txt")))
        {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("line = " + line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
