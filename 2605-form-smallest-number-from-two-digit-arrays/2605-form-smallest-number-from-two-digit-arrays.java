class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        for(int x:nums1){
            l1.add(x);
        }
        
        for(int x:nums2){
            l2.add(x);
        }
        
        Collections.sort(l1);
        Collections.sort(l2);
        
        int common = Integer.MAX_VALUE;
        
        for(int x: l1){
            if(l2.contains(x)){
                common = x;
                break;
            }
        }
        
        return Math.min(Math.min(l1.get(0)*10 + l2.get(0), 
                        l2.get(0)*10 + l1.get(0)),common);
    }
}