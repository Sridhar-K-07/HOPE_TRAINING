import java.util.*;

public class list2 {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,4,5,6,7,6,7,8,9));
    /*  for(int i=0;i<list.size();i++){
             if(list.get(i)%2==0){
                list.remove(i);
                i--;
             }
        }
             */
            Collections.sort(list);

            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)==list.get(i+1)){
                    list.remove(i);
                    i--;
                }
            }
        System.out.println(list);
    }
}
