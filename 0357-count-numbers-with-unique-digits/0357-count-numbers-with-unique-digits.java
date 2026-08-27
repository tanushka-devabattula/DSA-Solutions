class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int sum=0;
        if (n==0)
        return 1;
        else{
        int ans=9,num=9;
        for(int i=0;i<n-1;i++)
        {
            ans*=(num-i);
            sum+=ans;
        }
        }
       return sum+10;
    }
}