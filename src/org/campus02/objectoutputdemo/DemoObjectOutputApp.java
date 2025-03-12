package org.campus02.objectoutputdemo;

import java.io.*;
import java.util.ArrayList;

public class DemoObjectOutputApp {
    public static void main(String[] args) throws IOException {

        Person p = new Person("Susi", "Sorglos", 1);
        Person p2 = new Person("Max", "Mustermann", 2);

        FileOutputStream fos = new FileOutputStream("D:\\temp\\ETS25\\person.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fos);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(p);
        objectOutputStream.writeObject(p2);
        objectOutputStream.writeObject(null);

        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println("success");


    }
}
