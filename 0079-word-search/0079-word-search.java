
class Solution {
    public boolean exist(char[][] mat, String word) {
      int n=mat.length;
      int m=mat[0].length;
      boolean[][] vis=new boolean[n][m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(mat[i][j]==word.charAt(0))
              {
                  if(dfs(mat,word,i,j,0,vis))
                  {
                      return true;
                  }
              }
          }
      }
        
         return false;
    }
   
   
    private boolean dfs(char[][] mat, String word, int i, int j, int idx, boolean[][] vis)
    {
        if(idx==word.length())
        return true;
        int n=mat.length;
        int m=mat[0].length;
       if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] || mat[i][j] != word.charAt(idx)) {
                  return false;
              }
        vis[i][j]=true;
        
        boolean found=dfs(mat,word,i+1,j,idx+1,vis) || dfs(mat, word, i - 1, j, idx + 1, vis) ||
                                                                               dfs(mat, word, i, j + 1, idx + 1, vis) ||
                                                                               dfs(mat, word, i, j - 1, idx + 1, vis);
            vis[i][j]=false;
            return found;
                                
    }
}