class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        prod = k
        n = 2
        while(prod in nums):
            prod = k * n
            n = n + 1
        return prod

        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna