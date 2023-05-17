class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Arrays.sort(words);
        ArrayList<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<String> maxHeap = new PriorityQueue<>(
                (w1, w2) -> map.get(w1)==(map.get(w2)) ? w1.compareTo(w2) : map.get(w2) - map.get(w1)
        );

        for (String word : map.keySet()) {
            maxHeap.add(word);
        }

        for (int i = 0; i < k; i++){
            res.add(maxHeap.poll());
        }

        return res;
    }
}