class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> s = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        System.out.println(map);
        for(int num:map.keySet()){
            System.out.println(map.get(num));
            if(s.contains(map.get(num))){
                return false;
            }
            s.add(map.get(num));
        }
        return true;
    }
}