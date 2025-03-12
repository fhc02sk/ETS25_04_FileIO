package org.campus02.fileoutputdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemoApp {

    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS25\\newfile.txt");

        try (FileOutputStream fos = new FileOutputStream(f)) {

            fos.write(72);
            fos.write(65);
            fos.write(76);
            fos.write(76);
            fos.write(79);
            fos.write(13); // CR
            fos.write(10); // LF
            fos.write(69);
            fos.write(84);
            fos.write(83);

            fos.flush();
            //fos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
