class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
         int flag=-1;
        while(low<=high)
        {
           
                int mid=low+(high-low)/2;
                if(nums[mid]==target)
               {
                 flag=mid;
                 break;
               }
                else if(nums[mid]<target)
                {
                    low=mid+1;
                }
                else 
                high=mid-1;
        }
       
        return flag;
    }
}