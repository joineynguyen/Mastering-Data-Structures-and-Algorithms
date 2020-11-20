/*
Joiney Nguyen

Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

*/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) 
    {
        int row = A.length;
        int col = A[0].length;
        
        int[][] output = new int[row][col];
        
        for(int i = 0; i < row; i++)
        {
            int backwardPointer = col - 1;
            
            for(int j = 0; j < col; j++)
            {
                output[i][j] = A[i][backwardPointer];
                backwardPointer--;
            }
        }
        
        for(int x = 0; x < row; x++)
        {
            for(int y = 0; y < col; y++)
            {
                output[x][y] = output[x][y] == 0 ? 1 : 0;
            }
        }
        
        return output;
    }
}
