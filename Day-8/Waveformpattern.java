import java.util.*;
class WaveformPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sb.append(str.charAt(i)+" ");
            }
        }
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                sb.append(" "+str.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}