class Solution {
    public int maxDistance(int[] colors) {
        int pointer = 0;
        int maxDistance = 0;

        while (pointer != colors.length) {
            for (int i = 0; i < colors.length; i++) {
                if (colors[i] != colors[pointer]) {
                    int distance = Math.abs(i - pointer);

                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
            pointer++;
        }


        return maxDistance;
    }
}