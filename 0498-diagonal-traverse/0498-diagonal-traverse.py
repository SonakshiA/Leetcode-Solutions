class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        rows = len(mat)
        cols = len(mat[0])
        res = []

        for c in range(cols):
            r, j = 0,c
            sub = []
            while r<rows and r>=0 and j<cols and j>=0:
                sub.append(mat[r][j])
                print(mat[r][j])
                r+=1
                j-=1
            res.append(sub)
        
        for r in range(1,rows):
            i,j = r, cols-1
            sub = []
            while r<rows and j>=0:
                sub.append(mat[r][j])
                print(mat[r][j])
                r+=1
                j-=1
            res.append(sub)

        final = []
        
        for i in range(len(res)):
            if i%2==0:
                res[i].reverse()
            for item in res[i]:
                final.append(item)
        
        
        print(final)
        return final
        
        