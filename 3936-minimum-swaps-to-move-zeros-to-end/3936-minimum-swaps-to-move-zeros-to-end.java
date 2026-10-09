class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0,j=nums.length-1;
        int count=0;
        while(i<=j)
        {
           if(nums[i]==0 && nums[j]!=0)
           {
            count++;
            i++;
            j--;

           }

           else  if(nums[i]==0 && nums[j]==0)
           
            j--;
           

           else 
           i++;
        }
        return count;
    }
}