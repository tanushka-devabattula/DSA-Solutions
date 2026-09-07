class Solution {
    public int findCeil(int[] arr, int x) {
        int n=arr.length;
        int ans=-1;
        int l=0,r=n-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                r=mid-1;
            }
            else
            l=mid+1;
        }
        
     return ans;
        
    }
}
