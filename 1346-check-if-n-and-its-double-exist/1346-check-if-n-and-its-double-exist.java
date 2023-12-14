class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(int x:arr)
            if(map.containsKey(2*x) && x!=0)
                return true;
            else if(x==0)
                if(map.get(x)>1)
                    return true;
        return false;
    }
}