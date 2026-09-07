class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length-1;
        int ans=n+1;
        int l=0,r=n;
        while(l<=r)
        
        {
            int mid=l+(r-l)/2;
            if(arr[mid]<=target)
            {
                ans=mid;
                l=mid+1;
            }
            
            else
            r=mid-1;
        }
        
        return ans+1;
    }
}
