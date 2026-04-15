import java.util.*;


public class traversal {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        // asList-to add group of element

        for(int i:list){
             
            System.out.println(i);
        }
    }
}

/*
for(int i:list){

            if(i==4){
                list.remove(i);
            } concurrence error since we cannot change list element during traversal 
            System.out.println(i);
        }
           */