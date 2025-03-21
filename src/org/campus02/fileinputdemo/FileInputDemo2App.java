package org.campus02.fileinputdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2App {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS25\\test.txt");
        while (!f.exists()) {
            // Validierung
            System.out.println("Gibt mir eine andere Datei!");
        }

        // try-with-ressources
        try (FileInputStream fis = new FileInputStream(f)){
            int byteRead = fis.read();
            System.out.println("byteRead = " + byteRead);
            byteRead = fis.read();
            System.out.println("byteRead = " + byteRead);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
