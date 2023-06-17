class Solution {
    public int minMaxDifference(int num) {
        char[] cs_max = String.valueOf(num).toCharArray();
        char[] cs_min = String.valueOf(num).toCharArray();
        char val = '0';
        //find the first character that doesn't equal to '9' and remap all occurences of it to '9'

        for (int i = 0; i < cs_max.length; i++) {
            if (cs_max[i] != '9') {
                val = cs_max[i];
                break;
            }
        }

        for (int i = 0; i < cs_max.length; i++) {
            if (cs_max[i] == val) {
                cs_max[i] = '9';
            }
        }

        //find the first character that doesn't equal to '0' and remap all occurences of it to '0'

        for(int i = 0; i< cs_min.length; i++){
            if(cs_min[i]!='0'){
                val = cs_min[i];
                break;
            }
        }

        for (int i = 0; i < cs_min.length; i++) {
            if (cs_min[i] == val) {
                cs_min[i] = '0';
            }
        }

        return Integer.valueOf(String.valueOf(cs_max)) - Integer.valueOf(String.valueOf(cs_min));
    }
}