class Solution {

      boolean ismaxi(int c, int num, int[][] mat)
      {
        for(int i=0;i<mat.length;i++)
        {
           if(mat[i][c]>num)
           return false;
        }

        return true;
      }


    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> res= new ArrayList<>();
       for(int i=0;i<matrix.length;i++)
       {
        int min=matrix[i][0],col=0;
        for(int j=0;j<matrix[i].length;j++)
        {
               if(matrix[i][j]<=min)
              {
                 min=matrix[i][j];
                 col=j;
                
              }

              
        }
       
        boolean ans= ismaxi(col,min,matrix);
        if(ans)
        res.add(min);
        
       }
        return res;
    }
}