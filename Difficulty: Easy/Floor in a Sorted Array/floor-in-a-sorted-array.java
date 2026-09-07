class Solution {
    static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int l=0,h=n-1;
       int a=-1;
       
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]<=x)
            {
                a=mid;
                l=mid+1;
            }
            else 
            h=mid-1;
        }
       
        return a;
    }
}
