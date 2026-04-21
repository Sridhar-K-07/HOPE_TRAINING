import java.util.*;
class Student{
    String name;
    Student (String name){
        this.name = name;
    }
}
public class ConsumerEg {
    public static void main(String[] args) {
        Consumer<Student> printString = s -> System.out.println(s.name);
        Consumer<Student> printName= s -> System.out.println("Student name is: " + s.name);
        printName.accept(new Student("John Doe"));
        printString.accept("From Consumer");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));
    }
    
}