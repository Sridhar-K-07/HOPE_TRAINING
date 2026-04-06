
import java.util.Scanner;

public class wordcount {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int c=0;
    // for(int i=0;i<str.length();i++){
    //     if(str.charAt(i)==' ')      continue;
    //     else{
    //         if(str.charAt(i)!=' '&&str.charAt(i+1)!=' ')    c++;
    //     }
    // }
    for (int i =0; i <str.length() ; i++) {
        if(str.charAt(i)!=' ' &&  str.charAt(i+1)==' '){
            c++;
        }
        if(str.length()-1!=' ') c++;
    }
    System.out.println(c);
}    
}
