class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int c1=0,c2=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c1++;
                    break;
                }
            }
        }
        
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    c2++;
                    break;
                }
            }
        }
        ans[0] = c1;
        ans[1] = c2;
        
        return ans;
    }
}