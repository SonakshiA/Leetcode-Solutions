class Solution(object):
    def distributeCandies(self, candyType):
        """
        :type candyType: List[int]
        :rtype: int
        """
        types = len(candyType)/2
        s = set(candyType)

        return min(types,len(s))