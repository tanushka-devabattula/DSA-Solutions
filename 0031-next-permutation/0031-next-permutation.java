class Solution {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int [] arr,int i,int j)
    {
        while(i<j)
        {
           swap(arr,i,j);
           i++;
           j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
    
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1)
        {
            reverse(nums,0,nums.length-1);
            return ;
        }
            for(int j=nums.length-1;j>pivot;j--)
            {
                if(nums[j]>nums[pivot])
                {
                swap(nums,pivot,j);
                break;
                }
              
            }
           
        reverse(nums,pivot+1,nums.length-1);
    }
}