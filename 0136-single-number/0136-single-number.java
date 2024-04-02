class Solution { 
    public int singleNumber(int[] numbers) { 
    // -----------------------------------------------------------
    // Sorting -- Time Complexity O(nlogn), Space Complexity O(1)
    // -----------------------------------------------------------
    Arrays.sort(numbers);
    int len = numbers.length;
    int i = 0;
    while (i < len - 2) {
      if (numbers[i] == numbers[i+1]) {
        i = i + 2;
      } else {
        return numbers[i];
      }
    }
    return numbers[len - 1];
  }
}