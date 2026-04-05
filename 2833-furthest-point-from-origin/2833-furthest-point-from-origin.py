class Solution(object):
    def furthestDistanceFromOrigin(self, moves):
        """
        :type moves: str
        :rtype: int
        """
        left_count = moves.count('L')
        right_count = moves.count('R')
        spaces_count = moves.count('_')

        if left_count> right_count:
            return left_count + spaces_count - right_count
        else:
            return right_count + spaces_count - left_count
