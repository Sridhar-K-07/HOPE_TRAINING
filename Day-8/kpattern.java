import java.util.*;
public class kpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a=0,b=str.length()-1;
        int n=str.length();
        int space=n/2;
        for(int i=0;i<n;i++){
           System.out.print(str.charAt(i));
           for(int j=0;j<space;j++){
System.out.print(" ");
           }
           if(i<n/2)    space--;
           else         space++;
           System.out.println(str.charAt(b--));

        }
    }
}
