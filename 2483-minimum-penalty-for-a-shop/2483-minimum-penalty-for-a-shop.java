class Solution {
    public int bestClosingTime(String customers) {
        int curr = 0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y')
                curr++;
        }
        
        int earliest = 0;
        int min = curr;
        
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                curr--;
            }else{
                curr++;
            }
            
            if(curr<min){
                min = curr;
                earliest = i+1;
            }
        }
        return earliest;
    }
}