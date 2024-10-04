class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start = 0;
        int end = skill.length-1;
        int sum = skill[start] + skill[end];
        long ans = 0;
        while(start<end){
            if(skill[start]+skill[end]!=sum)
                return -1;
            ans+= skill[start]*skill[end];
            start++;
            end--;
        }
        return ans;
    }
}