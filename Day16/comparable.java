import java.util.*;



class Student implements Comparable<Student>{
        String name;
        int mark;
        Student(String name,int mark){
            this.name=name;
            this.mark=mark;
        }

@Override
public int compareTo(Student s){
    return this.mark-s.mark; 
}
}

public class comparable{
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student("A",60));
         s.add(new Student("B",80));
          s.add(new Student("C",90));
          s.add(new Student("D",45));


    }
}