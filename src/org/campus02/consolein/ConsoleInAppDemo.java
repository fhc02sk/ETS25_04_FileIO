package org.campus02.consolein;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleInAppDemo {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("D:\\Temp\\ETS25\\console.txt")){
            char c = 0;
            while ((c = (char) System.in.read()) != 'x') {
                System.out.print(c);
                fos.write(c);
            }
            fos.flush();
            System.out.println("Es kam ein x");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }


}
