class Solution(object):
    def closestTarget(self, words, target, startIndex):
        """
        :type words: List[str]
        :type target: str
        :type startIndex: int
        :rtype: int
        """
        if words[startIndex]==target:
            return 0
        
        if target not in words:
            return -1

        n = len(words)
        
        right = 1
        next = (startIndex + 1) % n
        while(words[next]!=target):
            right+=1
            next = (next + 1) % n
        
        left = 1
        next = (startIndex - 1) % n
        while(words[next]!=target):
            left+=1
            next = (next - 1) % n
        
        return min(right,left)