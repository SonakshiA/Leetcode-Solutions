class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        for(int currIndex=0;currIndex<n;currIndex++){
            int common = 0;
            for(int aIndex = 0; aIndex<=currIndex;aIndex++){
                for(int bIndex=0;bIndex<=currIndex;bIndex++){
                    if(A[aIndex]==B[bIndex]){
                        common++;
                        break;
                    }
                }
            }
            C[currIndex]=common; 
        }
        return C;
    }
}