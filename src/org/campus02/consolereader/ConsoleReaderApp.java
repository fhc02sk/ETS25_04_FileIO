package org.campus02.consolereader;

import java.io.*;

public class ConsoleReaderApp {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter("D:\\Temp\\ETS25\\noten.txt"))
            ) {

            String line;
            while (!(line = br.readLine()).equals("STOP")){
                pw.println(line);
                pw.flush();
            }

            pw.flush();
            System.out.println("exit");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
