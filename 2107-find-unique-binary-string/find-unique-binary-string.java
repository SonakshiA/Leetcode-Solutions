class Solution {
    Set<String> set = new HashSet<>();
    int n;

    private String generate(String curr){
        if(curr.length()==n){
            if(!set.contains(curr)){
                return curr;
            }
            return "";
        }

        String addZero = generate(curr + "0");

        if(addZero.length()>0){
            return addZero;
        }

        return generate(curr + "1");
    }
    public String findDifferentBinaryString(String[] nums) {
        n = nums.length;
        for(String s: nums){
            set.add(s);
        }
        return generate("");
    }
}