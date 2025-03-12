package org.campus02.file;

import java.io.File;

public class DemoFileApp {

    public static void main(String[] args) {

        //D:\temp\ETS25
        File f = new File("D:\\temp\\ETS25\\test.txt");

        System.out.println("f.length() = " + f.length());

        File dir = new File("D:\\temp\\ETS25\\");
        System.out.println("dir.length() = " + dir.length());

        for (File fd : dir.listFiles()) {
            System.out.println("f. = " + fd.getName() + ": " + fd.length());
        }

        long l = printAndGetSize(dir);
        System.out.println("l = " + l);
    }

    public static long printAndGetSize (File f) {

        if (f.isFile())
            return f.length();
        
        // else => Directory
        long length = 0;
        for (File fd : f.listFiles()) {
            length += printAndGetSize(fd);
        }
        
        return length;
    }
}
