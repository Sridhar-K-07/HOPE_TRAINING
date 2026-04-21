import java.util.function.Predicate;
class Student{
    int mark;
    Student (int mark){
        this.mark = mark;
    }
}
public class prediateEg {
    public static void main(String[] args) {
        // Predicate<Integer> isEven = new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer n) {
        //         return n % 2 == 0;
        //     }
        // };
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(99999));
        Predicate<Student> isPass = s -> s.mark >= 40;
    
    }
}