class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
               
            int product=1;
            for(int j=i;j<nums.length;j++)
            {
                int var=nums[j];
                product*=nums[j];
                max=Math.max(product, max); 
                max=Math.max(max,var);
            }
        }
        return max;
    }
}