import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(ans(str));
    }
    
    
    public static String ans(String str){
    StringBuilder sb=new StringBuilder();
    StringBuilder st=new StringBuilder();
        for (int i = 0; i <= str.length(); i++) {
            if(i==str.length() || str.charAt(i)==' '){
                if(sb.length()%2==0 && sb.length()>0)    {
                    st.append(sb+" ");
            }
            sb.setLength(0);
            }
            else{
               sb.append(str.charAt(i));
            }
            
        }
  return (st.toString());
    }
}

