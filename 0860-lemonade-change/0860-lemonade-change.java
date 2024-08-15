class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollars = 0;
        int tendollars = 0;
        
        for(int bill:bills){
            if(bill==5){
                fivedollars++;
            }else if(bill==10){
                if(fivedollars<1)
                    return false;
                tendollars++;
                fivedollars--;
            }else if(bill==20){
                if(fivedollars>0 && tendollars>0){
                    fivedollars--;
                    tendollars--;
                } else if(fivedollars>=3){
                    fivedollars-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}