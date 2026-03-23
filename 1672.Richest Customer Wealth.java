public class 1672.Richest Customer Wealth {
    class Solution {
    public int maximumWealth(int[][] accounts) {
       int max=0;
       for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
            sum+=accounts[i][j];
        }
        if(sum>max)     max=sum;
       } 
       return max;

    }
}
}

/*
Case 1
Case 2
Case 3
Input
accounts =
[[1,2,3],[3,2,1]]
Output
6
Expected
6
*/
