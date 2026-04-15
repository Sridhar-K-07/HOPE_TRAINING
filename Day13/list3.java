import java.util.*;

public class list3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();   // take size from user
        ArrayList<Integer> list = new ArrayList<>(size);

        // input loop
        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }

        // print loop
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
