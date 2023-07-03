class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i =0; i<k; i++){
            sum+=cardPoints[i];
        }
        int res = sum;
        
        for(int  i =0; i<k;i++){
            sum+= cardPoints[cardPoints.length-i-1] - cardPoints[k-i-1];
            res = Math.max(sum,res);
        }
        return res;
    }
}


/*

Find the sum of first k elements,
then keep removing elements from first k and adding from the back

https://dev.to/seanpgallivan/solution-maximum-points-you-can-obtain-from-cards-2no

*/