import java.util.*;
public class list1 {
    public static void main(String[] args){
       ArrayList<Integer> list=new ArrayList<>();

       list.add(10);
       list.add(30);
       list.add(45);

       for(int i:list){
        System.out.print(i+" ");
       }
       list.remove(2);
       
       System.out.println("Removed element after");
       for(int i:list){
        System.out.print(i+" ");
       }
    }
}
