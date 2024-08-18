class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> uglyNumbers = new TreeSet<>();
        uglyNumbers.add(1L);
        long ugly = 1;
        
        for(int i=0;i<n;i++){
            ugly = uglyNumbers.pollFirst();
            
            uglyNumbers.add(ugly*2);
            uglyNumbers.add(ugly*3);
            uglyNumbers.add(ugly*5);       
        }
        return (int) ugly;
    }
}