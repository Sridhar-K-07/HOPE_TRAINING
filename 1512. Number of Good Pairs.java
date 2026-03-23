public class 1512. Number of Good Pairs {
    class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j] && i<j){
                count++;
            }
        }
     }
     return count;   
    }
}
}
/*
Case 1
Case 2
Case 3
Input
nums =
[1,2,3,1,1,3]
Output
4
Expected
4

*/