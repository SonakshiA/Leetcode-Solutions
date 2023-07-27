class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int minSwaps = Math.min(numSwaps(A[0],A,B),numSwaps(B[0],A,B));
        minSwaps = Math.min(minSwaps, numSwaps(A[0],B,A));
        minSwaps = Math.min(minSwaps, numSwaps(B[0],B,A));
        
        return minSwaps==Integer.MAX_VALUE?-1:minSwaps;
    }
    
    public int numSwaps(int target, int[] A, int[] B){
        int numSwaps = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=target && B[i]!=target)
                return Integer.MAX_VALUE;
            else if(A[i]!=target) //B[i] ==target so switch top and bottom
                numSwaps++;
        }
        return numSwaps;
    }
}

/*

Greedy Approach:

1. Make all dominos in tops match tops[0]
2. Make all dominos in tops match bottoms[0]
3. Make all dominos in bottoms match tops[0]
4. Make all dominos in bottoms match bottoms[0]

*/
