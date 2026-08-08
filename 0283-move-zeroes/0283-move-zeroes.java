class Solution {
    public void moveZeroes(int[] arr) {
        int i=0,j=1;
        while(j<arr.length)
        {
            if(arr[i]!=0)
            i++;
            if(arr[i]==0 && arr[j]!=0)
            {
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
           
            j++;
        }
        
    }
}