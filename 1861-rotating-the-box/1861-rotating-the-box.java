class Solution {
    private static final char STONE = '#';
    private static final char OBSTACLE = '*';
    private static final char EMPTY = '.';
    
    private void reverse(char[] row){
        int p1=0;
        int p2=row.length-1;
        
        while(p1<=p2){
            char temp = row[p1];
            row[p1] = row[p2];
            row[p2] = temp;
            p1++;
            p2--;
        }
    }
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] ans = new char[n][m];
        
        //first shift the last stone in every row.
        
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                if(box[i][j]==EMPTY){
                    int stoneLocation = -1;
                    for(int k=j-1;k>=0;k--){
                        if(box[i][k]==OBSTACLE)
                            break;
                        if(box[i][k]==STONE){
                            stoneLocation=k;
                            box[i][k] = EMPTY;
                            break;
                        }
                    }
                    if(stoneLocation!=-1){
                        box[i][j] = STONE;
                    }
                }
            }
        }
        // now we transpose the box
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i] = box[i][j];
            }
        }
        
        //now we reverse each row
        for(char[] row: ans){
            reverse(row);
        }
        return ans;
    }
}