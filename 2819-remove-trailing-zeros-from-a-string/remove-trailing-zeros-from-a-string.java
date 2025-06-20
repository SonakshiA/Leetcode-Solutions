class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int end = num.length() - 1;

        while(num.charAt(end) == '0') {
            end--;
        }

        return num.substring(0,end+1);
    }
}