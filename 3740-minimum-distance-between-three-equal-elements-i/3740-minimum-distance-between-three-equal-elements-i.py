class Solution(object):
    def minimumDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dictionary = {}

        for i in range(len(nums)):
            indexes = dictionary.get(nums[i],[])
            indexes.append(i)
            dictionary[nums[i]] = indexes
        
        print(dictionary)
        ans = float('inf')
        for indexes in dictionary.values():
            if len(indexes)>=3:
                for i in range(len(indexes)-2):
                    distance = 2* (indexes[i+2] - indexes[i])
                    ans = min(ans, distance)
        
        return -1 if ans == float('inf') else ans

                
                

        
        