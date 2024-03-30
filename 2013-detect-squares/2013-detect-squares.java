class DetectSquares {
    List<int[]> coordinates;
    HashMap<String,Integer> count;
    public DetectSquares() {
        coordinates = new ArrayList<>();
        count = new HashMap<>();
    }
    
    public void add(int[] point) {
        coordinates.add(point);
        String key = point[0] + "@" + point[1];
        count.put(key,count.getOrDefault(key,0)+1);
    }
    
    public int count(int[] point) {
        int sum =0, px=point[0], py=point[1];
        for(int[] coord:coordinates){
            int x = coord[0], y=coord[1];
            if(px==x||py==y || Math.abs(px-x)!=Math.abs(py-y))
                continue;
            
            sum+= count.getOrDefault(x+"@"+py,0)*count.getOrDefault(px+"@"+y,0);
        }
        return sum;
    }
}

//https://www.youtube.com/watch?v=bahebearrDc

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */