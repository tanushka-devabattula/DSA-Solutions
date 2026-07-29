class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length!=r*c)
        return mat;
        int temp[]=new int[mat.length*mat[0].length];
        int res[][]=new int[r][c];
        int k=0;
        for(int i=0;i<mat.length;i++)
        {
           for(int j=0;j<mat[i].length;j++)
           {
            temp[k++]=mat[i][j];

           }
        }
        int x=0;

          for(int i=0;i<r;i++)
          {
            for(int j=0;j<c;j++)
            {
              res[i][j]=temp[x++];
            }
          }

       
        return res;
    }
}