package LABIOBASIC;

import java.io.*;

public class readContent  {
    static int count=0;
    public static void main(String[] args) throws IOException
    {
        FileInputStream f1= new FileInputStream("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\DAY17IO/f1.txt");
        FileInputStream f2= new FileInputStream("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\DAY17IO/f2.txt");
        FileOutputStream f3= new FileOutputStream("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\DAY17IO/f3.txt");

        int i;
        SequenceInputStream s=new SequenceInputStream(f1,f2);
        do
        {

            i=s.read();
            if(i!=-1) {
                f3.write(i);
                System.out.print((char)i);
                    count++;
            }

        }while(i!=-1);
        System.out.println("");
        System.out.println("the length of file is : "+count);
    }

}
