class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bobCandies = new HashSet<>();
        int[] ans = new int[2];
        int sumA = 0, sumB = 0;
        
        for(int val:bobSizes){
            sumB+=val;
            bobCandies.add(val);
        }
        
        for(int val:aliceSizes){
            sumA+=val;
        }
        
        int diff = (sumA-sumB)>>1; //divide by 2
        for(int a: aliceSizes){
            int targetSize = a-diff;
            if(bobCandies.contains(targetSize)){
                ans[0] = a;
                ans[1] = targetSize;
            }
        }
        return ans;
    }
}

/*

Let Alice exchange x candies and Bob exchange y candies
We want that:

(sumA - x) + y = (sumB - y) + x

sumA - sumB = 2*(x-y)

Let sumA - sumB = diff

diff = 2*(x-y)

x-y = diff/2

y = x - diff/2

*/