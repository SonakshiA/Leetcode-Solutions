class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         int min = Integer.MAX_VALUE;
        int i, j;
        HashMap<String, Integer> m1 = new HashMap<>();
        ArrayList<String> strings = new ArrayList<>();

        for (i = 0; i < list1.length; i++) {
            m1.put(list1[i], i);
        }


        for (j = 0; j < list2.length; j++) {
            if (m1.containsKey(list2[j])) {
                int sum = j + m1.get(list2[j]);

                if (sum < min) {
                    strings.clear(); //if we find a sum having lesser value than previous min, then we remove the previous String
                    strings.add(list2[j]);
                    min = sum;
                }else if(sum == min){
                    strings.add(list2[j]);
                }
            }
        }

        String[] res = new String[strings.size()];

        for (i = 0; i < strings.size(); i++) {
            res[i] = strings.get(i);
        }

        return res;
    }
}