class Solution {
    private int gcd(int n1, int n2){
        if(n2==0)
            return n1;
        else
            return gcd(n2,n1%n2);
    }
    
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        int n1 = 1;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                
                if(nums[i]>= 0 && nums[i]<=9)
                    n1 = nums[i]/1;
                else if(nums[i]>=10 && nums[i]<=99)
                    n1 = nums[i]/10;
                else if(nums[i]>=100 && nums[i]<=999)
                    n1 = nums[i]/100;
                else
                    n1 = nums[i]/1000;
                int n2 = nums[j]%10;
                
                if(gcd(n1,n2)==1)
                    count++;
            }
        }
        return count;
    }
}