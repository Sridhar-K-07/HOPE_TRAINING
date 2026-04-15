import java.util.*;
public class map {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,1,1,1,1,4,2,3,4,5,5};
        Map<Integer,Integer> map=new HashMap<>();
        
        
       for(int i:arr){
        map.put(i,map.getOrDefault(i, 0)+1);
       }


        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.err.println(entry.getKey()+" existed "+entry.getValue()+" times");
        }
    }
}
