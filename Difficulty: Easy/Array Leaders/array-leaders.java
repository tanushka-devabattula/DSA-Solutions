class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
       ArrayList<Integer>res=new ArrayList<>();
       int max=arr[arr.length-1];
       for(int i=arr.length-2;i>=0;i--)
       {
           if(arr[i]>=max)
           {
                res.add(max);
               max=arr[i];
              
           }
       }
        res.add(max);
       Collections.reverse(res);
       return res;
    }
}
