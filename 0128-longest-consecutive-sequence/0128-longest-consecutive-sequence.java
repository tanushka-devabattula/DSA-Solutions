class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
      
        for(int num:set)
        {
            int count=0;
            if(!set.contains(num-1))     
        for(int i=num;set.contains(i);i++)
        {
           
                count++;
                max=Math.max(count, max);

          
        }
        }
        return max;
    }
}