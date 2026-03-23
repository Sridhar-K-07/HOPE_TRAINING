public class 1217. Minimum Cost to Move Chips to The Same Position {
    class Solution {
    public int minCostToMoveChips(int[] position) {
      int ecount=0;
      int ocount=0;
      for(int i=0;i<position.length;i++){
        if(position[i]%2==0){
            ecount++;
        }
        else        ocount++;
      }  
    if(ecount<ocount)    return ecount;
    else                 return ocount;
    }
}
}


/*
Case 1
Case 2
Case 3
Input
position =
[1,2,3]
Output
1
Expected
1
*/
