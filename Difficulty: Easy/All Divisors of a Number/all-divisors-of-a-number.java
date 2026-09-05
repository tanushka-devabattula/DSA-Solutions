class Solution {
	public ArrayList<Integer> getDivisors(int n) {
		ArrayList<Integer>res = new ArrayList<>();
		if(n==1)
		{
		    res.add(1);
		    return res;
		}
		for (int i = 1; i <= Math.sqrt(n); i++)
		{
			if (n%i == 0)
			{
			    	res.add(i);
			    	if(!res.contains(n/i))
			    	res.add(n/i);
			}
			
		}
		res.sort(null);
		return res;
	}
}
