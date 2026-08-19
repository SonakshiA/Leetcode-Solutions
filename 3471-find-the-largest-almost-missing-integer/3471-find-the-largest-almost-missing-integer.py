class Solution(object):
    def largestInteger(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        dict = {}
        start = 0
        end = len(nums)
        for start in range(end-k+1): # needs fixing
            window = set(nums[start:start+k])
            for num in window:
                dict[num] = dict.get(num,0) + 1
        
        min = -1
        for key in dict:
            if dict.get(key) == 1:
                min = max(min, key)
        return min



# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna