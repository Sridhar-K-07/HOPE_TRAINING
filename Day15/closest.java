import java.util.*;
public class closest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,15,20,25,27,30};
        TreeSet<Integer> tree=new TreeSet<>();
        int target=sc.nextInt();
        for(int i:arr){
            tree.add(i);
        }
        int a=tree.lower(target);
        
        int b=tree.higher(target);
        if(tree.higher(target)==null){
            System.out.println(b);
        }

        else if(tree.lower(target)==null){
            System.out.println(b);
        }
        else if(b-target<target-a){
            System.out.println("closest is "+b);
        }
    
        else{
             System.out.println("closest is "+a);
        }

        System.out.println("Ceil value is "+tree.ceiling(target));
        System.out.println("floor is "+tree.floor(target));
        System.out.println("first value is "+tree.first());
        System.out.println("last value is  "+tree.last());
        
    }
}