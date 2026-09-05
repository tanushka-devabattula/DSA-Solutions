import static java.lang.Math.*;
class Solution {
    public static int findClosest(int[] arr, int val) {
    
    int l = 0;
          int r = arr.length - 1;

          while (l <= r) {
              int mid = (l + r) / 2;

              if (arr[mid] == val)
                  return val;

              if (arr[mid] > val)
                  r = mid - 1;
              else
                  l = mid + 1;
          }

          if (l == arr.length)
              return arr[r];

          if (r < 0)
              return arr[l];
              
          
         

          if (Math.abs(arr[l] - val) <= Math.abs(arr[r] - val))
              return arr[l];

          return arr[r];
    
    }
}
