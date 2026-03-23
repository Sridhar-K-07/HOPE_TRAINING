import java.util.*;
public class pat3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		for(int i=n;i>=1;i--){
		    for(int j=i;j>0;j--){
		        System.out.print("*");
		    }
		    System.out.println();
	
        }
        sc.close();
	}
} 


/*

5
*****
****
***
**
*

*/