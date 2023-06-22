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
            System.out.println(Arrays.toString(list));
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

//put the number at 0th index of pieces as key and rest of the list as the value

/*

arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
78 -> [78]
4 -> [4,64]
91 -> [91]

*/