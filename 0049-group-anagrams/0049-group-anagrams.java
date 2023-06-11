class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String word: strs){
            char[] temp = word.toCharArray();
            Arrays.sort(temp);
            String tempWord = new String(temp);

            if(map.containsKey(tempWord)){
                map.get(tempWord).add(word);
            }else{
                ArrayList<String> w = new ArrayList<>();
                w.add(word);
                map.put(tempWord,w);
            }
        }

        for(ArrayList<String> wordLists: map.values()){
            res.add(wordLists);
        }
        return res;
    }
}