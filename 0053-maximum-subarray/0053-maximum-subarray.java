class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int j=0;j<nums.length;j++)
        {
            sum=sum+nums[j];
            max=Math.max(sum,max);
           
            if(sum<0)
            sum=0;
        }
        return max;
        
    }
}