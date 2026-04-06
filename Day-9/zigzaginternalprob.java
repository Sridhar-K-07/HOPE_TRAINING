import java.util.*;
public class zigzaginternalprob{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int row=sc.nextInt();
       System.out.print(result(str,row));
    }
    public static String result(String s,int n){
         StringBuilder ans=new StringBuilder();
         StringBuilder[] rows=new StringBuilder[n];
        for(int i=0;i<n;i++){
            rows[i]=new StringBuilder();
        }
        int current=0;
        boolean goingupward=false;
        for(char ch:s.toCharArray()){
            rows[current].append(ch);
            if(current==0 || current==n-1){
                goingupward=!goingupward;
            }
        if(goingupward)     current+=1;
        else                current-=1;    
        }
        for(StringBuilder row:rows){
            ans.append(row);
        }
        return ans.toString();
    }
}

