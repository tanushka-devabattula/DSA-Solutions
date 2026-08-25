class Solution {
    public int maximumPoints(int matrix[][]) {
       int n=matrix.length;
       int a=matrix[0][0];
       int b=matrix[0][1];
       int c=matrix[0][2];
       for(int i=1;i<n;i++)
       {
           int d=Math.max(b,c)+matrix[i][0];
           int e=Math.max(a,c)+matrix[i][1];
           int f=Math.max(a,b)+matrix[i][2];
           a=d;
           b=e;
           c=f;
           
       }
       return Math.max(a,Math.max(b,c));
    }
}