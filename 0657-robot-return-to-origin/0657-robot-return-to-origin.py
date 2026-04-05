class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        if len(moves)%2==1:
            return False
        
        up = moves.count('U')
        down = moves.count('D')
        left = moves.count('L')
        right = moves.count('R')

        if up!=down or left!=right:
            return False
        
        return True
        