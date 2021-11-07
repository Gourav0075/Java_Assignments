package LABIOBASIC;

import java.util.Scanner;

public class employee {
    String name;
    int age;
    float salary;
        void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name");
            this.name= sc.next();
            System.out.println("enter age");
            this.age=sc.nextInt();
            System.out.println("enter salary");
            this.salary= sc.nextFloat();
        }
        void check(){
            if (this.salary>20000)
            this.salary=this.salary+this.salary*0.10f;
            else
                this.salary=this.salary+this.salary*0.15f;
        }
        void display(){
            System.out.println("name : "+this.name);
            System.out.println("age : "+this.age);
            System.out.println("salary : "+this.salary);
        }
}
