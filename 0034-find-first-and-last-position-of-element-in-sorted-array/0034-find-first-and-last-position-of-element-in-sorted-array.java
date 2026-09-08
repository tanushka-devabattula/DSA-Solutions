class Solution {
    public int[] searchRange(int[] nums, int target) {
     
       int lower=-1;
       int upper=-1;
     
       int l=0,r=nums.length-1;
       
       while(l<=r)
       {
         int mid=l+(r-l)/2;
         if(nums[mid]<=target)
         {
            if(nums[mid]==target)
            upper=mid;
             l=mid+1;
           
         }
         else
          r=mid-1;
 
       }
       l=0;
       r=nums.length-1;

        while(l<=r)
       {
         int mid=l+(r-l)/2;
         if(nums[mid]>=target)
         {
             if(nums[mid]==target)
           lower=mid;
              r=mid-1;
          
         }
         else
           l=mid+1;
 
       }

      
       return new int[]{lower, upper};
    }
}