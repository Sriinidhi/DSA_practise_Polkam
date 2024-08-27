//Striver SDE Sheet
//Problem Statement ( https://leetcode.com/problems/set-matrix-zeroes/ )


class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;//row
        int m = matrix[0].length;//col

        int r[] = new int[n];
        int c[] = new int[m];

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    r[i]=1;
                    c[j]=1;
                }
            }
        }

        for(int p=0 ; p<n ; p++)
        {
            for(int q=0 ; q<m ; q++)
            {
                if(r[p]==1 || c[q]==1)
                {
                    matrix[p][q]=0;
                }
            }
        }

    }
}
