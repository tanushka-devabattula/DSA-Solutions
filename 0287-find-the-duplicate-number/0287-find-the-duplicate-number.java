class Solution {
    public int findDuplicate(int[] a) {
      Arrays.sort(a);
      for(int i=0;i<a.length-1;i++)
      if(a[i]==a[i+1])
        return a[i];
        return a[0];
    }
}