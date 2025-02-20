class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(String num:nums){
            numbers.add(Integer.parseInt(num,2));
        }

        for(int num=0;num<=nums.length*2+1;num++){
            if(!numbers.contains(num)){
                String ans = Integer.toBinaryString(num);
                while(ans.length()<nums.length){
                    ans = "0" + ans;
                }
                return ans;
            }
            //return ans;
        }
    return "";
    }
}