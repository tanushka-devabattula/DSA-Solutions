class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>ans=new ArrayList<>();
  
   for(int i=0;i<numRows;i++)
   {
     List<Integer>res=new ArrayList<>();
    int a=1;
    for(int j=0;j<=i;j++)
    {
        res.add(a);
       a=(a*(i-j))/(j+1);
    }
      ans.add(res);
   }
   return ans;
    }
}