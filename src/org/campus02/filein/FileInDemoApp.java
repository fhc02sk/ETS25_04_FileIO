package org.campus02.filein;

import org.campus02.fileinputdemo.FileInputDemoApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInDemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS25\\bilder\\ets.jpg");

        try (FileInputStream fis = new FileInputStream(f)) {

            int counter = 0;
            int byteRead = 0;

            while ((byteRead = fis.read()) != -1) {
                counter++;
                char c = (char) byteRead;
                System.out.print(c);
            }
            System.out.println("counter = " + counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
