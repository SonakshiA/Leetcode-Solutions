class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lesser = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lesser.add(nums[i]);
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }else{
                equal.add(nums[i]);
            }
        }
        
        int index = 0;

        for(int i=0;i<lesser.size();i++){
            nums[index++] = lesser.get(i);
        }

        for(int i=0;i<equal.size();i++){
            nums[index++] = equal.get(i);
        }

        for(int i=0;i<greater.size();i++){
            nums[index++] = greater.get(i);
        }

        return nums;
    }
}