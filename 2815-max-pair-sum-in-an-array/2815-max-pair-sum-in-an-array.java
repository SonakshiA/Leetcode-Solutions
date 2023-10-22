class Solution {
    int max(int num){
        int max = Integer.MIN_VALUE;
        while(num>0){
            max = Math.max(max,num%10);
            num/=10;
        }
        return max;
    }
    
    public int maxSum(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> dict = new HashMap<>();
        
        for(int num:nums){
            int maxNum = max(num);
            if(dict.containsKey(maxNum)){
                ArrayList<Integer> l = dict.get(maxNum);
                l.add(num);
                dict.put(maxNum,l);
            }else{
                System.out.println(num);
                    
                ArrayList<Integer> l = new ArrayList<>();
                l.add(num);
                dict.put(maxNum, l);
            }
        }
        System.out.println(dict);
        int res = -1;
        for(ArrayList<Integer> l: dict.values()){
            System.out.println(l);
            if(l.size()>=2){
                 int sum = 0;
                 Collections.sort(l);
                 sum+=l.get(l.size()-2) + l.get(l.size()-1);
                 res = Math.max(res,sum);
            }
        }
        return res;
    }
}