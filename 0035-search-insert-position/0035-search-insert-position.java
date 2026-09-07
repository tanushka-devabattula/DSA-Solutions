class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=nums.length;
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]>=target)
            {
              ans=mid;
              h=mid-1;
            }
           
            else l=mid+1;
        }
        return ans;

        
    }
}