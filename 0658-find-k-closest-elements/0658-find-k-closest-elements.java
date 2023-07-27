class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int a=0;
        int b=arr.length-1;
        
        while((b-a+1)>k){
            if(Math.abs(arr[a]-x)>Math.abs(arr[b]-x))
                a++;
            else b--;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=a;i<=b;i++){
            res.add(arr[i]);
        }
        return res;
    }
}