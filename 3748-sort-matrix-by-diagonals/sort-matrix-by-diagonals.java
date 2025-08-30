class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int n = grid.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key = i-j;
                if(!map.containsKey(key)) {
                    ArrayList<Integer> diag = new ArrayList<>();
                    diag.add(grid[i][j]);
                    map.put(key,diag);
                } else {
                    ArrayList<Integer> diag = map.get(key);
                    diag.add(grid[i][j]);
                    map.put(key,diag);
                }
            }
        }

        for(Integer key: map.keySet()) {
            if(key<0) {
                Collections.sort(map.get(key));
            } else {
                Collections.sort(map.get(key), Collections.reverseOrder());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key = i-j;
                ArrayList<Integer> vals = map.get(key);
                if(!vals.isEmpty()){
                    grid[i][j] = vals.get(0);
                    vals.remove(0);
                }
            }
        }
        return grid;
    }
}