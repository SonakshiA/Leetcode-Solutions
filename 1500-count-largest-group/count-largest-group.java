class Solution {
    private int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum+= (num%10);
            num/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int key = sumOfDigits(i);
            if(!map.containsKey(key)){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(key,l);
            } else{
                ArrayList<Integer> l = map.get(key);
                l.add(i);
                map.put(key,l);
            }
        }
        int maxSize = 0;
        for(Integer key: map.keySet()){
            if(map.get(key).size() > maxSize){
                maxSize = map.get(key).size();
            }
        }
        int count = 0;
        for(Integer key: map.keySet()){
            if(map.get(key).size() == maxSize){
                count++;
            }
        }
        return count;
    }
}