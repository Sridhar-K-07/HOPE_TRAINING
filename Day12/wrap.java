package Day12;


public class wrap {

    public static Integer test1(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args){
       

        Integer i=20;
        i=30;
        System.out.println(i);
    }
}


/*
 


  Integer b=Integer.valueOf(10);
         Integer c=Integer.valueOf("2233"); //return type->object
         Integer d=Integer.parseInt("012233");  //return type->int(int)
         
         int a=b.intValue(); //Unboxing;
         Integer c=200;
         Integer d=200;
        System.out.println(b+" " +(c==d));
        System.out.println((c.equals(d)));
        System.out.println(test1("123"));

        wrapper class
 object that represent primitive data type

 Unboxing-Integer to int
 Intger range from -128 to 127 does not create new object
  */