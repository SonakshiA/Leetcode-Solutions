class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        HashSet<Integer> elementsA = new HashSet<>();
        HashSet<Integer> elementsB = new HashSet<>();

        for(int currIndex = 0; currIndex<n; currIndex++){
            elementsA.add(A[currIndex]);
            elementsB.add(B[currIndex]);
            int common = 0;
            for(int element: elementsA){
                if(elementsB.contains(element)){
                    common++;
                }
            }
            C[currIndex] = common;
        }
        return C;
    }
}