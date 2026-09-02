class Solution {
    public int maxProduct(int[] nums) {
       int max=Integer.MIN_VALUE;
       int prefix=1,suffix=1;
       for(int num:nums)
       {
        prefix*=num;
        max=Math.max(prefix,max);
        
        if(prefix==0)
        prefix=1;

       }
       for(int i=nums.length-1;i>=0;i--)
       {
        suffix*=nums[i];
          max=Math.max(suffix,max);
           
        if(suffix==0)
        suffix=1;


       }
return max;
    }
}