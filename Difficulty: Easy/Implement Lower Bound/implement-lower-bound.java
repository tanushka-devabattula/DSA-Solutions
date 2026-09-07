class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length-1;
        int l=0,r=n;
        int m=n+1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]>=target)
          {
              m=mid;
             r=mid-1;
          }
            else 
            l=mid+1;
          
            
        }
    
  return m;
    }
}
