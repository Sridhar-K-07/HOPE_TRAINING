class calculator{
    int add(int a,int b){
       return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    // int add(double a,double b){
    //     return (int)a+b;
    // }
}
public class polymorphism {
    public static void main(String[] args) {

        calculator c=new calculator();
       System.out.println(c.add(5,10));
        System.out.println(c.add(5.0,10.0));
        System.out.println(c.add(1,2,3));
       System.out.println( c.add(1.0,2));
    }
}
