class Solution {
    public int[] arrayRankTransform(int[] arr) {
         Map<Integer, Integer> m =new TreeMap<>(); //sorts keys in ascending order

        for(int x: arr){
            m.put(x,1);
        }

        int first = 0;

        for(int x: m.keySet()){
            m.put(x,first+m.get(x));
            first = m.get(x);
        }

        for(int i=0;i< arr.length;i++){
            arr[i] = m.get(arr[i]);
        }

        return arr;
    }
}