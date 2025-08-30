class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for(int i =0; i<9; i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    if(!seen.add(c + "@row" + i) || !seen.add(c+"@col"+j)|| 
                       !seen.add(c+"box"+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

/*
How the Code Works
Set Usage:

A HashSet named seen is used to keep track of the characters that have already been encountered in a specific row, column, or 3x3 box.
For each non-empty cell in the Sudoku board, three unique strings are generated:
c + "@row" + i: This represents the digit c in row i.
c + "@col" + j: This represents the digit c in column j.
c + "box" + i/3 + j/3: This represents the digit c in the 3x3 sub-box identified by (i/3, j/3).
Validation:

For each cell (i, j) that is not empty (board[i][j] != '.'), the code attempts to add the above three strings to the seen set.
If any of these additions return false (indicating the item was already in the set), the board is invalid, and the function returns false.
Final Check:

If the entire board is traversed without finding duplicates in any row, column, or box, the board is valid, and the function returns true.
Time Complexity
Outer Loop: There are two nested loops that each run 9 times (since the board is 9x9).
Set Operations: The set operations (add and contains) are on average O(1) due to the underlying hash table implementation.
Thus, the total time complexity is O(9 x 9 x 3) = O(1).
*/