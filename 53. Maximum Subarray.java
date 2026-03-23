public class 53. Maximum Subarray {
    class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=nums[0];
        for(int i:nums){
            curr+=i;
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
}
}


/*
nums =
[-2,1,-3,4,-1,2,1,-5,4]
Output
6
Expected
6

*/
