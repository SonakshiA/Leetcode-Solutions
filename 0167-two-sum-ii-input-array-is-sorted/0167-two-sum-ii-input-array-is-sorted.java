class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(numbers[i])){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(numbers[i],l);
            }else{
                ArrayList<Integer> l = map.get(numbers[i]);
                l.add(i);
                map.put(numbers[i],l);
            }
        }
        
        for(Integer num: map.keySet()){
            int req = target-num;
            if(req==num && map.get(req).size()>1){
                res[0] = map.get(num).get(0)+1;
                res[1] = map.get(req).get(1)+1;
            }else if(map.containsKey(req)){
                res[0] = map.get(num).get(0)+1;
                res[1] = map.get(req).get(0)+1;
            }
        }
        Arrays.sort(res);
        return res;
    }
}