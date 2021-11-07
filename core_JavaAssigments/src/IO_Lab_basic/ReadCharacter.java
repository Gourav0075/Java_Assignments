package LABIOBASIC;

import java.io.*;
import java.util.*;

public class ReadCharacter {

    void display(){

    }

    public static void main(String[] args) throws Exception
    {

        System.out.println("enter character");
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis= new DataInputStream(System.in);
        char c;
        dis.readFloat();
        do	{
            c= (char)dis.read();
            System.out.println(c);

        }
        while(c!='q');
    }

}
