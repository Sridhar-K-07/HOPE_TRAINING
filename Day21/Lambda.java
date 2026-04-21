
@FunctionalInterface
interface Math {
     int add(int a,int b);   
}

@FunctionalInterface
interface Exercise{
    void sayHello();
}

public class Lambda {
    public static void main(String[] args) {
        Math obj=(a,b)->a+b;
        Exercise obj1=()->System.out.println("Sayhello");
        obj1.sayHello();
        
        /*
        Math m=new Math()
           @Override
           public int add(int a,int b)
               return a+b;
         */

               System.out.println(obj.add(11,22));
    }
}
