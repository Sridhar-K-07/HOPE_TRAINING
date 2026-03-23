public class 268. Missing Number {
    class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
   int a=0;
   for(int i=0;i<nums.length;i++){
    if(nums[i]!=a){
        return a;
    }
    a++;
   }    
   return nums.length; 
    }
}
}
/*
Case 1
Case 2
Case 3
Input
nums =
[3,0,1]
Output
2
Expected
2
*/