package LABIOBASIC;

import java.io.*;
public class FileProperties {

    public static void main(String[] args) {
        File f= new File("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY WISE\\IO FILE/demo.txt");
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.length());
        System.out.println(f.lastModified());

    }

}
