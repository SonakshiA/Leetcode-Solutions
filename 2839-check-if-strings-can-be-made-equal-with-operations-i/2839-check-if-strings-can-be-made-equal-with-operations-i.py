class Solution(object):
    def canBeEqual(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        for ch in s1:
            if ch not in s2:
                return False
        
        s1_new_even = s1[2] + s1[1] + s1[0] + s1[3]
        s1_new_odd = s1[0] + s1[3] + s1[2] + s1[1]
        s2_new_even = s2[2] + s2[1] + s2[0] + s2[3]
        s2_new_odd =  s2[0] + s2[3] + s2[2] + s2[1]

        if s1_new_even==s2:
            return True
        
        elif s1_new_odd == s2:
            return True
        
        elif s1_new_even==s2_new_even:
            return True
        
        elif s1_new_odd==s2_new_odd:
            return True
        
        elif s1_new_even==s2_new_odd:
            return True

        elif s1_new_odd==s2_new_even:
            return True
        
        return False
    