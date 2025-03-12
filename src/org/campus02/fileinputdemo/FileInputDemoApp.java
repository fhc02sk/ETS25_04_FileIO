package org.campus02.fileinputdemo;

import java.io.*;

public class FileInputDemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS25\\test.txt");
        while (!f.exists()) {
            // Validierung
            System.out.println("Gibt mir eine andere Datei!");
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);

            BufferedInputStream bis = new BufferedInputStream(fis);

            int byteRead = bis.read();
            System.out.println("byteRead = " + byteRead);
            byteRead = bis.read();
            System.out.println("byteRead = " + byteRead);
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
