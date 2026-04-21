import java.io.*;

class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
public class Serialization  {
    public static void main(String[] args) throws IOException {
        Student s=new Student("Balamurugan",19);
        FileOutputStream fo=new FileOutputStream("Student.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fo);
        obj.writeObject(s);
        obj.close();
    }
}