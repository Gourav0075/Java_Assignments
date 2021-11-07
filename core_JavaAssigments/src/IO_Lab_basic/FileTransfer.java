package LABIOBASIC;
import java.io.*;
class Student implements Serializable {
    String name;
    Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("name : "+this.name);
    }
}
public class FileTransfer {


    public static void main(String[] args) throws Exception {
        Student obj=new Student("kiran");
    File obj1=new File("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\LABIOBASIC//file1.txt");
    FileOutputStream obj2=new FileOutputStream("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\LABIOBASIC//file1.txt");
    ObjectOutputStream obj3=new ObjectOutputStream(obj2);
    obj3.writeObject(obj);

        File obj4=new File("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\LABIOBASIC//file1.txt");

        Student obj5=new Student("rkk");

            FileInputStream obj6=new FileInputStream("E:\\CDAC NOTES\\OOPS JAVA\\java_noida\\DAY_PACKAGE_WISE\\src\\LABIOBASIC//file1.txt");
            ObjectInputStream obj7=new ObjectInputStream(obj6);
            obj=(Student)obj7.readObject();
            obj.display();



    }

}
