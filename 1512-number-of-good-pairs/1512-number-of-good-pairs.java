class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0,pairs=0;
        HashMap<Integer,Integer>map=new HashMap<>();
       for(int num:nums)
       {
         map.put(num,map.getOrDefault(num,0)+1);
       }
         for(int key:map.keySet())
      {
        if(map.get(key)>1)
        {
            count=map.get(key);
         pairs+=(count-1)* (count)/2;
        }
      }

    
    return pairs;
    }
}