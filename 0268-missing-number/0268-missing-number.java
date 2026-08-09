class Solution {
    public int missingNumber(int[] nums) {
long n=nums.length;
long sum=0;
for(int i=0;i<n;i++)
{
    sum+=nums[i];
}
long exp=n*(n+1)/2;
return (int) (exp-sum);

    }
}