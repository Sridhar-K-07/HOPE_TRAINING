import java.util.*;
public class firstnonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[26];
        for (char ch:str.toCharArray()) {
            //char ch=str.charAt(i);
            freq[ch-'a']++;
        }
       for(char ch:str.toCharArray()) {
            if(freq[ch-'a']==1){
                System.out.print(ch);
            }
        }
    }
   
}

// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
       
//         int s=0,e=str.length()-1;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(s)==str.charAt(e)){
//                 e=str.length()-1;
//                 s++;
//                 continue;
                
//             } ======================================*============
//             e--;
            
//         }
//         System.out.print(str.charAt(s));
//     }



