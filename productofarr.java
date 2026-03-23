public class Solution {
    public int arraySign(int[] nums) {
        int o=0;
   for(int i:nums){
if(i==0)        return 0;
else if(i<0)    o++;

   }   
   if(o%2==0)   return 1;
   return -1;  
   }
} 
/*
Case 1
Case 2
Case 3
Input
nums =
[-1,-2,-3,-4,3,2,1]
Output
1
Expected
1
*/
