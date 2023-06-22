class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, int[]> map = new HashMap<>();
        //store
        for(int[] list:pieces){
            map.put(list[0],list);
        }
        
        int index = 0;
        
        while(index<arr.length){
            if(!map.containsKey(arr[index])){
                return false;
            }
            
            int[] list = map.get(arr[index]);
            for(int val: list){
                if(arr[index]!=val){
                    return false;
                }
                index++;
            }

        }
        return true;
    }
}