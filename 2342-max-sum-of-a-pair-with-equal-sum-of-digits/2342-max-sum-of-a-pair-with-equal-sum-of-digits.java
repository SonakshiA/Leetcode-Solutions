class Solution {
     int sum(int num){
        int s = 0;
        while(num>0){
            s+=(num%10);
            num/=10;
        }
        return s;
    }

    public int maximumSum(int[] nums) {
       List<Integer>[] count = new List[100000];
       int ans = -1;
       for(int i=0;i<100000;i++){
           count[i] = new ArrayList<>();
       }
       for(int num:nums){
           count[sum(num)].add(num);
       }

       for(List<Integer> group : count){
           int tempSum = 0;
           if(group.size()>=2) {
               Collections.sort(group, Collections.reverseOrder());
               tempSum += group.get(0) + group.get(1);
               if (tempSum > ans)
                   ans = tempSum;
           }
       }
       return ans;
    }
}