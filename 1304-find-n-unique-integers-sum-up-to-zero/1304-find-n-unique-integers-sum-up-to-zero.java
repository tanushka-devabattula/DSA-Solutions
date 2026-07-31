class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
       for(int i=1;i<=(n/2);i++)
       {
        res[i-1]=i;
       }
        for(int i=1;i<=(n/2);i++)
        {
            res[n-i]=-(i);
        }

        if(n%2==0)
        {
            res[n/2]=n/2;
            res[n/2-1]=-(n/2);
        }

        return res;
    }
}