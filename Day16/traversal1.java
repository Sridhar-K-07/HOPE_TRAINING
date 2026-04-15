

import java.util.*;

public class traversal1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        ListIterator<Integer> it=list.listIterator();

         /* while(it.hasNext()){
            //hasNext()-boolean type return true it   next element is present otherwise false
            int current=it.next();
          
            if(current==4){
                it.remove();
            }


        }
            */

        while(it.hasNext()){
            it.next();
        }
       // since first element has no previous we have to move to last
        while(it.hasPrevious()){
          int prev=it.previous();
        System.out.println(prev);
        }
    }
}
