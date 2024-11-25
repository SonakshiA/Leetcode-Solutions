class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder()); //Make it sort in a descending manner by keys
        
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        
        int index = 0;
        for(Integer key: map.keySet()){
            names[index++] = map.get(key);
        }
        return names;
    }
}