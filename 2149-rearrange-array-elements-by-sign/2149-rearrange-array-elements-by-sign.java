class Solution {
    public int[] rearrangeArray(int[] nums) {
        int x=0,y=1;
      int[] res=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>0)
        {
            res[x]=nums[i];
            x+=2;

        }
        else
        {
            res[y]=nums[i];
            y+=2;
        }
       
      }

      return res;
    }
}