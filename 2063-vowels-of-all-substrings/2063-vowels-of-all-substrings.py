class Solution(object):
    def countVowels(self, word):
        """
        :type word: str
        :rtype: int
        """
        
        length = len(word)
        count = 0
        for i in range (0,length):
            if word[i] in "aeiou":
                count += (i+1) * (length-i)
        return count

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna