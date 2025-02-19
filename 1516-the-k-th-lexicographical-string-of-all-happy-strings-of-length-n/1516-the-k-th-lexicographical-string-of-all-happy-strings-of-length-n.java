class Solution {
    List<String> happyStrings = new ArrayList<>();
    public String getHappyString(int n, int k) {
        String currentString = "";
        generateStrings(n,currentString);

        if(happyStrings.size()<k){
            return "";
        }

        Collections.sort(happyStrings);
        return happyStrings.get(k-1);
    }

    public void generateStrings(int n, String currentString){
        if(currentString.length()==n){
            happyStrings.add(currentString);
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(currentString.length()>0 && currentString.charAt(currentString.length()-1)==ch){
                continue;
            }
            generateStrings(n,currentString+ch);
        }
    }
}